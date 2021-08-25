package body;

import com.google.gson.JsonObject;

import static properties.Properties.getProperties;

public class Body {

    public static String getBody() {

        JsonObject jsonObject = new JsonObject();
        String id = "id";
        String petId = "petId";
        String quantity = "quantity";
        String shipDate = "shipDate";
        String status = "status";
        String complete = "complete";

        jsonObject.addProperty(id, getProperties(id));
        jsonObject.addProperty(petId, getProperties(petId));
        jsonObject.addProperty(quantity, getProperties(quantity));
        jsonObject.addProperty(shipDate, getProperties(shipDate));
        jsonObject.addProperty(status, getProperties(status));
        jsonObject.addProperty(complete, getProperties(complete));

        return jsonObject.toString();
    }
}

