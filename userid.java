import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First name : ");
        String firstname = input.next();
        System.out.print("Enter Last name : ");
        String lastname = input.next();
        System.out.print("Enter PIN : ");
        String pin = input.next();
        System.out.print("Enter N value : ");
        int n = input.nextInt();
        System.out.println(generateUserId(firstname,lastname,pin,n));
    }
    public static String generateUserId(String firstname,String lastname,String pin,int n){
        String userid = "";
        if(firstname.length() == lastname.length())
        {
            int cmp = firstname.compareTo(lastname);
            if(cmp>0)
                userid += lastname.charAt(lastname.length()-1) + firstname;
            else
                userid += firstname.charAt(lastname.length()-1) + lastname ;
        }
        else
        {
            if(firstname.length()>lastname.length())
                userid += lastname.charAt(lastname.length()-1) + firstname;
            else
                userid += firstname.charAt(lastname.length()-1) + lastname;
        }
        userid = swapCase(userid);

        return userid + pin.charAt(n-1) + pin.charAt(pin.length()-n);
    }
    public static String swapCase(String id){
        String user="";
        for(int i=0;i<id.length();i++){
            char a = id.charAt(i);
            if(Character.isUpperCase(a))
                user = user + Character.toLowerCase(a);
            else
                user = user + Character.toUpperCase(a);
        }
        return user;
    }
}
