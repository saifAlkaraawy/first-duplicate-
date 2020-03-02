import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        int[] numberDuplicate = {1, 2, 3, 1, 1};

        System.out.println(firstDuplicate(numberDuplicate));

    }

    static int firstDuplicate(int[] a) {
        HashMap<Integer, Integer> NumberDuplicate = new HashMap<>();
        ArrayList<Integer> doubleDuplicate = new ArrayList<>();
        for (int i = 0; i <= a.length - 1; i++) {
            if (NumberDuplicate.get(a[i]) != null) {
                doubleDuplicate.add(a[i]);
                return a[i];


            } else NumberDuplicate.put(a[i], 1);

        }
        if (doubleDuplicate.isEmpty()) {
            return -1;

        }


        return 0;


    }
}