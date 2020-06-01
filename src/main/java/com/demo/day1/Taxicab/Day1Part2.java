package com.demo.day1.Taxicab;

import java.util.ArrayList;
import java.util.HashMap;

public class Day1Part2 {
     public String getDuplicatePositionDistance(String input) {
        int current_direction = 0;
        HashMap<Integer, ArrayList<Integer>> visitedPlaces = new HashMap<>();

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

            for (int i = 0; i < steps; i++) {
                switch (current_direction) {
                    case 0:
                        north_south--;
                        break;
                    case 1:
                        east_west++;
                        break;
                    case 2:
                        north_south++;
                        break;
                    case 3:
                        east_west--;
                        break;
                }
                visitedPlaces.putIfAbsent(east_west, new ArrayList<>());

                if (visitedPlaces.get(east_west).contains(north_south))
                    return String.valueOf(Math.abs(east_west) + Math.abs(north_south));

                visitedPlaces.get(east_west).add(north_south);
            }

        }

        return "-1";
    }
}
