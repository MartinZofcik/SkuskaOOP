package Model;

public class LightTank extends Vehicle {

    private SmallTurret smallTurret;

    public LightTank(int vehicleID, String name, Country country, double value, WheelChassis chassis, SmallTurret smallTurret) {
        super(vehicleID, name, country, value, chassis);
        this.smallTurret = smallTurret;
    }

    public SmallTurret getSmallTurret() {
        return smallTurret;
    }

    public void setSmallTurret(SmallTurret smallTurret) {
        this.smallTurret = smallTurret;
    }
}
