package com.ascending.problems;

public class _0695_MaxAreaOfIsland {

    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int max_area = 0;
            for (int i = 0; i < grid.length; i ++){
                for (int j =0; j < grid[0].length; j ++){
                    if (grid[i][j] == 1) {
                        max_area = Math.max(dfs(grid, i, j), max_area);
                    }
                }
            }
            return max_area;
        }

        public int dfs(int[][] grid, int i, int j){
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) return 0;
            grid[i][j] = 0;
            return 1 + dfs(grid, i+1, j) + dfs(grid, i-1, j) + dfs(grid, i, j+1) + dfs(grid, i, j-1);
        }
    }

}
