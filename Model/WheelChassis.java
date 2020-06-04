package Model;

public class WheelChassis extends Chassis {

    private int numOfWheels;

    public WheelChassis(int componentID, String name, double maxCarry, double turnSpeed, double maxSpeed, int numOfWheels) {
        super(componentID, name, maxCarry, turnSpeed, maxSpeed);
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
}
