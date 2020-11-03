import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        new App().execute();
    }
    private void execute() throws Exception {
      Path inputPath = Paths.get("input.csv");
      List<String> readAllLines = Files.readAllLines(inputPath, Charset.forName("UTF-8"));

      List<String> writeAllLines = new ArrayList<String>();

      readAllLines.forEach(s->{
        writeAllLines.add(s);
      });

      Files.write(Paths.get("output.csv"), writeAllLines);
    }
}
