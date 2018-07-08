import dndLogic.attribute;

public class generator {

    public static void main(String[] args) {
        attribute strength = new attribute();
        System.out.println(strength.rollD6());
        System.out.println(strength.rollAbilityScore());
    }
}
