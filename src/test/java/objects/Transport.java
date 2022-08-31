package objects;

public class Transport {

    private String type;
    private float fuelConsumption;
    private float distance;
    private float load;

    public Transport( float fuelConsumption, float distance) {
        this.fuelConsumption = fuelConsumption;
        this.distance = distance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
}




