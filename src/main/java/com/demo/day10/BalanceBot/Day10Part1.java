package com.demo.day10.BalanceBot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
public class Day10Part1 {
     public Map<String, List<Integer>> map = new TreeMap<>();
     public String findBot(List<String> data, int value_1, int value_2) {
         InstructionReader instructionReader = new InstructionReader();
        Map<String, List<Integer>> map = instructionReader.instructionProcessor(data);
        List<Integer> list = Arrays.asList(value_1,value_2);
        for (Map.Entry<String, List<Integer>> listEntry : map.entrySet()) {
            if (listEntry.getValue().containsAll(list)) {
                return listEntry.getKey();
            }
        }
        return "NOT FOUND";
    }
    public void testBalanceBot() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/inputs/day10input.txt")));
            List<String> data = reader.lines().collect(Collectors.toList());
            System.out.println("The number of the bot that is responsible for comparing given microchips is " + findBot(data, 61, 17));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

