package games;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {
        int lastSpace = 20, currentSpace = 0, maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for(int i = 0; i < maxRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace += die;
            System.out.printf("Roll #%d. You've rolled a %d. ", i + 1, die);

            if (currentSpace == lastSpace) {
                System.out.println("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.println("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
            } else if (i + 1 == maxRolls) {
                System.out.println("You're on space " + currentSpace + ". Unfortunately, you didn't make it to all " + lastSpace + " spaces. You lose!");
            } else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You are now on space " + currentSpace + " and have " + spacesToGo + " more to go.");
            }
        }
    }
}
