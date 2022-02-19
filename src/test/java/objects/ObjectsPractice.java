package objects;

import org.junit.jupiter.api.Test;

public class ObjectsPractice {
    @Test
    public void workingWithObjects() {
        Student pavel = new Student("Pavel","Pupkin");
        //pavel.setFirstName("Pavel");
        //pavel.setLastName("Pupkin");
        pavel.setAge(28);
        pavel.setPhone(37112345678L);
        pavel.setMail("mail@mail.com");

        Student nadja = new Student("Nadja","Dart");
        nadja.setFirstName("Nadja");
        nadja.setLastName("Kjorts"); // - perepisivajet familiju.
        nadja.setAge(18);
        nadja.setPhone("911");

        System.out.println("First Student: " + nadja.getFirstName() + " " + nadja.getLastName());
        System.out.println("Second Student: " + pavel.getFullName());

    }

}
