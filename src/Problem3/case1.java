package Problem3;
import  java.util.LinkedList;
import java.util.List;

public class case1 {

    public static void main(String[] args) {
        
        int[] awalnya = {1, 2, 3, 4, 6};
        int lower = awalnya.length;
        int target = 6;

        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < lower; i++) ;
        {
            for (int j = i + 1; j < lower; j++)
            {
                int tebak = awalnya[i] + awalnya[j];
                if (tebak == target)
                {
                    result.add(i);
                    result.add(j);
                }
            }
        }
        System.out.println(result);
    }
}
