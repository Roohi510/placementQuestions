public class stingWildcard {
    public static void main(String[] args) {
        String a="*asd";
        String b ="asd";
        if(a.equalsIgnoreCase(b)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
