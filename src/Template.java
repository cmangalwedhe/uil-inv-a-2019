import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Template {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("in.dat"));
        PrintWriter out = new PrintWriter(System.out);
        out.flush();
    }
}
