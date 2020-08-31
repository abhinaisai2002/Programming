import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String n = input.next();
        if(palindrome(n))
            System.out.println("-1");
        else{
        for(int i=0;i<n.length();i++){
            String p1 = n.substring(i,i+1);
            String p = n.replaceFirst(p1,"");
            if(palindrome(p)){
                System.out.println(n.charAt(i));
                break;}
        }}
    }
    public static boolean palindrome(String p){
        boolean n = true;
        for(int i=0,j=p.length()-1;i<j;i++,j--){
            if(p.charAt(i)==p.charAt(j))
                continue;
            n=false;
            break;
        }
        return  n;
    }
}