package Model;


public abstract class Chassis extends Component {

    private double maxCarry;
    private double turnSpeed;
    private double maxSpeed;

    public Chassis(int componentID, String name, double maxCarry, double turnSpeed, double maxSpeed) {
        super(componentID, name);
        this.maxCarry = maxCarry;
        this.turnSpeed = turnSpeed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return  "maxCarry=" + maxCarry +
                ", turnSpeed=" + turnSpeed +
                ", maxSpeed=" + maxSpeed;
    }

    public double getMaxCarry() {
        return maxCarry;
    }

    public void setMaxCarry(double maxCarry) {
        this.maxCarry = maxCarry;
    }

    public double getTurnSpeed() {
        return turnSpeed;
    }

    public void setTurnSpeed(double turnSpeed) {
        this.turnSpeed = turnSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
