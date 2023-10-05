public class frequency {
    public static void main(String[] args) {
        int freq[]=new int[256];
        String str ="asbewniogifa";
        char arr[] =str.toCharArray();
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>=2){
                System.out.print((char)i+"  ");
            }
        }
    }
}
