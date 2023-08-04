import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hojin {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("hojin.dat"));
        PrintWriter out = new PrintWriter(System.out);

        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            out.printf("Case #%d: %d%n", i+1, gcd(in.nextLong(), in.nextLong()));
        }

        out.flush();
    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a%b);
    }
}
