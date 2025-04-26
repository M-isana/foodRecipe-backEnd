package com.FoodRecipe.entity;

import com.FoodRecipe.dto.RecipeDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recipe_id")
	private Integer recipeID;
	@Column(name = "recipe_name")
	private String recipeName;
	@Column(name = "author_name")
	private String authorName;

	public Integer getRecipeID() {
		return recipeID;
	}

	public void setRecipeID(Integer recipeID) {
		this.recipeID = recipeID;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Recipe(Integer recipeID, String recipeName, String authorName) {
		super();
		this.recipeID = recipeID;
		this.recipeName = recipeName;
		this.authorName = authorName;
	}

	public Recipe() {
		super();
	}

	@Override
	public String toString() {
		return "Recipe [recipeID=" + recipeID + ", recipeName=" + recipeName + ", authorName=" + authorName + "]";
	}

	public static RecipeDTO prepareRecipeDTO(Recipe recipe) {
		RecipeDTO recipeDTO = new RecipeDTO();
		recipeDTO.setRecipeID(recipe.getRecipeID());
		recipeDTO.setRecipeName(recipe.getRecipeName());
		recipeDTO.setAuthorName(recipe.getAuthorName());
		return recipeDTO;

	}

}
