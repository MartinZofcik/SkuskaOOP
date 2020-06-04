package API;

import Model.*;

import java.util.ArrayList;

public class VehicleService {

   // private ArrayList<Vehicle> allVehicles = new ArrayList();

    public LightTank addLightTank(int vehicleID, String name, Country country, double value, WheelChassis chassis, SmallTurret smallTurret, ArrayList<Vehicle> allVehicles){
        LightTank lightTank = new LightTank(vehicleID, name, country, value, chassis, smallTurret);
        allVehicles.add(lightTank);
        return lightTank;
    }

    public HeavyTank addHeavyTank(int vehicleID, String name, Country country, double value, CrawlerChassis chassis, LargeTurret largeTurret,  ArrayList<Vehicle> allVehicles){
        HeavyTank heavyTank = new HeavyTank(vehicleID, name, country, value, chassis, largeTurret);
        allVehicles.add(heavyTank);
        return heavyTank;
    }

    public SPG addSPG(int vehicleID, String name, Country country, double value, CrawlerChassis chassis, LargeCaliberCannon largeCannon,  ArrayList<Vehicle> allVehicles){
        SPG spg = new SPG(vehicleID, name, country, value, chassis, largeCannon);
        allVehicles.add(spg);
        return spg;
    }

//    public ArrayList<Vehicle> getAllVehicles() {
//        return allVehicles;
//    }
//
//    public void setAllVehicles(ArrayList<Vehicle> allVehicles) {
//        this.allVehicles = allVehicles;
//    }
}
