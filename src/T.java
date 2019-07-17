
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 12:22 2019/6/23
 */
public class T {
    public static void main(String[] args){
        test2();
    }


    public static void test1(){
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

    public static void test2(){
        BigInteger number = new BigInteger("12345");
        BigInteger three = new BigInteger("3");
        System.out.println( number.mod(three));
    }

}
