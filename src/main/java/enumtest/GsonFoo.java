package enumtest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonFoo {
    private static final String FILE_PATH = "input.json";

    public static void main(String[] args) throws Exception {
        TruncateElement tr = new TruncateElement();
        tr.lower = 11;
        tr.upper = 90;
        tr.scope = Arrays.asList(AttributeScope.DESCRIPTION, AttributeScope.TITLE);
        tr.delimiter = "some text";

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(AttributeScope.class, new AttributeScopeAdapter());
        Gson gson = gsonBuilder.create();

        Path pathToFile = Paths.get(FILE_PATH);

        if (Files.exists(pathToFile)) {
            Files.delete(pathToFile);
        }
        Files.createFile(pathToFile);

        String json = gson.toJson(tr);
        try (FileWriter fileWriter = new FileWriter(FILE_PATH)) {
            fileWriter.append(json);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        TruncateElement element = gson.fromJson(new FileReader(FILE_PATH), TruncateElement.class);

        System.out.println(element.lower);
        System.out.println(element.upper);
        System.out.println(element.delimiter);
        System.out.println(element.scope.get(0).getScope());
        System.out.println(element.scope.get(1).getScope());
    }
}




