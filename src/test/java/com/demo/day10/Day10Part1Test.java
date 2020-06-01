package com.demo.day10;
import com.demo.day10.BalanceBot.Day10Part1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class Day10Part1Test {
    @Test
    public void validTestCase(){
        Day10Part1 day10Part1 = new Day10Part1();
        List<String> strings=new ArrayList<>();
        strings.add("value 5 goes to bot 2");
        strings.add("bot 2 gives low to bot 1 and high to bot 0");
        strings.add("value 3 goes to bot 1");
        strings.add("bot 1 gives low to output 1 and high to bot 0");
        strings.add("bot 0 gives low to output 2 and high to output 0");
        strings.add("value 2 goes to bot 2");
        String actual= day10Part1.findBot(strings,5,2);
        String expected="2";
        Assertions.assertEquals(expected,actual);
    }
}



