package Problem2;
import java.util.*;


public class AngkaMunculSekali {
    public static void uniqueCount (String taps) {

        int lower=taps.length();
        Set<Integer> AngkaUnik=new TreeSet<>();
        List<Integer> AngkaDef=new LinkedList<>();
        List<Integer> result=new LinkedList<>();
        for (int i=0; i<lower; i++) {
            AngkaUnik.add(Integer.parseInt(String.valueOf(taps.charAt(i))));
            AngkaDef.add(Integer.parseInt(String.valueOf(taps.charAt(i))));
        }
        for(int i:AngkaUnik) {
            int cnt=0;
            for(int j=0;j<lower;j++) {
                if(i== AngkaDef.get(j)) {
                    cnt++;
                }
            }
            if (cnt==1) {
                result.add(i);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        uniqueCount("76523752");
        uniqueCount("11122");
    }
}
