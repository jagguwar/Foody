package com.app.foody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.app.foody.models.Result
import com.app.foody.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)