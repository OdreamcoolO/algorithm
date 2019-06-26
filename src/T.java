
import java.util.Scanner;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 12:22 2019/6/23
 */
public class T {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n , t, a;
        n = sc.nextInt();
        t = sc.nextInt();
        a = sc.nextInt();
        if (t < a){
            System.out.println(t + (n - a));
        } else {
            System.out.println(a + (n - t));
        }
    }
}
