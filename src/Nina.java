import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Nina {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("nina.dat"));
        PrintWriter out = new PrintWriter(System.out);
        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            double radius = in.nextDouble();
            double sideLength = 2 * radius * Math.sin(Math.PI / 5);
            double area = (5 * sideLength * sideLength) / (4 * Math.tan(Math.PI / 5));

            if (area <= 43560)
                out.printf("LOCATION #%d %.2f %.2f%n", i+1, area, sideLength * 5);
            else
                out.printf("LOCATION #%d WILL NOT FIT%n", i+1);
        }

        out.flush();
    }
}
