import dndLogic.attribute;
import dndLogic.character;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class generator {

    // Constant declaring class selection menu
    public static final String CLASS_SELECT = "0. Barbarian\n" +
            "1. Bard\n2. Cleric\n3. Druid\n4. Fighter\n5. Monk\n" +
            "6. Paladin\n7. Ranger\n8. Rogue\n9. Sorcerer\n" +
            "10. Warlock\n11. Wizard\n\n" +
            "Please type the number of the class you wish to pick:\t";

    // Constant declaring race selection menu
    public static final String RACE_SELECT = "\n\n0. Dragonborn\n" +
            "1. Dwarf\n2. Elf\n3. Gnome\n4. Half Elf\n5. Half Orc\n" +
            "6. Halfling\n7. Human\n8. Tiefling\n\n" +
            "Select the race you would like to play as:\t";

    // Constant declaring gender selection menu
    public static final String GENDER_SELECT = "\n\n0. Male\n1. Female\n\n" +
            "Select the gender you would like for your character:\t";

    public static void main(String[] args) throws IOException {
        attribute att = new attribute();
        character pc = new character();
        int scores[] = new int[6];

        // Loop control
        boolean choice = true;

        // For getting user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (choice) {
            // Generate ability scores and store in an array for access
            for (int i = 0; i < 6; i++) {
                scores[i] = att.rollAbilityScore();
            }

            // Sort the scores so that we know the order from smallest to greatest
            Arrays.sort(scores);

            // Display the class selection menu to the user
            System.out.println(CLASS_SELECT);
            pc.setSpecialization(Integer.parseInt(reader.readLine()));

            // Invoke function to apply most efficient ability score allocation
            pc.allocateScores(scores);

            // Display the race selection menu to the user
            System.out.println(RACE_SELECT);
            pc.setRace(Integer.parseInt(reader.readLine()));

            // Get user's choices for racial modifiers
            pc.addRacialModifiers();

            // Display the gender selection menu to the user
            System.out.println(GENDER_SELECT);
            pc.setGender(Integer.parseInt(reader.readLine()));

            // Get the character's name from the user
            System.out.print("\n\nWhat is the character's name?");
            pc.setName(reader.readLine());

            System.out.print(pc.toString());

            // Continue making characters?
            System.out.println("\n\n\nWould you like to roll up another character?  (y/n)");
            String cont = reader.readLine();

            // Change loop control if user wishes to stop
            if(cont.toLowerCase().charAt(0) == 'n')
                choice = false;
        }
    }
}