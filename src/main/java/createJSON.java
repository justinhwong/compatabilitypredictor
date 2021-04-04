//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class createJSON {
//  public static void main(String[] args) {
//    JSONObject obj = new JSONObject();
//    //team
//    JSONArray list = new JSONArray();
//    JSONObject info = new JSONObject();
//    info.put("name", "Eddie");
//    JSONObject attr = new JSONObject();
//    attr.put("strength", 5);
//    attr.put("endurance", 3);
//    attr.put("spicyFoodTolerance", 1);
//    attr.put("intelligence", 1);
//    info.put("attributes", attr);
//    list.add(info);
//
//    //team2
//    JSONObject info2 = new JSONObject();
//    info2.put("name", "Will");
//    JSONObject attr2 = new JSONObject();
//    attr2.put("strength", 9);
//    attr2.put("endurance", 4);
//    attr2.put("spicyFoodTolerance", 1);
//    attr2.put("intelligence", 6);
//    info2.put("attributes", attr2);
//    list.add(info2);
//
//    //applicants
//    JSONArray list2 = new JSONArray();
//    JSONObject info3 = new JSONObject();
//    info3.put("name", "Will");
//    JSONObject attr3 = new JSONObject();
//    attr3.put("strength", 9);
//    attr3.put("endurance", 4);
//    attr3.put("spicyFoodTolerance", 1);
//    attr3.put("intelligence", 6);
//    info3.put("attributes", attr3);
//    list2.add(info3);
//
//    obj.put("team", list);
//    obj.put("applicants", list2);
//
//
//
//
//
//    try (FileWriter file = new FileWriter("inputTest.json")) {
//      file.write(obj.toString());
//      file.flush();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    System.out.println(obj);
//  }
//}
