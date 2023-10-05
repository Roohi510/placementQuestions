import java.util.*;

public class largestConsicativeSequence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1, 1, 33, 22, 1, 1 };
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int count = 0, ans = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                list.add(arr[i]); // Array of distinct elements;
            }
        }
        for (int i = 0; i < list.size()-1; i++) {
           if(list.get(i)==list.get(i+1)-1){
            count++;
           }
           else{
            count =1;
           }
           ans =Math.max(ans,count);
        }
        System.out.println(ans);
    }
}
