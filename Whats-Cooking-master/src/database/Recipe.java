package database;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.image.Image;
/**
 * Class that represents a recipe, and has 
 * an Arraylist that can contain a list of recipe titles. 
 * Class has a constructor that sets all om the recipe variables, 
 * one that set them all exept the image. 
 * Class also contains separete getters and setters for all variables. 
 * 
 * @author Sofia Larsson 
 * @author Sanna Rönngård 
 */

public class Recipe implements Serializable {
	public static ArrayList<String> recipeNameList = new ArrayList<String>();
	private static ArrayList<String> ingredientList = new ArrayList<String>();
	public static String title;
	private static String prepTime;
	private static String instructions;
	private static String measure;
	private int matchInt;
	private Image recipeImage;
	/**
	 * A recipe that has no image. 
	 * @param title
	 * @param prepTime
	 * @param content
	 */
	public Recipe(){
		
	}
	public Recipe(String title, String prepTime, String instructions){
		this.title = title;
		this.prepTime = prepTime;
		this.instructions = instructions;
	}
	/**
	 * A recipe that contains all varibles.
	 * @param sender
	 * @param message
	 * @param picture
	 * @param serverTime
	 */
	public Recipe(String title, String prepTime, String instructions, Image recipeImage){
		this.title = title;
		this.prepTime = prepTime;
		this.instructions = instructions;
		this.recipeImage = recipeImage;
	}
	/*********************************/
	/*      Setters and getters      */
	/*********************************/
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setPrepTime(String prepTime){
		this.prepTime = prepTime;
	}
	public String getPrepTime(){
		return this.prepTime;
	}
	public void setMeasure(String measure){
		this.measure = measure;
	}
	public String getMeasure(){
		return this.measure;
	}
	public void setInstructions(String instructions){
		this.instructions = instructions;
	}
	public String getInstructions(){
		return this.instructions;
	}
	public int getMatchInt() {
		return this.matchInt;
	}
	public void setRecipeImage(Image recipeImage){
		this.recipeImage = recipeImage;
	}
	public Image getRecipeImage(){
		return recipeImage;
	}
	// Setting recipe titles to list
	public void setRecipeNameToList(String name) {
		recipeNameList.add(name);
	}
	// Getting all ingredients assigned to the recipe. Returns av array of the ingredients
	public String[] getRecipeNameList() {
		String[] nameArray = new String[recipeNameList.size()];
		recipeNameList.toArray(nameArray);
		return nameArray;
	}

	// Setting ingredients to a recipe
	public static void setIngredientToList(String ingredient) {
		ingredientList.add(ingredient);
	}
	public static void removeIngredientFromList(String ingredient) {
		if (ingredientList.contains(ingredient)) {
			ingredientList.remove(ingredient);
		}
		
	}
	// Getting all ingredients assigned to the recipe. Returns av array of the ingredients
	public static String[] getIngredientArray() {
		String[] ingredientArray = new String[ingredientList.size()];
		ingredientList.toArray(ingredientArray);
		return ingredientArray;
	}
	
}
