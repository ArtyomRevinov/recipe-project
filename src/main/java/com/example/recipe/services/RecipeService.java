package com.example.recipe.services;

import com.example.recipe.domain.Recipe;

import java.util.Set;

/**
 * Created by revin on 16.02.2019.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
