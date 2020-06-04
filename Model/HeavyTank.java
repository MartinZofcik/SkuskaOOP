package Model;

public class HeavyTank extends Vehicle {

    private Turret largeTurret;

    public HeavyTank(int vehicleID, String name, Country country, double value, CrawlerChassis chassis, LargeTurret largeTurret) {
        super(vehicleID, name, country, value, chassis);
        this.largeTurret = largeTurret;
    }

    public Turret getLargeTurret() {
        return largeTurret;
    }

    public void setLargeTurret(Turret largeTurret) {
        this.largeTurret = largeTurret;
    }
}
