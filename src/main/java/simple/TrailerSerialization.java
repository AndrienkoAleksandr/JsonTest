package simple;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 * //
 *
 * @author Alexander Andrienko
 */
public class TrailerSerialization implements JsonSerializer<Trailer>, JsonDeserializer<Trailer> {
    public Trailer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        return jsonDeserializationContext.deserialize(jsonElement, TrailerImpl.class);
    }

    public JsonElement serialize(Trailer trailer, Type type, JsonSerializationContext jsonSerializationContext) {
        return jsonSerializationContext.serialize(trailer, TrailerImpl.class);
    }
}
