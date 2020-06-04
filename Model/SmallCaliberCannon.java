package Model;

public class SmallCaliberCannon extends Cannon {

    private int numOfRounds;

    public SmallCaliberCannon(int componentID, String name, double caliber, double cadence, double spread, int numOfRounds) {
        super(componentID, name, caliber, cadence, spread);
        this.numOfRounds = numOfRounds;
    }

    public int getNumOfRounds() {
        return numOfRounds;
    }

    public void setNumOfRounds(int numOfRounds) {
        this.numOfRounds = numOfRounds;
    }
}
