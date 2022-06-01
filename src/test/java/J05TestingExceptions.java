import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class J05TestingExceptions {

    // Amacimiz : bekledigimiz exception u throw etti mi testi?
    @Test
    void testException() {
        String str="Hello World";

        assertThrows(NullPointerException.class, ()-> {
            System.out.println("testException1 is run");
            str.length();
        });

    }


    @Test
    void testException2() {
        String str = "Java";
        // yazilacak exception ya parent ya da aynisi olmasi lazim
        assertThrows(NumberFormatException.class, ()->{
            Integer.parseInt(str);
        });
    }


    @Test
    void testException3() {
        int x=123;
        int y=0;

        assertThrows(ArithmeticException.class, ()-> {
           int result=x/y;

        });
    }


    @Test
    void testException4() {
        int x=123;
        int y=0;

        assertThrows(ArithmeticException.class, ()-> divide(x,y));
    }

    private int divide(int a, int b) {
        return a/b;
    }


    @Test
    void testException5() {
        int age=9;
        assertThrows(IllegalArgumentException.class, ()->checkAge(age));
    }

    private void checkAge(int age) {
        if(age<0) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(age);
        }
    }

}
