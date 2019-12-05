package com.Practice;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class DeliveryTruck {
    int minimumDistance(int numRows, int numColumns, List<List<Integer>> area) {
        if (numRows < 1 || numRows > 1000 || numColumns < 1 || numColumns > 1000) {
            return -1;
        }

        Queue<Location> queue = new LinkedList<>();
        boolean[][] visited = new boolean[numColumns][numRows];

        queue.offer(new Location(0, 0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Location curr = queue.poll();

            // check if the destination is reached
            int val = (int) area.get(curr.y).get(curr.x);
            if (val == 9) {
                return curr.distance;
            }
            if (val == 1) {
                // move right
                if (canMove(curr.x + 1, curr.y, numRows, numColumns, visited)) {
                    queue.offer(new Location(curr.x + 1, curr.y, curr.distance + 1));
                    visited[curr.x +1][curr.y] = true;
                }
                // move left
                // move down
                // move up

            }
        }
        return -1;
    }

    public static boolean canMove(int x, int y, int numRows, int numColumns, boolean[][] visited) {
        return x >= 0 && x < numColumns && y >= 0 && y < numRows && !visited[x][y];
    }

    public static class Location {
        public int x, y, distance;

        public Location(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.distance = d;
        }
    }
}
