import java.util.*;

public class First_and_last_occurrences_of_x {
    public static void main(String [] args)
    {
        Scanner q =new Scanner(System.in);
        int n=q.nextInt();
        long a[]=new long[n];
        int x=q.nextInt();
        for(int i=0;i<n;i++)
            a[i]=q.nextInt();
        ArrayList<Long> p=find(a,n,x);
        System.out.print(p.get(0)+" "+p.get(1));
    }
    static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        int max=0;
        ArrayList<Long> a=new ArrayList<>();
        long count=-1,ptr=-1;
        for(int i=0;i<n;i++)
        {
            if(count==-1 && arr[i]==x)
            {
                count=i;
            }
            if(arr[i]==x)
            {
                ptr++;
            }
        }
        if(count==-1)
        {
            a.add(count);
            a.add(count);
            return a;
        }
        else
        {
            a.add(count);
            a.add(count+ptr);
        }
        return a;
    }
}
