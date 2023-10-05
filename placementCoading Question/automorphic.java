public class automorphic {
    public static void main(String[] args) {
        int a=5;
        int res=a*a;
        int temp =0;
        while(res>0){
          temp =temp*10 + res%10;
          res =res/10;
          if(temp==a){
            System.out.println("automorphic");}
            else{
                System.out.println("not automophic");
            }
            return;
          
        }

    }
}
