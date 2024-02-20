import java.util.Random;

public class SnakeLadder {
    public static  void  main(String args[]){
        System.out.println("Welcome to Snake and Ladder Programme");
        System.out.println("Game will start from position 0 ");

        int position = 0;
        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Dice Number is = "+dice);

        //Uc3 - The Player then checks for Option. They are No Play,Ladder or Snake.

        int move = random.nextInt(3);

        switch (move) {
            case 0:
                System.out.println("Ladder");
                position += dice;
                break;
            case 1:
                System.out.println("Snake");
                position -= dice;
                if (position < 0) {
                    position = 0;
                }
                break;

            default:
                System.out.println("No Play");
        }
        System.out.println("Player Position is = " + position);
    }
}
