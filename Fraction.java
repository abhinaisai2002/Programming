import java.util.Scanner;

public class Fraction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        int c = gcd(a,b);
        System.out.println("Fractional Part is "+(a/c)+"/"+(b/c));

    }
    public static int gcd(int a,int b){
        int g = a>b?b:a;
        for(int i=g;i>0;i--){
            if(a%i==0 && b%i==0)
                return i;
        }
        return 1;
    }
}
