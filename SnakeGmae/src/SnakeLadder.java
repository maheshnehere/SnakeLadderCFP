import java.util.Random;

public class SnakeLadder {
    public static  void  main(String args[]){
        System.out.println("Welcome to Snake and Ladder Programme");
        System.out.println("Game will start from position 0 ");

        int position = 0;
        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Dice Number is = "+dice);
    }
}
