package Model;

public abstract class Component {

    private int componentID;
    private String name;

    public Component(int componentID, String name) {
        this.componentID = componentID;
        this.name = name;
    }

    public int getComponentID() {
        return componentID;
    }

    public void setComponentID(int componentID) {
        this.componentID = componentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

