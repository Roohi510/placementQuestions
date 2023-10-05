public class minElement {
    public static void main(String[] args) {
        int arr[]={2,3,5,77,22,1};
         int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){//FOR MAX ARR[I]>MAX
                min =arr[i];
            }
        }
        System.out.println(min);
    }
}
