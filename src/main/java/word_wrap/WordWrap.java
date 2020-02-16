package word_wrap;

public class WordWrap {

  public String wrapText(int lineLength, String unformatedString) {
    StringBuilder sb = new StringBuilder();
    int strLen = unformatedString.length();

    int i = 0;
    while (i < strLen) {
      if(i % lineLength == 0 && i!=0) {
        //trigger this every nth times
        sb.append("\n");
      }
      sb.append(unformatedString.charAt(i));
      i++;
    }
    return sb.toString();

  }
}
