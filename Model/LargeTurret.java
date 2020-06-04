package Model;

public class LargeTurret extends Turret {

    private LargeCaliberCannon largeCaliberCannon;

    public LargeTurret(int componentID, String name, double turnSpeed, int viewRange, LargeCaliberCannon largeCaliberCannon) {
        super(componentID, name, turnSpeed, viewRange);
        this.largeCaliberCannon = largeCaliberCannon;
    }



    public LargeCaliberCannon getLargeCaliberCannon() {
        return largeCaliberCannon;
    }

    public void setLargeCaliberCannon(LargeCaliberCannon largeCaliberCannon) {
        this.largeCaliberCannon = largeCaliberCannon;
    }
}
