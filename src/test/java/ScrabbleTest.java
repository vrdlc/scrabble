import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    Scrabble scrabble = new Scrabble();
    Integer score = 1;
    assertEquals(score, scrabble.scrabbleScore("a"));
  }
  @Test
  public void scrabbleScore_returnsAScrabbleScoreForManyLetters_9() {
    Scrabble scrabble = new Scrabble();
    Integer score = 9;
    assertEquals(score, scrabble.scrabbleScore("e,i,o,u,l,n,r,s,t"));
  }

}
