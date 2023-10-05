public class palindromeArray {
    public static void isPalindrome(int arr[]) {

        int reverse = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int temp1 =temp;
            while (temp > 0) {
                reverse = reverse * 10 + temp% 10;
                temp = temp / 10;
            }
            if (reverse == temp1) {
                System.out.println("palindrome");
            } else 
                System.out.println("not a palindrome");
            reverse =0;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 121, 123, 131 };
        isPalindrome(arr);
    }
}
