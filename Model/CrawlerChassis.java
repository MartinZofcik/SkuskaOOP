package Model;

public class CrawlerChassis extends Chassis {

    private double crawlerWidth;

    public CrawlerChassis(int componentID, String name, double maxCarry, double turnSpeed, double maxSpeed, double crawlerWidth) {
        super(componentID, name, maxCarry, turnSpeed, maxSpeed);
        this.crawlerWidth = crawlerWidth;
    }

    public double getCrawlerWidth() {
        return crawlerWidth;
    }

    public void setCrawlerWidth(double crawlerWidth) {
        this.crawlerWidth = crawlerWidth;
    }
}
