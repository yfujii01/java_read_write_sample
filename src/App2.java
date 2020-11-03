import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App2 {
  public static void main(String[] args) throws Exception {
    new App2().execute();
  }

  private void execute() throws Exception {
    try (BufferedReader in = Files.newBufferedReader(Paths.get("input.csv"));
        BufferedWriter ou = Files.newBufferedWriter(Paths.get("output.csv"));) {
      String line;

      while ((line = in.readLine()) != null) {
        ou.write(line);
        ou.newLine();
      }
    }
  }
}
