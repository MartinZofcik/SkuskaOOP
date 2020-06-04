package Model;

public abstract class Vehicle {
    private int vehicleID;
    private String name;
    private Country country;
    private double value;
    private Chassis chassis;

    public Vehicle(int vehicleID, String name, Country country, double value, Chassis chassis) {
        this.vehicleID = vehicleID;
        this.name = name;
        this.country = country;
        this.value = value;
        this.chassis = chassis;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int ID) {
        this.vehicleID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }
}
