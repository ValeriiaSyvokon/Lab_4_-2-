// ReportGenerator.java
import java.io.IOException;
import java.util.Scanner;

public class ReportGenerator {
    private final ReportFactory reportFactory;

    public ReportGenerator(ReportFactory reportFactory) {
        this.reportFactory = reportFactory;
    }

    public void generateReport(String reportType) {
        Scanner scanner = new Scanner(System.in);
        Report report;

        try {
            switch (reportType.toLowerCase()) {
                case "financial":
                    report = reportFactory.createFinancialReport();
                    break;
                case "marketing":
                    report = reportFactory.createMarketingReport();
                    break;
                case "hr":
                    report = reportFactory.createHRReport();
                    break;
                default:
                    System.out.println("Invalid report type. Please choose 'financial', 'marketing', or 'hr'.");
                    return;
            }

            System.out.println("Enter custom text for the " + reportType + " report:");
            String customText = scanner.nextLine();
            report.generate(customText);
        } catch (IOException e) {
            System.out.println("Error saving report: " + e.getMessage());
        }
    }
}
