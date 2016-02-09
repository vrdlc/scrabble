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
  public void scrabbleScore_returnsAScrabbleScoreForValue1_9() {
    Scrabble scrabble = new Scrabble();
    Integer score = 9;
    assertEquals(score, scrabble.scrabbleScore("e,i,o,u,l,n,r,s,t"));
  }
  @Test
  public void scrabbleScore_returnsAScrabbleScoreForValue2_4() {
    Scrabble scrabble = new Scrabble();
    Integer score = 4;
    assertEquals(score, scrabble.scrabbleScore("d,g"));
  }
  @Test
  public void scrabbleScore_returnsAScrabbleScoreForValue3_12() {
    Scrabble scrabble = new Scrabble();
    Integer score = 12;
    assertEquals(score, scrabble.scrabbleScore("b,c,m,p"));
  }
  @Test
  public void scrabbleScore_returnsAScrabbleScoreForValue4_4() {
    Scrabble scrabble = new Scrabble();
    Integer score = 20;
    assertEquals(score, scrabble.scrabbleScore("f, h, v, w, y"));
  }
}
