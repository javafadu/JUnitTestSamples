import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class J09PerformanceTest {

    @Test
    void testPrintPerformance() {
        assertTimeout(Duration.ofSeconds(6), ()-> IntStream.rangeClosed(1,100000).
    forEach(System.out::println));
    }

    @Test
    void testPrintPerformance2() {
        assertTimeout(Duration.ofSeconds(10),
                ()-> IntStream.rangeClosed(1,1000).
                reduce((x,y)->Math.addExact(x,y)));
    }


}
