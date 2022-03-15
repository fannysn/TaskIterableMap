package Problem4;
import java.util.List;
import java.util.LinkedList;

public class Case2 {
    public static void main(String[] args) {
        int[] masukanA = {3,8};
        int[] masukanB = {2,8};
        int lowerA=masukanA.length;
        int lowerB=masukanB.length;

        List<Integer> masukan = new LinkedList<>();
        List<Integer> result = new LinkedList<>();

        for(int i=0; i<lowerA; i++)
        {
            masukan.add(masukanA[i]);
        }

        for (int j=0; j<lowerB; j++);
        {

        }
        System.out.println("Output: " + result);
    }
}
