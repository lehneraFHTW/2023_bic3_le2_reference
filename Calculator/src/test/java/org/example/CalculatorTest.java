package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

         calc = new Calculator();

    }

    @Test
    void add_twoPositiveIntegers_SumUpCorrectly(){
        //Arrange
        int a = 4;
        int b = 7;
        int expectedResult = 11;

        //Act
        long result = calc.add(a,b);

        //Assert
        Assertions.assertEquals(result,expectedResult);

    }
    @Test
    void add_twoNegativeIntegers_SumUpCorrectly(){
        //Arrange
        int a = -11;
        int b = -11;
        int expectedResult = -22;

        //Act
        long result = calc.add(a,b);

        //Assert
        Assertions.assertEquals(result,expectedResult);

    }

    @Test
    void add_oneNegativeOnePositiveInteger_SumUpCorrectly(){
        //Arrange
        int a = 1;
        int b = -2;
        int expectedResult = -1;

        //Act
        long result = calc.add(a,b);

        //Assert
        Assertions.assertEquals(result,expectedResult);

    }

}