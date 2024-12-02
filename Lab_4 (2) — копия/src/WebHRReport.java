// WebHRReport.java
import java.io.FileWriter;
import java.io.IOException;

public class WebHRReport implements Report {
    @Override
    public void generate(String customText) throws IOException {
        String filename = "Web_HR_Report.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Web HR Report Content\n\n");
            writer.write("Стандартний вміст: Ефективність віддаленої роботи співробітників, Статистика співпраці...\n");
            writer.write("Custom Input: " + customText + "\n");
            System.out.println("Web HR Report saved to " + filename);
        }
    }
}
