import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class J02Assertions {

    @Test
    void testToFindMin() {

    // assertTrue(Math.min(11.5, 14.4)==11.5);

        // condition sonucu false ise test success olur. Cunku false degeri assert ediliyor
    //    assertFalse(Math.min(12.3, 13.5)==12.3);

        assertEquals(14.5, Math.min(14.5,17.6));

    }


    @Test
    void testArray() {
        String str="Junit5 is better than Junit4";
        String actualArr[] = str.split(" ");
        String expectedArr[] = {"Junit5", "is", "better","than", "Junit4"};
        assertTrue(Arrays.equals(expectedArr,actualArr));
    }

}
