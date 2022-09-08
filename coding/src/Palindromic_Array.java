import  java.util.*;
public class Palindromic_Array {

    public static void main(String [] args)
    {
        Scanner q = new Scanner(System.in);
        int t=q.nextInt();
        while (t!=0) {
            int n = q.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = q.nextInt();
            }
            System.out.println(palinArray(a,n));
            t--;
        }
    }


    public static int palinArray(int[] a, int n)
    {
        //add code here.
        int sum=0;
        for(int i=0;i<n;i++)
        {

            int temp=a[i];
            while(temp!=0)
            {
                sum=sum+temp%10;
                temp=temp/10;
                sum=sum*10;
            }
            // System.out.println(sum);
            if(sum/10!=a[i])
                return 0;
            sum=0;
        }
        return 1;
    }
}
