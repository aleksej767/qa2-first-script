package basics;

import org.junit.jupiter.api.Test;

public class MyFirstJavaClass {
    public int sumTwoDigits(int a, int b) {     // void - ne vozrosjajet dannije
        int someDigit = 13;
        int sum = a + b;
        return sum;

    }

    public int minus(int a, int b) {
//        int raznitsja = b - a;
        return b - a;
    }

    @Test
    public void test() {                     // Junit dolzen imet dostup poetomu metod PUBLIC
        int x = sumTwoDigits(7, 13);
        int y = minus(50, 60);

        System.out.println("Rezultat slozeniaj: " + x);
        System.out.println("Rezultat raznici " + y);
    }
}


// Sozdat clas /sozdat metod kotorij budet polucjat 2 parametra  x = rashod avto na 100 / y = kolicestvo KM kotoroje nuzno projehat.
// metod viscitivajet skolko topliva neobhodima ctob projehat dannoje rastojani