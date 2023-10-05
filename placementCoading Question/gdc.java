public class gdc {
     public static int hcf(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a>b){
            return hcf(a-b,b);
        }
        else{
            return hcf(a,b-a);
        }
     }
    public static void main(String[] args) {
        System.out.println(hcf(6,0));
    }

}
