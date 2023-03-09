package com.app.foody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.app.foody.models.FoodRecipe
import com.app.foody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(var foodRecipe: FoodRecipe) {

    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

}