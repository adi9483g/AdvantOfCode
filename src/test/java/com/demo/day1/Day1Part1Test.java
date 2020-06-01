package com.demo.day1;


import com.demo.day1.Taxicab.Day1Part1;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Day1Part1Test {

    @Test
    public void getDistanceTest1(){
        Day1Part1 day1Part1 = new Day1Part1();
        String input = "R5, L5, R5, R3";
        String actual = day1Part1.getDistance(input);
        String expected = "12";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getDistanceTest2(){
        Day1Part1 day1Part1 = new Day1Part1();
        String input = "R2, R2, R2";
        String actual = day1Part1.getDistance(input);
        String expected = "2";
        Assertions.assertEquals(expected,actual);
    }
}
