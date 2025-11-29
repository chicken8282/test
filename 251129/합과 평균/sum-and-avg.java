import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer stk = new StringTokenizer(sc.nextLine());
        int a = Integer.parseInt(stk.nextToken());
        float b = Float.parseFloat(stk.nextToken());
        int c = a + (int)b;
        float d = (float)c / 2;
        

        System.out.printf("%d %.1f",c,d);
        
    }
}