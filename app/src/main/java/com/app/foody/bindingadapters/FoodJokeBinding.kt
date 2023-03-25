package com.app.foody.bindingadapters

import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.app.foody.data.database.entities.FoodJokeEntity
import com.app.foody.models.FoodJoke
import com.app.foody.util.NetworkResult
import com.google.android.material.card.MaterialCardView

class FoodJokeBinding {

    companion object {

        @BindingAdapter(
            "readApiResponseForCardAndProgressBar",
            "readDatabaseForCardAndProgressBar",
            requireAll = false
        )
        @JvmStatic
        fun setCardAndProgressVisibility(
            view: View,
            apiResponse: NetworkResult<FoodJoke>?,
            database: List<FoodJokeEntity>?
        ) {
            when (apiResponse) {
                is NetworkResult.Loading -> {
                    when (view) {
                        is ProgressBar -> {
                            view.visibility = View.VISIBLE
                        }
                        is MaterialCardView -> {
                            view.visibility = View.INVISIBLE
                        }
                    }
                }
                is NetworkResult.Error -> {
                    when (view) {
                        is ProgressBar -> {
                            view.visibility = View.INVISIBLE
                        }
                        is MaterialCardView -> {
                            view.visibility = View.VISIBLE
                            if (database.isNullOrEmpty()) {
                                view.visibility = View.INVISIBLE
                            }
                        }
                    }
                }
                is NetworkResult.Success -> {
                    when (view) {
                        is ProgressBar -> {
                            view.visibility = View.INVISIBLE
                        }
                        is MaterialCardView -> {
                            view.visibility = View.VISIBLE
                        }
                    }
                }
                else -> {}
            }
        }

        @BindingAdapter("readApiResponseForError", "readDatabaseForError", requireAll = true)
        @JvmStatic
        fun setErrorViewsVisibility(
            view: View,
            apiResponse: NetworkResult<FoodJoke>?,
            database: List<FoodJokeEntity>?
        ) {
            if (!database.isNullOrEmpty()) {
                view.visibility = View.VISIBLE
                if (view is TextView) {
                    if (apiResponse != null) {
                        view.text = apiResponse.message.toString()
                    }
                }
            }
            if (apiResponse is NetworkResult.Success) {
                view.visibility = View.VISIBLE
            }
        }

    }

}