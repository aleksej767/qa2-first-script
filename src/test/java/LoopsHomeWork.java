import objects.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoopsHomeWork {
    @Test
    public void loopsHomeWork() {
        // jest spisok intov   -  spisok dolzen sostojat iz 20 cisel , vivesti v kancol tolko te cisla pri delenije na 2 = 4


        Random ran = new Random();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(ran.nextInt(25));
            System.out.println(numbers.get(i));


        }
        System.out.println();
        System.out.println(numbers.size());
        System.out.println("Task 1");

        for (int num : numbers) {
            if (num / 2 == 4) {
                System.out.println(num);
            }
        }
        System.out.println("Task 2");
        // spisok vivesti v konsol vse cisla kratnije 2 (delitjsa bez ostatka)

        for (int num : numbers) {
            if (num % 2 == 0) {
                if (num != 0)
                    System.out.println(num);
            }
        }
        System.out.println("Task 3");
        // objekt Student - sozdat spisok studentov. v spiske dobavit 5. otobrozit porjadkovij nomer i Imja
        List<Student> students = new ArrayList<>();
        Student pavel = new Student();
        pavel.setFirstName("Pavel");
        pavel.setCourse("QA1");
        Student nadia = new Student();
        nadia.setFirstName("Nadia");
        nadia.setCourse("QA2");
        Student liza = new Student();
        liza.setFirstName("Liza");
        liza.setCourse("QA1");
        Student dima = new Student();
        dima.setFirstName("Dima");
        dima.setCourse("QA2");
        Student alex = new Student();
        alex.setFirstName("Alex");
        alex.setCourse("QA2");
        students.add(pavel);
        students.add(nadia);
        students.add(alex);
        students.add(dima);
        students.add(liza);
        for (int i = 0; i < students.size(); i++) {
            students.get(i).setID(i + 1);
            System.out.println("Studenta Vards: " + students.get(i).getFirstName() + " ID : " + students.get(i).getID());
        }
        // otobrozit s tovoze spiska - studentov kotorije zanimajutsja na opredeljonom kurse (dop atribut nazvanijekursa)
        System.out.println("Task 4");
        for (Student stud : students
        ) {
            if (stud.getCourse() == "QA1") {
                System.out.println("Pirmajā kursā studē: " + stud.getFirstName());
            }

        }
        // otobrozit studentov tolko na kurse QA1





    }
}