import java.util.*;

public class Mass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[10];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 5;
        intArr[5] = 6;
        intArr[6] = 7;
        intArr[7] = 8;
        intArr[8] = 9;
        intArr[9] = 10;
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            String scn1String = scanner.nextLine();
            a[i] = Integer.parseInt(scn1String);

        }
    }
}