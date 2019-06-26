import java.util.HashMap;
import java.util.Map;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 8:21 2019/6/15
 */
public class Test {

    public static void main(String[] args) {
//        int[] arr = {1,1,23,1,1,2,2,2,2,1};
//        System.out.println(MoreThanHalfNum_Solution(arr));
        System.out.println(Long.valueOf("101010101010"));

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

}
