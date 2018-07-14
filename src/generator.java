import dndLogic.attribute;
import dndLogic.character;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class generator {

    public static void main(String[] args) throws IOException {
        attribute att = new attribute();
        character pc = new character();
        int scores[] = new int[6];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
        pc.setStrength(att.rollAbilityScore());
        pc.setDexterity(att.rollAbilityScore());
        pc.setConstitution(att.rollAbilityScore());
        pc.setIntelligence(att.rollAbilityScore());
        pc.setWisdom(att.rollAbilityScore());
        pc.setCharisma(att.rollAbilityScore());
        */

        for(int i = 0; i < 6; i++) {
            scores[i] = att.rollAbilityScore();
        }

        Arrays.sort(scores);

        System.out.println("0. Barbarian");
        System.out.println("1. Bard");
        System.out.println("2. Cleric");
        System.out.println("3. Druid");
        System.out.println("4. Fighter");

        // User selects the class they want to build
        System.out.print("Please type the number of the class you wish to pick:\t");
        pc.setSpecialization(Integer.parseInt(reader.readLine()));

        // Invoke function to apply most efficient ability score allocation
        pc.allocateScores(scores);

        System.out.println("\n\nStrength:\t" + pc.getStrength());
        System.out.println("Dexterity:\t" + pc.getDexterity());
        System.out.println("Constitution:\t" + pc.getConstitution());
        System.out.println("Intelligence:\t" + pc.getIntelligence());
        System.out.println("Wisdom:\t" + pc.getWisdom());
        System.out.println("Charisma:\t" + pc. getCharisma());
    }
}
