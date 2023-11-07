package twentySix;

public class assign {
    public static boolean checkWay(int maze[][], int solution[][], int x, int y) {
        int n = maze.length;
        if (x < 0 || x >= n || y < 0 || y >= n) {
            return false;
        }
        if (maze[x][y] == 0 || solution[x][y] == 1) {
            return false;
        }
        return true;
    }

    public static void solve(int x, int y, int maze[][], int solution[][]) {
        int n = maze.length;
        if (x == n - 1 && y == n - 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(solution[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;

        }
        if (checkWay(maze, solution, x, y + 1)) {
            solution[x][y+1] = 1;
            solve(x, y + 1, maze, solution);
            solution[x][y + 1] = 0;
        }
        if (checkWay(maze, solution, x, y - 1)) {
            solution[x][y-1] = 1;
            solve(x, y - 1, maze, solution);
            solution[x][y - 1] = 0;
        }
        if (checkWay(maze, solution, x + 1, y)) {
            solution[x + 1][y] = 1;
            solve(x + 1, y, maze, solution);
            solution[x + 1][y] = 0;
        }
        if (checkWay(maze, solution, x - 1, y)) {
            solution[x - 1][y] = 1;
            solve(x - 1, y, maze, solution);
            solution[x - 1][y] = 0;
        }
    }
    
     
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int solution[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                solution[i][j] = 0;
            }
        }
        solution[0][0] = 1;
        solve(0, 0, maze, solution);
    }
}
