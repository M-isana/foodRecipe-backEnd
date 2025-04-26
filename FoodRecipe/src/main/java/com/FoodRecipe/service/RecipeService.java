package com.FoodRecipe.service;

import java.util.List;

import com.FoodRecipe.entity.Recipe;

public interface RecipeService {

	List<Recipe> getAllRecipes();
	
	void addRecipe(Recipe recipe);
	
}
