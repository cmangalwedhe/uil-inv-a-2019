import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Dylan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("in.dat"));
        PrintWriter out = new PrintWriter(System.out);

        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            long k = in.nextLong(), r = in.nextLong() - 1, c = in.nextLong() - 1;
            out.println(2L * r * k + ((c < k) ? 2 * (k - c - 1) : 1 + 2 * (c - k)));
        }

        out.flush();
    }
}
