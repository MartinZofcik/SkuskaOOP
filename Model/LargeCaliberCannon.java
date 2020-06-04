package Model;

public class LargeCaliberCannon extends Cannon{

    private double explosionRadius;

    public LargeCaliberCannon(int componentID, String name, double caliber, double cadence, double spread, double explosionRadius) {
        super(componentID, name, caliber, cadence, spread);
        this.explosionRadius = explosionRadius;
    }

    public double getExplosionRadius() {
        return explosionRadius;
    }

    public void setExplosionRadius(double explosionRadius) {
        this.explosionRadius = explosionRadius;
    }
}
