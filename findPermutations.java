package Permutations;

import java.util.Scanner;

public class findPermutations {
  
  public static String getInputString() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String input = scnr.nextLine();
    while (input == "") {
      System.out.println("Empty string is invalid.  Please re-enter the input string:");
      input = scnr.nextLine();
    }
    return input;
    
  }
  
  
  public static void main(String[] args) {
    String input = getInputString();
    Permutations permutedString = new Permutations(input);
    permutedString.permutate();
    System.out.println(permutedString.toString());
    System.out.println("Number of Permutations: " + permutedString.getNumPermutations());
    
    
  }

}
