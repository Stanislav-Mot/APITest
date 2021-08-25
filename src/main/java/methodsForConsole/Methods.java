package methodsForConsole;

import com.google.gson.JsonParser;
import io.restassured.response.Response;

public class Methods {

    public static String getResult(Response response) {
        String result = response.getBody().asString();
        System.out.println(result);
        return result;
    }

    public static long getId(String body) {
        JsonParser parser = new JsonParser();
        long id = parser.parse(body).getAsJsonObject().get("id").getAsLong();
        return id;
    }

    public static int getSold(String body) {
        JsonParser parser = new JsonParser();
        int sold = parser.parse(body).getAsJsonObject().get("sold").getAsInt();
        return sold;
    }
}
