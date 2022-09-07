import java.util.*;
public class Max_Min {
    public static void main(String[] args)
    {
        Scanner q =new Scanner (System.in);
        int N=q.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++)
            a[i]=q.nextInt();
        System.out.print(findSum(a,N-1));

    }
    public static int findSum(int A[],int N)
    {
        //code here
        Arrays.sort(A);
        int i=A[0]+A[N];
        return i;
    }
}
