import java.util.Scanner;

/**
 * Created by smeleyka on 10.08.17.
 */
public class Main {
    public static void main(String[] args) {
        //excersize1();
        Tree test = new Tree(10);

      test.add(4);
      test.add(11);
      test.printTree();
    }

    public static void excersize1() {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(hash(line));
    }

    public static int hash(String s) {
        int result = 0;
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            result += b[i];
        }
        return result / b.length;
    }
}
