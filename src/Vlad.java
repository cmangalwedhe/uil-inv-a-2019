import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Vlad {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("vlad.dat"));
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<String> list = new ArrayList<>();

        while (in.hasNextLine()) {
            String[] split = in.nextLine().split(" ");

            list.add(split[2] + " " + split[3].charAt(0) + " " + split[1].substring(0, split[1].length() - 1));
        }

        list.sort(Comparator.comparing(x -> {
            String[] a = x.split(" ");
            return a[a.length - 1].substring(0, 1);
        }));
        list.forEach(out::println);

        out.flush();
    }
}
