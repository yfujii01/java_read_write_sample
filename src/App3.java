import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class App3 {
  public static void main(String[] args) throws Exception {
    new App3().execute();
  }

  private void execute() throws Exception {
    try (CSVReader reader = new CSVReader(Files.newBufferedReader(Paths.get("input.csv")));
        CSVWriter writer = new CSVWriter(Files.newBufferedWriter(Paths.get("output.csv")));) {

      // 伝統的な書き方
      // String[] nextLine;
      // while ((nextLine = reader.readNext()) != null) {
      //   writer.writeNext(nextLine);
      // }

      // foreachでの書き方
      for (String[] s : reader) {
        writer.writeNext(s);
      }

      // Lambdaでの書き方
      // reader.forEach(s -> {
      //   writer.writeNext(s);
      // });
    }
  }
}