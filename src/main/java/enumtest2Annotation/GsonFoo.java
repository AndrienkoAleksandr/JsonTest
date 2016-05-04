package enumtest2Annotation;

import enumtest.AttributeScope;
import enumtest.TruncateElement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GsonFoo {

    private static final String FILE_PATH = "input2.json";

    public static void main(String[] args) throws IOException {
        Card card = new Card(11, Card.Suit.CLUBS);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        Path pathToFile = Paths.get(FILE_PATH);

        if (Files.exists(pathToFile)) {
            Files.delete(pathToFile);
        }
        Files.createFile(pathToFile);

        String json = gson.toJson(card);
        try (FileWriter fileWriter = new FileWriter(FILE_PATH)) {
            fileWriter.append(json);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Card element = gson.fromJson(new FileReader(FILE_PATH), Card.class);

        System.out.println(element.getValue());
        System.out.println(element.getSuit().name());
    }
}
