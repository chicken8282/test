import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringTokenizer stk = new StringTokenizer(sc.nextLine());

        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());

        if(A >= B){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if(A > B){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if(A <= B){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if(A < B){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if(A == B){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        if (A != B){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}