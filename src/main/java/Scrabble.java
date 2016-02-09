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
      if ( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'r' || letter == 'l' || letter == 'n' || letter == 's' || letter == 't') {
        score += 1;
      } else if (letter == 'd' || letter == 'g'){
        score +=2;
      } else if (letter == 'b' || letter == 'c' || letter == 'm' || letter == 'p') {
        score +=3;
      } else if (letter == 'f' || letter == 'h' || letter == 'v' || letter == 'w' || letter == 'y') {
        score +=4;
      } else if (letter == 'k'){
        score +=5;
      }
    }
    System.out.println();
    return score;

  }
}
