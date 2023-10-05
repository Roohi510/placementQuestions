import java.util.*;
public class sumOfdigits {
    public static void main(String[] args) {
        int arr[] = { 1234, 23, 44, 56, 765 };
        int sum = 0;
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]!= 0) {
                sum = sum + arr[i] % 10;
                arr[i] = arr[i] / 10;
            }
            System.out.print(sum + "  ");
            list.add(sum);
            sum = 0;
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
