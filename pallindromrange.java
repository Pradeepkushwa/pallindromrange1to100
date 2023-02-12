import java.util.Scanner;
public class pallindromrange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        for(int i=1;i<=n;i++){
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                rev=rev*10+rem;
            temp=temp/10;
            }
            if(rev==i){
                System.out.print(i+" ");
            }
            rev=0;
        }
    }
}

