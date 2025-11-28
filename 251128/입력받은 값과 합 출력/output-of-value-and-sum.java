import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        StringTokenizer stk = new StringTokenizer(sc.nextLine());

        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());

        System.out.println(A + " " + B + " " + (A + B));
    }
}