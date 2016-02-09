import java.io.Console;

public class Scrabble {
  public static void main(String[] args) {
  // Console myConsole = System.console();
  //
  // System.out.println("Give me a word.");
  // String userWord = myConsole.readLine();
}
  public static Integer scrabbleScore(String userWord) {

    char[] scrabbleArray = userWord.toCharArray();
    Integer score = 0;
    for ( char letter : scrabbleArray) {
      if ( letter == 'a') {
        score += 1;
      }
    }
    System.out.println();
    return score;
  }
}
