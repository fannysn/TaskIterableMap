package Problem5;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] testcase1 = {2,3,3,3,6,9,9};
        int[] testcase2 = {2,2,2,11};

        Set<Integer> check = new HashSet<>();
        int a = testcase1.length;
        for (int i=0; i<a; i++)
        {
            check.add(testcase1[i]);
        }
        System.out.println("TestCase1= " + check);

        Set<Integer> check2 = new HashSet<>();
        int b = testcase2.length;
        for (int j=0; j<b; j++)
        {
            check2.add(testcase2[j]);
        }
        System.out.println("TestCase2= " + check2);
    }
}
