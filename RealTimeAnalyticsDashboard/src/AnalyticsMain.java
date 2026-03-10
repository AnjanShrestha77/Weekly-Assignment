/**
 * AnalyticsMain
 *
 * Driver program to test AnalyticsDashboard functionality.
 */

public class AnalyticsMain {

    public static void main(String[] args) {

        AnalyticsDashboard dashboard = new AnalyticsDashboard();

        dashboard.processEvent("/news", "user1", "google");
        dashboard.processEvent("/news", "user2", "facebook");
        dashboard.processEvent("/sports", "user3", "google");

        dashboard.displayTopPages();
        dashboard.displayTrafficSources();
    }
}