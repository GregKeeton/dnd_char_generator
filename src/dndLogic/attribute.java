package dndLogic;

import java.util.Arrays;
import java.util.Random;

public class attribute {

    public static final Random rand = new Random();

    // Generates a random integer value between 1 and 4
    // Simulates rolling a 4-sided die
    public static int rollD4() {
        return rand.nextInt((4 - 1) + 1) + 1;
    }

    // Generates a random integer value between 1 and 6
    // Simulates rolling a six-sided die
    public static int rollD6() {
        return rand.nextInt((6 - 1) + 1) + 1;
    }

    // Generates a random integer value between 1 and 8
    // Simulates rolling a eight-sided die
    public static int rollD8() {
        return rand.nextInt((8 - 1) + 1) + 1;
    }

    // Generates a random integer value between 1 and 10
    // Simulates rolling a ten-sided die
    public static int rollD10() {
        return rand.nextInt((10 - 1) + 1) + 1;
    }

    // Generates a random integer value between 1 and 12
    // Simulates rolling a twelve-sided die
    public static int rollD12() {
        return rand.nextInt((12 - 1) + 1) + 1;
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
