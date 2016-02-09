import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class Scrabble {
  public static void main(String[] args) {
  String layout = "templates/layout.vtl";

  get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");

      return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

  get("/detector", (request, response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     model.put("template", "templates/detector.vtl");

     String userWord = request.queryParams("userWord");
    int score = scrabbleScore(userWord);

     model.put("userWord", score);
     return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());
  }


  public static Integer scrabbleScore(String userWord) {

    char[] scrabbleArray = userWord.toCharArray();
    int score = 0;
    for ( char letter : scrabbleArray) {
      if (letter == 'd' || letter == 'g'){
        score += 2;
      } else if (letter == 'b' || letter == 'c' || letter == 'm' || letter == 'p') {
        score += 3;
      } else if (letter == 'f' || letter == 'h' || letter == 'v' || letter == 'w' || letter == 'y') {
        score += 4;
      } else if (letter == 'k'){
        score += 5;
      } else if (letter == 'j' || letter == 'x') {
        score += 8;
      } else if (letter == 'q' || letter == 'z') {
        score += 10;
      } else {
        score += 1;
      }
    }

    return score;

  }
}
