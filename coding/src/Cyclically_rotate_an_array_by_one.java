import java.util.*;
public class Cyclically_rotate_an_array_by_one {
    public static void main(String[] args)
    {
        Scanner q = new Scanner (System.in);
        int n=q.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=q.nextInt();
        }
        rotate(a,n);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void rotate(int arr[], int n)
    {
        reverse(arr,0,n-1);
        reverse(arr,1,n-1);
    }
    public static void reverse(int a[],int i,int j)
    {
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}
