import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lucia {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("lucia.dat"));
        PrintWriter out = new PrintWriter(System.out);

        Node root = new Node(in.nextInt());

        while (in.hasNextInt()) {
            root.add(in.nextInt());
        }

        System.out.print("Preorder:");
        root.preorder();
        System.out.println();

        System.out.print("Postorder:");
        root.postorder();
        System.out.println();

        out.flush();
    }
}

class Node {
    Node left, middle, right;
    int val;

    Node(int val) {
        this.val = val;
    }

    void add(int value) {
        if (value < val - 5) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.add(value);
            }
        } else if (value > val + 5) {
            if (right == null) {
                right = new Node(value);
            } else {
                right.add(value);
            }
        } else {
            if (middle == null) {
                middle = new Node(value);
            } else {
                middle.add(value);
            }
        }
    }

    void preorder() {
        System.out.print(" " + val);

        if (left != null) {
            left.preorder();
        }

        if (middle != null) {
            middle.preorder();
        }

        if (right != null) {
            right.preorder();
        }
    }

    void postorder() {
        if (left != null) {
            left.postorder();
        }

        if (middle != null) {
            middle.postorder();
        }

        if (right != null) {
            right.postorder();
        }

        System.out.print(" " + val);
    }
}
