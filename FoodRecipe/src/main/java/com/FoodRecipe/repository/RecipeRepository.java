package com.FoodRecipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodRecipe.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer>{

	
}
