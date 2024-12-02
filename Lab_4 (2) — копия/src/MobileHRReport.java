// MobileHRReport.java
import java.io.FileWriter;
import java.io.IOException;

public class MobileHRReport implements Report {
    @Override
    public void generate(String customText) throws IOException {
        String filename = "Mobile_HR_Report.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Mobile HR Report Content\n\n");
            writer.write("Стандартний вміст: задоволеність працівників, вплив мобільних додатків на робоче середовище...\n");
            writer.write("Custom Input: " + customText + "\n");
            System.out.println("Mobile HR Report saved to " + filename);
        }
    }
}
