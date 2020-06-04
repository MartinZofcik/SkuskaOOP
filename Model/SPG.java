package Model;

public class SPG extends Vehicle {
    private LargeCaliberCannon largeCannon;

    public SPG(int vehicleID, String name, Country country, double value, CrawlerChassis chassis, LargeCaliberCannon largeCannon) {
        super(vehicleID, name, country, value, chassis);
        this.largeCannon = largeCannon;
    }

    public LargeCaliberCannon getLargeCannon() {
        return largeCannon;
    }

    public void setLargeCannon(LargeCaliberCannon largeCannon) {
        this.largeCannon = largeCannon;
    }
}
