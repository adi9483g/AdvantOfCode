package com.demo;


import com.demo.day1.Taxicab.Day1Part1;
import com.demo.day1.Taxicab.Day1Part2;
import com.demo.day4.securitythroughobscurity.Day4Part1;
import com.demo.day4.securitythroughobscurity.Day4Part2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(TaskApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Day:- ");
        System.out.println("1 for Puzzle Of Day1");
        System.out.println("4 for Puzzle Of Day4");
        System.out.println("10 for Puzzle Of Day10");
        int day = scanner.nextInt();
        System.out.println("Enter part:- ");
        System.out.println("1 for Part 1");
        System.out.println("2 for Part 2");
        int part = scanner.nextInt();
        String choice = "" + day + part;
        String input = "";
        FileReader fr= null;
        ArrayList<String> al = new ArrayList();
        int i;
        switch (choice) {
            case "11":
                 fr=new FileReader("src\\main\\resources\\inputs\\day1input.txt");
                while((i=fr.read())!=-1)
                    input += ((char)i);
                fr.close();
                Day1Part1 day1Part1 = new Day1Part1();
                System.out.println("Distance from starting point : "+day1Part1.getDistance(input));
                break;
            case "12":
                fr = new FileReader("src\\main\\resources\\inputs\\day1input.txt");
                while((i=fr.read())!=-1)
                    input += ((char)i);
                fr.close();
                Day1Part2 day1Part2 = new Day1Part2();
                System.out.println("First duplicate position is :"+day1Part2.getDuplicatePositionDistance(input));
                break;
            case "41":
                ArrayList<String> list = new ArrayList<>();
                Day4Part1 day4Part1 = new Day4Part1();
                try (Scanner s = new Scanner(new FileReader("src/main/resources/inputs/day4input.txt"))) {
                    while (s.hasNext()) {
                        list.add(s.nextLine());
                    }
                }
                System.out.println(day4Part1.getSectorId(list));
                break;
            case "42":
                ArrayList<String> list1 = new ArrayList<>();
                Day4Part2 day4Part2 = new Day4Part2();
                try (Scanner s = new Scanner(new FileReader("src/main/resources/inputs/day4input.txt"))) {
                    while (s.hasNext()) {
                        list1.add(s.nextLine());
                    }
                }
                System.out.println(day4Part2.getBlock(list1));
                break;
        }
    }

}
