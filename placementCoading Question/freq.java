import java.util.*;

public class freq {
    public static void frequency(String str) {
        int freq[] = new int[str.length()];
        char string[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.println(string[i] + " - " + freq[i]);
            }
        }
    }

   
    
    public static void main(String[] args) {
        // HashMap<String,Integer> map =new HashMap<>(0, 0);
        String str = "asdasddde";
        frequency(str);
    
    }
}
