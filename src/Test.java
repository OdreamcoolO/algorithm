import java.util.*;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 8:21 2019/6/15
 */
public class Test {

    public static void main(String[] args) {
//        int[] arr = {1,1,23,1,1,2,2,2,2,1};
//        System.out.println(MoreThanHalfNum_Solution(arr));(2,3),(2,4),(2,5),(3,4),(3,5),(4,5),(5,3)
        test6();
    }


    public static int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>(array.length);
        for (int i = 0; i < array.length; i++){
            Integer count = map.get(array[i]);
            map.put(array[i], count == null ? 1: ++count);
            if (map.get(array[i]) > array.length/2){
                return array[i];
            }
        }
        return 0;
    }

    public static void test(){
        for (int i = 0; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                if ((i & j) == 0){
                    System.out.println(i+"\t"+j);
                }
                j = j*j;
            }
        }
    }

    public static void test1(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String[] strs = new String[m];
        for(int i = 0; i < m; i++){
            strs[i] = sc.next();
        }
        System.out.println(strs.length);
    }

    public static void test2(){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2= new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set2.add(1);
        set2.add(2);
        set2.add(3);

        for (Integer i:set1 ) {
            System.out.println(i);
        }
    }

    public static void test3(){
        System.out.println(Math.pow(0,0));

    }

    public static void test4(){
        for (int i = 0; i < 100; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; i < 10; i++) {
                Random random = new Random();
                sb.append((char)random.nextInt(656));
                System.out.print(sb.toString()+"\t");
                System.out.println(sb.toString().hashCode());
            }
        }
    }

    public static void test5(){
        String x = String.valueOf('a');
        String y = String.valueOf('b');
        System.out.println(x instanceof String);
//        Integer.parseInt(x);
        Integer.parseInt("1");
//        Integer.parseInt(y);
        System.out.println(x + 3);
//        Integer x = Integer.parseInt(String.valueOf('a'));
//        Integer y = Integer.parseInt(String.valueOf('b'));
        System.out.println(x);
        System.out.println(y);
    }

    public static void test6(){
        String str = "455+(654-15)*45+45/45*45/131";
//        String str = "454+153+455+4545+54";
        String[] strs = str.split("\\+|\\-|\\*|\\/|\\(|\\)");
        System.out.println(strs.length);

    }



}
