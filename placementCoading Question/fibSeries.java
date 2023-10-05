public class fibSeries {
    public static void fib(int a,int b,int n){
        int c =0;
        if(n==0){
         // System.out.print(n+" ");
          return;
        }
         c =a+b;
         System.out.print(c+" ");
         fib(b,c,n-1);

    }
  
    public static void main(String[] args) {
        System.out.print(" 0 ");
        System.out.print("  1  ");
        fib(0,1,8);
        System.out.println();
      

    }
}
