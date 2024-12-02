// WebFinancialReport.java
import java.io.FileWriter;
import java.io.IOException;

public class WebFinancialReport implements Report {
    @Override
    public void generate(String customText) throws IOException {
        String filename = "Web_Financial_Report.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Web Financial Report Content\n\n");
            writer.write("Стандартний вміст: дохід від онлайн-реклами, моделі підписки, партнерські програми...\n");
            writer.write("Custom Input: " + customText + "\n");
            System.out.println("Web Financial Report saved to " + filename);
        }
    }
}
