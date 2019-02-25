package com.example.recipe.services;

import com.example.recipe.commands.IngredientCommand;

public interface IngredientService {


    void deleteById(Long recipeId, Long ingredientId);

    IngredientCommand findByRecipeIdAndIngredientId(long recipeId, long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
