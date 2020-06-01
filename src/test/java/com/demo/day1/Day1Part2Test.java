package com.demo.day1;


import com.demo.day1.Taxicab.Day1Part1;
import com.demo.day1.Taxicab.Day1Part2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Day1Part2Test {

    @Test
    public void getDistanceTest1(){
        Day1Part2 day1Part2 = new Day1Part2();
        String input = "R5, L5, R5, R3";
        String actual = day1Part2.getDuplicatePositionDistance(input);
        String expected = "-1";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getDistanceTest2(){
        Day1Part2 day1Part2 = new Day1Part2();
        String input = "R2, R2, R2";
        String actual = day1Part2.getDuplicatePositionDistance(input);
        String expected = "-1";
        Assertions.assertEquals(expected,actual);
    }
}
