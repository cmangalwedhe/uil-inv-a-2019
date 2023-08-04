import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Alok {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("alok.dat"));
        PrintWriter out = new PrintWriter(System.out);

        double sum = 0;
        int cnt = 0;

        while (in.hasNextDouble()) {
            sum += in.nextDouble();
            cnt++;
        }

        out.printf("$%.2f%n$%.2f%n", sum, sum / cnt);
        out.flush();
    }
}
