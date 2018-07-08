import dndLogic.attribute;
import dndLogic.character;

public class generator {

    public static void main(String[] args) {
        attribute att = new attribute();
        character pc = new character();

        pc.setStrength(att.rollAbilityScore());
        pc.setDexterity(att.rollAbilityScore());
        pc.setConstitution(att.rollAbilityScore());
        pc.setIntelligence(att.rollAbilityScore());
        pc.setWisdom(att.rollAbilityScore());
        pc.setCharisma(att.rollAbilityScore());

        System.out.println("Strength:\t" + pc.getStrength());
        System.out.println("Dexterity:\t" + pc.getDexterity());
        System.out.println("Constitution:\t" + pc.getConstitution());
        System.out.println("Intelligence:\t" + pc.getIntelligence());
        System.out.println("Wisdom:\t" + pc.getWisdom());
        System.out.println("Charisma:\t" + pc. getCharisma());

        //System.out.println(strength.rollD6());
        //System.out.println(strength.rollAbilityScore());
    }
}
