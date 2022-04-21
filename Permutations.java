package Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
  private String input;
  private List<String> permutationsList = new ArrayList<>();
  
  public Permutations(String input) {
    this.input = input;
  }
  
  //permutate call
  public void permutate() {
    if(input.equals("")) {
      return;
    } else {
      permutate("", input, 0);
    }
    return;
  }
  
  //permutate helper method. This recursively calculate permutations of the input string.
  //Characters are shifted from the input string to the output string after each call.
  //The index ensures that a branch is created for each character in the String, and it is
  //incremented until it is equivalent to the final index of the input string.
  //After a character is moved from the input to the output string, the index is reset to 0.
  private void permutate(String outputString, String inputString, int index) {
    if(inputString.equals("") == false) {
      if(index < inputString.length()-1){
        permutate(outputString, inputString, index + 1);
      }
      outputString = outputString + inputString.substring(index, index + 1); //extract 1 charcter per index
      inputString = inputString.substring(0,index) + inputString.substring(index + 1); //remove extracted character from temp 2
      permutate(outputString, inputString, 0);
      return;
    } else {
      permutationsList.add(outputString);
      return;
    } 
    
  }
  
  public int getNumPermutations() {
    return permutationsList.size();
  }
  
  //toString call
  public String toString() {
    return toString(permutationsList, 0);
  }
  
  //toString helper method. Retrieve permutation list and separate values with a new line
  private String toString(List <String> list, int index) {
    if (index == list.size() - 1) {
      return list.get(index);
    } else {
      return list.get(index) + "\n" + toString(list, index + 1);
    }
    
  }
}

