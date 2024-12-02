// WebMarketingReport.java
import java.io.FileWriter;
import java.io.IOException;

public class WebMarketingReport implements Report {
    @Override
    public void generate(String customText) throws IOException {
        String filename = "Web_Marketing_Report.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Web Marketing Report Content\n\n");
            writer.write("Стандартний вміст: SEO-аналіз, ефективність вмісту, демографія аудиторії...\n");
            writer.write("Custom Input: " + customText + "\n");
            System.out.println("Web Marketing Report saved to " + filename);
        }
    }
}

