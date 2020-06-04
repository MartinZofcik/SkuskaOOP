package Model;

public abstract class Cannon extends Component{

    private double caliber;
    private double cadence;
    private double spread;

    public Cannon(int componentID, String name, double caliber, double cadence, double spread) {
        super(componentID, name);
        this.caliber = caliber;
        this.cadence = cadence;
        this.spread = spread;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public double getCadence() {
        return cadence;
    }

    public void setCadence(double cadence) {
        this.cadence = cadence;
    }

    public double getSpread() {
        return spread;
    }

    public void setSpread(double spread) {
        this.spread = spread;
    }
}
