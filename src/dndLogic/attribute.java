package dndLogic;

import java.util.Arrays;
import java.util.Random;

public class attribute {

    // Generates a random integer value between 1 and 6
    // Simulates rolling a six-sided die
    public static int rollD6() {
        Random rand = new Random();

        return rand.nextInt((6 - 1) + 1) + 1;
    }

    // Generates an attribute score by rolling
    public static int rollAbilityScore() {
        int rolls[] = new int[4];
        int abil = 0;

        // Each roll into an array
        for(int i = 0; i < 4; i++) {
            rolls[i] = rollD6();
        }

        // Ignore min value
        Arrays.sort(rolls);

        for(int i = 1; i < 4; i++) {
            abil += rolls[i];
        }

        return abil;
    }
}
