public class palindrome {
    public static void palinum(int num) {

        int temp = num;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }

        System.out.println(reverse + " " + temp);
        if (reverse == temp) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT A PALINDROME");
        }
    }
    public static void stringpali(String str){
        
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
          reverse=reverse +str.charAt(i);
        }
        
        System.out.println(reverse+"  "+str);
        if(reverse.equals(str)){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }
    }

    public static void main(String[] args) {

        palinum(121);
        stringpali("aba");
    }
}
