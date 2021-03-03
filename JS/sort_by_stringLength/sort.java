import java.util.Arrays;
import java.util.Comparator;

public class sort {
    public static void main(String[] args) {
        String[] friends = {"milan", "kartik", "chandu"};
        Arrays.sort(friends);//Araay.sort will modify the existsing array.
        for (String string : friends) {
            System.out.print(" "+string);
        }
        System.out.println();
        //order the Strings according to string length.
        Arrays.sort(friends, Comparator.comparing(String :: length));
        for (String string : friends) {
            System.out.print(" "+string);
        }
    }
}
