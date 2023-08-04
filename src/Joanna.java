import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Joanna {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("joanna.dat"));
        PrintWriter out = new PrintWriter(System.out);
        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            double rate = in.nextDouble(), hours = in.nextDouble(), laptop = in.nextDouble(), accessories = in.nextDouble(), tax = in.nextDouble();
            double grossPay = Double.parseDouble("%.2f".formatted(rate * hours)),
                    netPay = Double.parseDouble(String.format("%.2f", grossPay - 0.0765 * grossPay)) * 10;
            double purchase = (laptop + accessories) * (1 + tax/100);

            out.printf("Net Pay:   $%,8.2f%n", netPay);
            out.printf("Purchase:  $%,8.2f%n", purchase);
            out.printf("Fun Cash:  $%,8.2f%n", netPay-purchase);
            out.println("*".repeat(9));
        }

        out.flush();
    }
}
