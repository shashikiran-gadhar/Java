import java.util.HashMap;

public class Pairs {

    public static int getPair(int[] a, int sum)
    {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (m.containsKey(a[i]))
                m.put(a[i], m.get(a[i]) + 1);
            else
                m.put(a[i], 1);
        }

        int twiceCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (m.containsKey(sum - a[i]))
                twiceCount += m.get(sum - a[i]);

            if(sum - a[i] == a[i])
                twiceCount--;
        }

        return twiceCount / 2;
    }

    public static void main(String[] args){
        int[] arr = {1, 5, 7, -1, 5};
        System.out.println("count " + getPair(arr, 6));

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(4, 1);

        map.put(1, map.get(1) + 1);
        System.out.println(map);

    }
}
