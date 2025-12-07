import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringTokenizer stk = new StringTokenizer(sc.nextLine());

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        int c = (a < b) ? 1 : 0;
        int d = (a == b) ? 1 : 0;

        System.out.println(c + " " + d);
    }
}