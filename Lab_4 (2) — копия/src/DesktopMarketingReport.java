// DesktopMarketingReport.java
import java.io.FileWriter;
import java.io.IOException;

public class DesktopMarketingReport implements Report {
    @Override
    public void generate(String customText) throws IOException {
        String filename = "Desktop_Marketing_Report.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Desktop Marketing Report Content\n\n");
            writer.write("Стандартний вміст: ефективність кампанії, охоплення аудиторії, рентабельність інвестицій...\n");
            writer.write("Custom Input: " + customText + "\n");
            System.out.println("Desktop Marketing Report saved to " + filename);
        }
    }
}
