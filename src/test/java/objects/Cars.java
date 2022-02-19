package objects;

import java.math.BigDecimal;

public class Cars {

    private float fuelConsumption;
    private float distance;

    public Cars(float fuelConsumption,float distance){
    this.fuelConsumption = fuelConsumption;
    this.distance = distance;
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




