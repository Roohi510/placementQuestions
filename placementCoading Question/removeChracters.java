import java.util.Scanner;

public class removeChracters {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
     System.out.print("Enter String : ");
     String s = sc.nextLine();
     s=s.replaceAll("[^a-zA-Z]","");
     System.out.println(s);
    }
}
