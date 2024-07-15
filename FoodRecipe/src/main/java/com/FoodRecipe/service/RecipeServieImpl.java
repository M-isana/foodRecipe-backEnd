package com.FoodRecipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.FoodRecipe.model.Recipe;
import com.FoodRecipe.repository.RecipeRepository;

@Service(value = "RecipeService")
@Transactional
public class RecipeServieImpl implements RecipeService {

	@Autowired
	RecipeRepository recipeRepository;

	@Override
	public List<Recipe> getAllRecipes() {
		List<Recipe> list = recipeRepository.findAll();
		return list;
	}

	@Override
	public void addRecipe(Recipe recipe) {
		recipeRepository.save(recipe);
	}

}
