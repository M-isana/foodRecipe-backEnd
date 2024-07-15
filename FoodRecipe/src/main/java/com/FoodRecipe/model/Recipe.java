package com.FoodRecipe.model;

import java.time.LocalDate;

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
	private Integer recipeID;
	@Column(name = "recipe_name")
	private String recipeName;
	@Column(name = "recipeDate")
	private LocalDate recipeDate;
	@Column(name = "authorName")
	private String authorName;

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public LocalDate getRecipeDate() {
		return recipeDate;
	}

	public void setRecipeDate(LocalDate recipeDate) {
		this.recipeDate = recipeDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Recipe [recipeName=" + recipeName + ", recipeDate=" + recipeDate + ", authorName=" + authorName + "]";
	}

}
