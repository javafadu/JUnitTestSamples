package com.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01StringModifierTest {

    C01StringModifier strModifier;

    @BeforeEach
    void setUp() {
        strModifier=new C01StringModifier();
        System.out.println("@BeforeEach is executed");
    }

    @AfterEach
    void teerDown() {
        strModifier=null;
        System.out.println("@AfterEach is executed");
    }

    @ParameterizedTest
    @CsvSource(value={"BC,AABC","BC,ABC","BC,BAC","BCD,BCD","'',AA"})
    void deleteAIfItIsInFirstTwoPositionsTest(String expected, String param) {
        assertEquals(expected,strModifier.deleteAIfItIsInFirstTwoPosition(param));
        System.out.println("Executed");
    }
}
