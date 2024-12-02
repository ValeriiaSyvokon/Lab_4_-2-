// DesktopFinancialReport.java
import java.io.FileWriter;
import java.io.IOException;

public class DesktopFinancialReport implements Report {
    @Override
    public void generate(String customText) throws IOException {
        String filename = "Desktop_Financial_Report.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Desktop Financial Report Content\n\n");
            writer.write("Стандартний вміст: дохід, витрати, прибуток...\n");
            writer.write("Custom Input: " + customText + "\n");
            System.out.println("Desktop Financial Report saved to " + filename);
        }
    }
}
