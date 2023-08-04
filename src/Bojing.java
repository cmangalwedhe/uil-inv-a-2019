import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Bojing {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("bojing.dat"));
        PrintWriter out = new PrintWriter(System.out);
        TreeMap<Integer, ArrayList<String>> map = new TreeMap<>();

        while (in.hasNext()) {
            String word = in.next();
            map.computeIfAbsent(word.length(), a -> new ArrayList<>()).add(word);
        }

        for (int key: map.keySet()) {
            String o = "";
            Collections.sort(map.get(key));

            for (String j: map.get(key)) {
                o += j + " ";
            }

            System.out.println(o.trim());
        }

        out.flush();
    }
}
