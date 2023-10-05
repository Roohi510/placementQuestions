import java.util.*;
class test
{
    static int fibo(int n)
    {
        if (n <= 1)
        return n;
        return fibo(n-1) + fibo(n-2);
    }

     public static void main (String args[])
    {
        int n = 9;
        for(int i=0;i<=9;i++)
        System.out.print(fibo(i)+"  ");
    }
}