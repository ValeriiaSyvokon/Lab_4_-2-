// DesktopHRReport.java
import java.io.FileWriter;
import java.io.IOException;

public class DesktopHRReport implements Report {
    @Override
    public void generate(String customText) throws IOException {
        String filename = "Desktop_HR_Report.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Desktop HR Report Content\n\n");
            writer.write("Стандартний вміст: продуктивність співробітників, показники утримання, нові найми...\n");
            writer.write("Custom Input: " + customText + "\n");
            System.out.println("Desktop HR Report saved to " + filename);
        }
    }
}
