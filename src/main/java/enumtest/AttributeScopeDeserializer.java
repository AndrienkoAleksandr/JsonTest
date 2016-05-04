package enumtest;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class AttributeScopeDeserializer implements JsonDeserializer<AttributeScope>, JsonSerializer<AttributeScope> {
    @Override
    public AttributeScope deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
//        String scope = json.getAsString();
        String scope = json.getAsJsonObject().get("value").getAsString();
        return AttributeScope.fromScope(scope);
    }

    @Override
    public JsonElement serialize(AttributeScope attributeScope, Type type, JsonSerializationContext context) {
        //        return context.serialize(attributeScope.getScope());
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("value", attributeScope.getScope());
        return jsonObject;
    }
}