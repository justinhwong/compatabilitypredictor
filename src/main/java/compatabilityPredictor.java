import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

// Grab all the names from the json file, grab all the integers from each attribute.
// Average out all the attribute values for the team
// Grab info from applicants and get their averages
// Divide applicants by team, and that
public class compatabilityPredictor {
  public static void main(String[] args) {
    JSONParser parser = new JSONParser();
    try {
      Object obj = parser.parse(new FileReader("input.json")); // read data
      JSONObject jsonObject = (JSONObject) obj; // work into JSON object
      JSONArray team = (JSONArray) jsonObject.get("team"); // grab team info form array
      System.out.println("Team is: " + team);
//      JSONArray teamNames = (JSONArray) jsonObject.get("name");
//      Iterator<String> iterator = teamNames.iterator();
//
//      while(iterator.hasNext()) {
//        System.out.println("teamName: " + iterator.next());
//      }

      JSONArray applicants = (JSONArray) jsonObject.get("applicants"); // grab applicant's info
      System.out.println("Applications are: " + applicants);

      JSONObject attributes = (JSONObject) team.get("attributes");
      for(int i = 0; i < team.length(); i++) {
        JSONObject name = team.getJSONObject(i);
        System.out.println("test: " + name);
      }
      int intelligence = (int) attributes.get(Integer.parseInt("intelligence"));
      int strength = (int) (long) attributes.get("strength");
      int endurance = (int) (long) attributes.get("endurance");
      int spicyFoodTolerance = (int) (long) attributes.get("spicyFoodTolerance");

      System.out.println("Int: " + intelligence);
      System.out.println("Str: " + strength);
      System.out.println("End: " + endurance);
      System.out.println("SPI: " + spicyFoodTolerance);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
