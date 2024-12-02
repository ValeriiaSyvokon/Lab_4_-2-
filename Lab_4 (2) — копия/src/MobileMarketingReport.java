// MobileMarketingReport.java
import java.io.FileWriter;
import java.io.IOException;

public class MobileMarketingReport implements Report {
    @Override
    public void generate(String customText) throws IOException {
        String filename = "Mobile_Marketing_Report.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Mobile Marketing Report Content\n\n");
            writer.write("Стандартний вміст: ефективність реклами, рейтинг кліків, залучення користувачів...\n");
            writer.write("Custom Input: " + customText + "\n");
            System.out.println("Mobile Marketing Report saved to " + filename);
        }
    }
}
