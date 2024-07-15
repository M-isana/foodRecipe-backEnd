package com.FoodRecipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FoodRecipe.model.Recipe;
import com.FoodRecipe.service.RecipeService;

@RestController
@RequestMapping(value = "/recipe")
public class RecipeController {

	@Autowired
	RecipeService recipeService;

	@GetMapping(value = "/allrecipes")
	public ResponseEntity<List<Recipe>> getAllRecipes() {
		List<Recipe> allRecipes = recipeService.getAllRecipes();
		return new ResponseEntity<>(allRecipes, HttpStatus.OK);
	}
	
	@PostMapping(value = "/addRecipe")
	public ResponseEntity<Void> addRecipe(Recipe recipe){
		recipeService.addRecipe(recipe);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
}
