// WebReportFactory.java
public class WebReportFactory implements ReportFactory {
    @Override
    public Report createFinancialReport() {
        return new WebFinancialReport();
    }

    @Override
    public Report createMarketingReport() {
        return new WebMarketingReport();
    }

    @Override
    public Report createHRReport() {
        return new WebHRReport();
    }
}