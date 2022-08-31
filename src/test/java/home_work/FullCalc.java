package home_work;

import objects.Transport;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class FullCalc {
    public float fuelCalculator(float a, float b) {

        return b / 100 * a;


    }

    public float transportPrice(float a) {
        return a * (float) 1.79;

    }

    @Test
    public void result() {
        BigDecimal x = new BigDecimal(fuelCalculator(7, 345));
        DecimalFormat df = new DecimalFormat("###.##");


        System.out.println("Fuel what you will need : " + (df.format(x)));

    }

    //----------------SECOND_HOME_WORK---------------
    @Test
    public void secondHomeWork() {
        Transport volvo = new Transport(15, 300);

        Transport magirus = new Transport(19, 300);

        Transport scania = new Transport(22, 300);

        Transport train1 = new Transport(40, 240);

        Transport train2 = new Transport(40, 210);

        ;

        float volvoPrice = transportPrice(fuelCalculator(volvo.getFuelConsumption(), volvo.getDistance()));
        float magirusPrice = transportPrice(fuelCalculator(magirus.getFuelConsumption(), magirus.getDistance()));
        float scaniaPrice = transportPrice(fuelCalculator(scania.getFuelConsumption(), scania.getDistance()));


        List<Objects> transportLis =  new ArrayList<>();
         //spisok viachel.get

    }
}


