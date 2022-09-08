
import java.io.*;
        import java.util.*;

public class Maximize_sum_axi_of_an_Array {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();

            System.out.println(obj.Maximize(a,n));
        }

    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{

    int Maximize(int arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum + (long)arr[i]*i;
            //System.out.println(sum);
        }
        return (int)(sum%(1000000007));
    }
}