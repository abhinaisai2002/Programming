import java.util.Scanner;
import java.io.*;
public class Possiblewords{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine(); //fixer.fiber,filter,fixer
        String[] words = input.nextLine().split(";");
        String pos = searchWords(word,words);
        if(pos.isEmpty())
            System.out.println("ERROR-909");
        else
            System.out.println(pos.substring(0,pos.length()-1));
    }
    public static String searchWords(String word,String[] words){
        String possiblewords="";
        for(String wrd : words){
            wrd = wrd.toLowerCase();
            word = word.toLowerCase();
            if(word.length() == wrd.length())
            {
                String dup = word.replace("_",wrd.substring(word.indexOf('_'),word.indexOf('_')+1));
                if(dup.compareTo(wrd)==0)
                    possiblewords = possiblewords + dup.toUpperCase()+";";
            }
        }
        return possiblewords;
    }
}
