import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n = q.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = q.nextInt();
reverse(a);

    }

    public static void reverse(int[] a)
    {
        int s=0, end=a.length-1,temp;
        while(s<end)
        {
            temp =a[s];
            a[s]=a[end];
            a[end]=temp;

            s++;
            end--;
        }
        printArray(a);
    }
    public static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
