package API;

import Model.*;

import java.util.ArrayList;

public class ComponentService {

    //private ArrayList<Component> allComponents = new ArrayList();

    public WheelChassis addWheelChassis(int componentID, String name, double maxCarry, double turnSpeed, double maxSpeed, int numOfWheels, ArrayList<Component> allComponents){
        WheelChassis wheelChassis = new WheelChassis(componentID, name, maxCarry, turnSpeed, maxSpeed, numOfWheels);
        allComponents.add(wheelChassis);
        return wheelChassis;
    }

    public CrawlerChassis addCrawlerChassis(int componentID, String name, double maxCarry, double turnSpeed, double maxSpeed, double crawlerWidth, ArrayList<Component> allComponents){
        CrawlerChassis crawlerChassis = new CrawlerChassis(componentID,name, maxCarry, turnSpeed, maxSpeed, crawlerWidth);
        allComponents.add(crawlerChassis);
        return crawlerChassis;
    }

    public SmallCaliberCannon addSmallCaliberCannon(int componentID, String name, double caliber, double cadence, double spread, int numOfRounds, ArrayList<Component> allComponents){
        SmallCaliberCannon smallCaliberCannon = new SmallCaliberCannon(componentID, name, caliber, cadence, spread, numOfRounds);
        allComponents.add(smallCaliberCannon);
        return smallCaliberCannon;
    }

    public LargeCaliberCannon addLargeCaliberCannon(int componentID, String name, double caliber, double cadence, double spread, double explosionRadius, ArrayList<Component> allComponents){
        LargeCaliberCannon largeCaliberCannon = new LargeCaliberCannon(componentID, name, caliber, cadence, spread, explosionRadius);
        allComponents.add(largeCaliberCannon);
        return largeCaliberCannon;
    }

    public SmallTurret addSmallTurret(int componentID, String name, double turnSpeed, int viewRange, SmallCaliberCannon smallCaliberCannon, ArrayList<Component> allComponents){
        SmallTurret smallTurret = new SmallTurret(componentID, name, turnSpeed, viewRange, smallCaliberCannon);
        allComponents.add(smallTurret);
        return smallTurret;
    }

    public LargeTurret addLargeTurret(int componentID, String name, double turnSpeed, int viewRange, LargeCaliberCannon largeCaliberCannon, ArrayList<Component> allComponents){
        LargeTurret largeTurret = new LargeTurret(componentID, name, turnSpeed, viewRange, largeCaliberCannon);
        allComponents.add(largeTurret);
        return largeTurret;
    }

//    public ArrayList<Component> getAllComponents() {
//        return allComponents;
//    }
//
//    public void setAllComponents(ArrayList<Component> allComponents) {
//        this.allComponents = allComponents;
//    }
}
