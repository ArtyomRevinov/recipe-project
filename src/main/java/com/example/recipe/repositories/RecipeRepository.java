package com.example.recipe.repositories;

import com.example.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by revin on 16.02.2019.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {



}
