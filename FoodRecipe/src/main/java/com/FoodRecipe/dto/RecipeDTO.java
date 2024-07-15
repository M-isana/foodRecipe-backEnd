package com.FoodRecipe.dto;

import com.FoodRecipe.model.Recipe;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class RecipeDTO {

	@NotNull(message = "{RECIPE.ID_MANDATORY}")
	private Integer recipeID;

	@NotNull(message = "{RECIPE.NAME_MANDATORY}")
	@Pattern(regexp = "^[A-Z][a-z]+[(\\s)[A-Za-z]]+", message = "{RECIPE.NAME_REGEX}")
	private String recipeName;

	@NotNull(message = "{AUTHOR.NAME_MANDATORY}")
	@Pattern(regexp = "^[A-Z][a-z]+[(\\s)[A-Za-z]]+", message = "{AUTHOR.NAME_REGEX}")
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

	public RecipeDTO(Integer recipeID, String recipeName, String authorName) {
		super();
		this.recipeID = recipeID;
		this.recipeName = recipeName;
		this.authorName = authorName;
	}

	public RecipeDTO() {
		super();
	}

	@Override
	public String toString() {
		return "RecipeDTO [recipeID=" + recipeID + ", recipeName=" + recipeName + ", authorName=" + authorName + "]";
	}

	public static Recipe prepareRecipeEntity(RecipeDTO recipeDTO) {
		Recipe recipe = new Recipe();
		recipe.setRecipeID(recipeDTO.getRecipeID());
		recipe.setRecipeName(recipeDTO.getRecipeName());
		recipe.setAuthorName(recipeDTO.getAuthorName());
		return recipe;

	}

}
