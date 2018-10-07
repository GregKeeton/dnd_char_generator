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
            "10. Warlock\n11. Wizard\n";

    // Constant declaring race selection menu
    public static final String RACE_SELECT = "\n\n0. Dragonborn\n" +
            "1. Dwarf\n2. Elf\n3. Gnome\n4. Half Elf\n5. Half Orc\n" +
            "6. Halfling\n7. Human\n8. Tiefling\n";

    public static void main(String[] args) throws IOException {
        attribute att = new attribute();
        character pc = new character();
        int scores[] = new int[6];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Generate ability scores and store in an array for access
        for(int i = 0; i < 6; i++) {
            scores[i] = att.rollAbilityScore();
        }

        // Sort the scores so that we know the order from smallest to greatest
        Arrays.sort(scores);

        // Display the class selection menu to the user
        System.out.print(CLASS_SELECT);

        // User selects the class they want to build
        System.out.print("Please type the number of the class you wish to pick:\t");
        pc.setSpecialization(Integer.parseInt(reader.readLine()));

        // Invoke function to apply most efficient ability score allocation
        pc.allocateScores(scores);

        // Display the race selection menu to the user
        System.out.print(RACE_SELECT);

        // User selects the race they want to play as
        System.out.print("Select the race you would like to play as:\t");
        pc.setRace(Integer.parseInt(reader.readLine()));

        System.out.print('\n' + pc.getRace());

        System.out.println("\n\nStrength:\t" + pc.getStrength());
        System.out.println("Dexterity:\t" + pc.getDexterity());
        System.out.println("Constitution:\t" + pc.getConstitution());
        System.out.println("Intelligence:\t" + pc.getIntelligence());
        System.out.println("Wisdom:\t" + pc.getWisdom());
        System.out.println("Charisma:\t" + pc. getCharisma());
    }
}
