//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Iterator;
//
//public class readJSON {
//  public static void main(String[] args) {
//    JSONParser parser = new JSONParser();
//
//    try {
//      Object obj = parser.parse(new FileReader("input.json")); //read data
//      JSONObject jsonObject = (JSONObject) obj; //work into JSON object
//      JSONArray team = (JSONArray) jsonObject.get("team");
//      //System.out.println("Team is: " + team);
//
//      JSONArray attributes = (JSONArray) jsonObject.get("attributes");
//      Iterator<String> iterator = attributes.iterator();
//
//      while(iterator.hasNext()) {
//        System.out.println("Team is: " + iterator.hasNext());
//      }
//      System.out.println(attributes);
//      String info = (String) team.get(Integer.parseInt("attributes"));
//      System.out.println(info);
//
//      JSONArray applicants = (JSONArray) jsonObject.get("applicants");
//      //System.out.println("Applications are: " + applicants);
//      //loop array
////      JSONArray coursesArray = (JSONArray) jsonObject.get("name");
////      Iterator<String> iterator = coursesArray.iterator();
////
////      while(iterator.hasNext()) {
////        System.out.println("Course: " + iterator.next());
////      }
//
//    }
//    catch(FileNotFoundException e) { e.printStackTrace(); }
//    catch(IOException e) { e.printStackTrace(); }
//    catch(ParseException e) { e.printStackTrace(); }
//    catch(Exception e) { e.printStackTrace(); }
//  }
//}
