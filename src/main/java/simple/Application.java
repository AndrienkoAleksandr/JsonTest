package simple;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * //
 *
 * @author Alexander Andrienko
 */
public class Application {

    private static final String JSON = "[  \n" +
                                       "   {  \n" +
                                       "      \"model\":\"Yaguar\",\n" +
                                       "      \"type\":\"Sedan\",\n" +
                                       "      \"amountWheels\":4,\n" +
                                       "      \"amountDoors\":4,\n" +
                                       "      \"engineInfo\":\"4 cylinders, 500 hoursepower\"\n" +
                                       "   }\n" +
                                       "]";

    private static final String JSON2 = "[  \n" +
                                        "   {  \n" +
                                        "      \"model\":\"Man\",\n" +
                                        "      \"type\":\"Big Wagon\",\n" +
                                        "      \"amountWheels\":6,\n" +
                                        "      \"amountDoors\":2,\n" +
                                        "      \"engineInfo\":\"8 cylinders, 1200 hoursepower\",\n" +
                                        "      \"trailer\":{  \n" +
                                        "         \"width\":15,\n" +
                                        "         \"weight\":3\n" +
                                        "      }\n" +
                                        "   }\n" +
                                        "]";

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().registerTypeAdapter(Trailer.class, new TrailerSerialization()).create();
        List<Car> list = gson.fromJson(JSON, new TypeToken<List<PassengerCar>>() {}.getType());
        List<Wagon> list2 = gson.fromJson(JSON2, new TypeToken<List<WagonImpl>>() {}.getType());
    }
}


