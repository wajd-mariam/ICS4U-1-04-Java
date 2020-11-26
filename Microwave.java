/*
* Copyright (c) 2020
*
* This program calculates the time required to heat food 
* in a microwave.
* @author  Wajd Mariam
* @version 1.0
* @since   2020/11/25
*/

// imports scanner class.
import java.util.Scanner; 

public class Microwave {
  /**
   * This function calculates the time it takes to reheat
   * a specific kind of food depending on its quantity.
   */
  public static void main(String[] args) {

    // Declaring Constants and Variables:
    final float subCookingTime = 1;
    final float pizzaCookingTime = 0.75f;
    final float soupCookingTime = 1.75f;
    
    // Input 
    // Try Catch 
    try {
      // Getting Food Type:
      Scanner input1 = new Scanner(System.in);
      System.out.println("What type of food do you want to heat? [sub], [pizza], [soup]:");
      String foodType = input1.nextLine();
      
      // Getting quantity of food type selected:
      Scanner input2 = new Scanner(System.in);
      System.out.println("How many " + foodType + " do you want to heat?");
      int quantityNumber = input2.nextInt();
      
      // Process and Outputs
      // Sub Cooking Time:
      if ((quantityNumber <= 3) && (quantityNumber >= 1)) {
        if (foodType.equals("sub") || (foodType.equals("Sub")) || (foodType.equals("SUB"))) {
          float cookingTime = subCookingTime + (0.5f * subCookingTime * (quantityNumber - 1));
          System.out.println("Your sub will be reheated in " + cookingTime + " minutes."); 
        // Pizza Cooking Time:
        } else if (foodType.equals("pizza") || (foodType.equals("Pizza"))
                                    || (foodType.equals("PIZZA"))) {
          float cookingTime = pizzaCookingTime + (0.5f * pizzaCookingTime * (quantityNumber - 1));
          System.out.println("Your pizza will be reheated in " + cookingTime + " minutes.");
          
        // Soup Cooking Time:
        } else if (foodType.equals("soup") || (foodType.equals("Soup"))
                                    || (foodType.equals("SOUP"))) {
          float cookingTime = soupCookingTime + (0.5f * soupCookingTime * (quantityNumber - 1));
          System.out.println("Your soup will be reheated in " + cookingTime + " minutes."); 
        }
      }
    } catch (Exception e) {
      System.out.println();
      System.out.println("An error occurred");
    }
  }
}