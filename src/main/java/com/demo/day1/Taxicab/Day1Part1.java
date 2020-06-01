package com.demo.day1.Taxicab;

public class Day1Part1 {

     public String getDistance(String input) {
        int current_direction = 0;

        int east_west = 0;
        int north_south = 0;
        for (String instruction : input.split(", ")) {
            char direction = instruction.charAt(0);
            int steps = Integer.parseInt(instruction.substring(1));

            switch (direction) {
                case 'R':
                    current_direction = (current_direction+1 + 4) % 4;
                    break;
                case 'L':
                    current_direction = (current_direction-1 + 4) % 4;
                    break;
            }

            switch (current_direction) {
                case 0:
                    north_south -= steps;
                    break;
                case 1:
                    east_west += steps;
                    break;
                case 2:
                    north_south += steps;
                    break;
                case 3:
                    east_west -= steps;
                    break;
            }

        }

        return String.valueOf(Math.abs(east_west) + Math.abs(north_south));
    }

}
