import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Loops {
    @Test
    public void loopsLesson() {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Dmitry");
        studentNames.add("Alex");
        studentNames.add("Liza");
        studentNames.add("Danik");


        System.out.println(studentNames.get(0));
        System.out.println(studentNames.size());
        System.out.println(studentNames.isEmpty());

        for (int i = 0; i < studentNames.size();i++ ){

            System.out.println(studentNames.get(i));
        }
        System.out.println();

//        for ( String name : studentNames) {
//            System.out.println(name);
//        }
        for ( String name : studentNames) {
            if (name.startsWith("D")) {
                System.out.println(name);
            }
        }

        for ( String name : studentNames) {
            if (name.startsWith("D")) {
                System.out.println("This name starts with D: " + name);

            }else{
                System.out.println("This name dosnt starts with D:" + name);
            }




        }
    }


}
