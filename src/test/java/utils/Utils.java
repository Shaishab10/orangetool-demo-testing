package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {

    public static void saveEmployeeInfo(String firstName, String lastName, String username, String password) throws IOException, ParseException {
        String file ="./src/test/resources/employees.json";
        JSONParser jsonParser =new JSONParser();
        JSONArray empArray = (JSONArray) jsonParser.parse(new FileReader(file));
        JSONObject empObj = new JSONObject();
        empObj.put("firstName", firstName);
        empObj.put("lastName", lastName);
        empObj.put("username", username);
        empObj.put("password", password);

        empArray.add(empObj);

        FileWriter writer =new FileWriter(file);
        writer.write(empArray.toJSONString());
        writer.flush();
        writer.close();
    }

    public static JSONArray readEmployeeInfo() throws IOException, ParseException {
        String file ="./src/test/resources/employees.json";
        JSONParser jsonParser =new JSONParser();
        JSONArray empArray = (JSONArray) jsonParser.parse(new FileReader(file));

        return empArray;
    }
}
