// MobileFinancialReport.java
import java.io.FileWriter;
import java.io.IOException;

public class MobileFinancialReport implements Report {
    @Override
    public void generate(String customText) throws IOException {
        String filename = "Mobile_Financial_Report.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Mobile Financial Report Content\n\n");
            writer.write("Стандартний вміст: дохід від мобільних програм, покупок у програмі, монетизація реклами...\n");
            writer.write("Custom Input: " + customText + "\n");
            System.out.println("Mobile Financial Report saved to " + filename);
        }
    }
}
