package com.app;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class C04SortArraysInASpecifiedTimeTest {

    @Test
    void sortArraysInASpecifiedTimeTest1() {
        C04SortArraysInASpecifiedTime obj = new C04SortArraysInASpecifiedTime();
        assertTimeout(Duration.ofSeconds(5), ()-> IntStream.rangeClosed(1,10000).
                forEach(t->obj.sortArraysInASpecifiedTime()));
    }

    C04SortArraysInASpecifiedTime obj = new C04SortArraysInASpecifiedTime();
    @RepeatedTest(10000)
    void sortArraysInASpecifiedTimeTest2() {
        assertTimeout(Duration.ofSeconds(5),()->obj.sortArraysInASpecifiedTime());
    }

}
