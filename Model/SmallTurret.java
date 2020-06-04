package Model;

public class SmallTurret extends Turret {

    private SmallCaliberCannon smallCaliberCannon;

    public SmallTurret(int componentID, String name, double turnSpeed, int viewRange, SmallCaliberCannon smallCaliberCannon) {
        super(componentID, name, turnSpeed, viewRange);
        this.smallCaliberCannon = smallCaliberCannon;
    }

    public SmallCaliberCannon getSmallCaliberCannon() {
        return smallCaliberCannon;
    }

    public void setSmallCaliberCannon(SmallCaliberCannon smallCaliberCannon) {
        this.smallCaliberCannon = smallCaliberCannon;
    }
}
