import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Santino {
    private static ArrayList<String> directions = new ArrayList<>(List.of("N", "NE", "E", "SE", "S", "SW", "W", "NW"));
    private static int[][] moves = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("santino.dat"));
        PrintWriter out = new PrintWriter(System.out);
        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            int n = in.nextInt(), m = in.nextInt(), startRow = in.nextInt(), startCol = in.nextInt(),
                    endRow = in.nextInt(), endCol = in.nextInt();

            int[][] mat = new int[n][m];
            int[][] distances = new int[n][m];

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    mat[j][k] = directions.indexOf(in.next());
                    distances[j][k] = Integer.MAX_VALUE;
                }
            }

            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(startRow * m + startCol);
            distances[startRow][startCol] = 0;

            while (!queue.isEmpty()) {
                int polled = queue.poll();
                int rr = polled / m;
                int rc = polled % m;
                int move = mat[rr][rc];
                int sr = moves[move][0];
                int sc = moves[move][1];

                int sourceDistance = distances[rr][rc];

                while (rr >= 0 && rr < n && rc >= 0 && rc < m) {
                    if (sourceDistance + 1 < distances[rr][rc]) {
                        distances[rr][rc] = sourceDistance + 1;
                        queue.add(rr * m + rc);
                    }

                    rr += sr;
                    rc += sc;
                }
            }

            if (distances[endRow][endCol] == Integer.MAX_VALUE) {
                out.printf("Case #%d: Lost in the playground\n", i+1);
            } else {
                out.printf("Case #%d: %d%n", i+1, distances[endRow][endCol]);
            }
        }

        out.flush();
    }
}
