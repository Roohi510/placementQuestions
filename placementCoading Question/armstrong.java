public class armstrong {
    public static void main(String[] args) {
        int n= 1533;
        int temp =n;
        int p=0;
        while(n>0){
            int rem =n%10;
             p = p +(rem*rem*rem);
             n =n/10;
        }
        if(p==temp){
            System.out.println("Aramstrong");
        }
        else{
            System.out.println("not a aramstrong");
        }
    }
}
