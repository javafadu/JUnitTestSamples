import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J08RepeatTestMultipleTimes {

    @RepeatedTest(10)
    void subStringTest() {
        assertEquals("Java", "Java is an OOP Language".substring(0,4));
        System.out.println("substring () is run");
    }

    @RepeatedTest(3)
    void repeatedTest(TestInfo info) {
        assertEquals(2,Math.addExact(1,1),"1+1 must equal 2");

    }


    static int x=1;
    static int y=2;
    static int result=3;
    @RepeatedTest(100)
    void addExactTest() {
        assertEquals(result,Math.addExact(x,y));
        System.out.println("result = " + result);
        x++;
        y++;
        result+=2;
    }


}
