// DesktopReportFactory.java
public class DesktopReportFactory implements ReportFactory {
    @Override
    public Report createFinancialReport() {
        return new DesktopFinancialReport();
    }

    @Override
    public Report createMarketingReport() {
        return new DesktopMarketingReport();
    }

    @Override
    public Report createHRReport() {
        return new DesktopHRReport();
    }
}