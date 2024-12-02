// MobileReportFactory.java
public class MobileReportFactory implements ReportFactory {
    @Override
    public Report createFinancialReport() {
        return new MobileFinancialReport();
    }

    @Override
    public Report createMarketingReport() {
        return new MobileMarketingReport();
    }

    @Override
    public Report createHRReport() {
        return new MobileHRReport();
    }
}