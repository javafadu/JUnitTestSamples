import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class J01Assertions {

    // test methodlarinin ismi genellikle ne icerdigi olacak sekilde
    // ornek: (hangi ozellik test ediliyorsa)
    // testisNotAdultIfAgeLessThan18


    @Test
    void test() {
       // fail("Not yet implemented");
    }

    @Test
    void testLength() {
        int actualLength="Merhaba".length();
        int expectedLength=7;


       // assertEquals(expectedLength,actualLength,"Length are not matched");

       //  assertTrue(expectedLength==actualLength,"Actual length is " +
       //         "not matching with expected length");

       //  assertFalse(expectedLength==actualLength);

    }


    @Test
    void testUpperCase() {
      String actualValue =  "hello".toLowerCase();
      String expectedValue = "HELLO";

      assertEquals(expectedValue,actualValue,"Esit degil");
    }

    @Test
    void testContainsMethod() {
        // icinde t nin olmamasini test ediyoruz,
        assertEquals(false,"Bekir".contains("t"));
    }


}