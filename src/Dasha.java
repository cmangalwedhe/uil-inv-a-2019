import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Dasha {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("dasha.dat"));
        PrintWriter out = new PrintWriter(System.out);
        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            int a = in.nextInt(), b = in.nextInt(), m = in.nextInt(), x = in.nextInt();
            HashSet<Integer> set = new HashSet<>();

            for (int j = 0; j < m; j++) {
                set.add(x);
                x = (a * x + b) % m;
            }

            out.printf("%d / %d%n", set.size(), m);
        }

        out.flush();
    }
}
