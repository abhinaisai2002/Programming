import java.util.Random;
public class Dice {
    public static void main(String[] args){
        int count=0;
        Random rand = new Random();
        int dice1,dice2;
        for(int i=1;i<=10000;i++){
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;
            if(dice1 == dice2)
                count++;
        }
    } 
}
