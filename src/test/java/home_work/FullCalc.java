package home_work;

import objects.Cars;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;


public class FullCalc {
    public float fuelCalculator(float a, float b) {

        return b / 100 * a;


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
        Cars volvo = new Cars(7, 100);

        Cars s8 = new Cars((float)14.2, 350);

        Cars micro = new Cars((float)3.8, 756);


        System.out.println("Volvo for " + volvo.getDistance() + " km need " + fuelCalculator(volvo.getFuelConsumption(), volvo.getDistance()) + " fuel.");
        System.out.println("Audi S8 for " + s8.getDistance() + " km need " + fuelCalculator(s8.getFuelConsumption(), s8.getDistance()) + " fuel.");
        System.out.println("Nissan Micro for " + micro.getDistance() + " km need " + fuelCalculator(micro.getFuelConsumption(), micro.getDistance()) + " fuel.");

    }
}


