import java.util.io;

public class digitsumsolve {

    public static void main (String[] args)
    {

    }

    public static void solve()
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int sum=0;

        while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }

        System.out.println(sum);
    }
}
