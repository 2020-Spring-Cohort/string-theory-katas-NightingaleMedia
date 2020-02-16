package translating_names;

import static java.lang.String.valueOf;

public class NameChanger {

  public void setInput(String input) {
    this.input = input;
  }

  public String getInput() {
    return input;
  }

  public String input;



  public String translateToSnakeCase() {
    insertUnderscore(input);
    removeOrReplaceSpace(input);
    translateToLower(input);
    String output = getInput();
    return output;
  }


  public String insertUnderscore(String input){
    this.input = input.replaceAll("(.)([A-Z|\\s])","$1_$2");
    return input;

  }

  public String removeOrReplaceSpace(String input){
    this.input = input.replaceAll(" ", "");
    return input;
  }

  public String translateToLower(String input){
    this.input = input.toLowerCase();
    System.out.println(this.input);
    return input;
  }
}
