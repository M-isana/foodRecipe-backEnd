package com.FoodRecipe.dto;

import jakarta.persistence.Column;

public class RecipeDTO {

	private Integer recipeID;

	private String recipeName;

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

}
