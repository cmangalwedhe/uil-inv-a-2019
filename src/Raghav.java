import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Raghav {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("raghav.dat"));
        PrintWriter out = new PrintWriter(System.out);

        int i = 1;

        while (in.hasNextInt()) {
            double n = in.nextInt();

            if (i % 2 == 0)
                n *= 2;
            else
                n += 7;

            if (i % 3 == 0)
                n *= 5;
            if (i % 5 == 0)
                n -= 11;
            if (i % 7 == 0)
                n *= n;
            if (i % 10 == 0)
                n /= 10;
            if (i++ % 11 == 0)
                n = Math.sqrt(n);

            out.println((int) n);
        }

        out.flush();
    }
}
