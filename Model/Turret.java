package Model;

public abstract class Turret extends Component {

    private double turnSpeed;
    private int viewRange;

    public Turret(int componentID, String name, double turnSpeed, int viewRange) {
        super(componentID, name);
        this.turnSpeed = turnSpeed;
        this.viewRange = viewRange;
    }

    @Override
    public String toString() {
        return "turnSpeed=" + turnSpeed +
                ", viewRange=" + viewRange;
    }

    public double getTurnSpeed() {
        return turnSpeed;
    }

    public void setTurnSpeed(double turnSpeed) {
        this.turnSpeed = turnSpeed;
    }

    public int getViewRange() {
        return viewRange;
    }

    public void setViewRange(int viewRange) {
        this.viewRange = viewRange;
    }
}
