import java.io.Serializable;
import java.util.Scanner;

public class Test extends AbstractMethodError implements Serializable {
    final int lala = 1;

    {
        System.out.println(this.hashCode());
    }

    public static void main(String[] args) {
        String in = "1234,77777,689";
        Scanner sc = new Scanner(in);
        sc.useDelimiter(",");
        while (sc.hasNext())
            System.out.print(sc.nextInt() + " ");
        while (sc.hasNext())
            System.out.print(sc.nextShort() + " ");
    }

    private int lala() {
        return 1;
    }
}
