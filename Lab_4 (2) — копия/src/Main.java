// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a platform: desktop, mobile, or web:");
        String platform = scanner.nextLine().toLowerCase();

        ReportFactory factory;
        switch (platform) {
            case "desktop":
                factory = new DesktopReportFactory();
                break;
            case "mobile":
                factory = new MobileReportFactory();
                break;
            case "web":
                factory = new WebReportFactory();
                break;
            default:
                System.out.println("Invalid platform. Please choose 'desktop', 'mobile', or 'web'.");
                return;
        }

        ReportGenerator generator = new ReportGenerator(factory);

        System.out.println("Choose a report type: financial, marketing, or hr:");
        String reportType = scanner.nextLine().toLowerCase();

        generator.generateReport(reportType);
    }
}
