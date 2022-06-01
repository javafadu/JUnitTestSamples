package com.app;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class C02FirstTwoLastTwoCharsSameTest {

    C02FirstTwoLastTwoCharsSame obj = new C02FirstTwoLastTwoCharsSame();

    @ParameterizedTest
    @CsvSource(value={"true,ABAB", "false,ABBA", "false,ABCD", "true,AB","false,A","false,''"})
    void checkIfFirstTwoLastTwoCharsAreSameTest1(boolean rs, String str) {
        assertEquals(rs,obj.checkIfFirstTwoLastTwoAreSame(str));
    }

    @ParameterizedTest
    @ValueSource(strings={"ABAB","AB"})
    void checkIfFirstTwoLastTwoCharsAreSameTest2(String str) {
        assertTrue(obj.checkIfFirstTwoLastTwoAreSame(str));
    }


    @ParameterizedTest
    @ValueSource(strings={"ABAB,ABCD"})
    void checkIfFirstTwoLastTwoCharsAreSameTest3(String str) {
        assertFalse(obj.checkIfFirstTwoLastTwoAreSame(str));
    }

}
