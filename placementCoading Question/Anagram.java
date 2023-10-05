import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String a ="HELLO";
        String b ="hello";
        char[] c =a.toLowerCase().toCharArray();
        char d[] =b.toLowerCase().toCharArray();
         Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c, d)){
            System.out.println("ANAGRAMS");
        }
        else{
            System.out.println("NO ANAGRAMS");
        }

    }
}
