import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class ReadJSON {

	public static void main(String[] args) {
		try {
			JsonParser parser = new JsonParser();//´´½¨JSON½âÎöÆ÷
			JsonObject object = (JsonObject) parser.parse(new FileReader("test.json"));
			System.out.println("cat=" + object.get("cat").getAsString());
			System.out.println("pop=" + object.get("pop").getAsBoolean());
			JsonArray jsonArray = object.get("language").getAsJsonArray();
			for (int i = 0; i < jsonArray.size(); i++) {
				System.out.println("----------------");
				JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();
				System.out.println("id=" + jsonObject.get("id").getAsInt());
				System.out.println("ide=" + jsonObject.get("ide").getAsString());
				System.out.println("name=" + jsonObject.get("name").getAsString());
				
			}
			
			
			
			
			
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
