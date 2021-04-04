import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class output {
  public static void main(String[] args) { 
    JSONObject obj = new JSONObject();
    JSONArray list = new JSONArray();
    JSONObject name1 = new JSONObject();
    JSONObject name2 = new JSONObject();
    JSONObject name3 = new JSONObject();
    JSONObject score = new JSONObject();
    name1.put("name", "John");
    name1.put("score", score);
    name2.put("name", "Jane");
    name2.put("score", score);
    name3.put("name", "Joe");
    name3.put("score", score);
    list.add(name1);
    list.add(name2);
    list.add(name3);
    String[] team
    obj.put("scoredApplicants", list);

    try (FileWriter file = new FileWriter("Output.json")) {
      file.write(obj.toString());
      file.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(obj);
  }
}

