package dndLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  barbarian - 0
 *  bard      - 1
 *  cleric    - 2
 *  druid     - 3
 *  fighter   - 4
 *  monk      - 5
 *  paladin   - 6
 *  ranger    - 7
 *  rogue     - 8
 *  sorcerer  - 9
 *  warlock   - 10
 *  wizard    - 11
 */
public class character {

    // Constant declaring request to choose subrace
    public static final String SUBRACE = "Choose a subrace:\t";

    // Constant declaring request to pick two other ability scores to increase
    // For Half Elf
    public static final String ABIL_INC_HALF_ELF = ", you may pick two extra" +
            " ability scores to increase by +1\n0. Strength\n1. Dexterity" +
            "\n2. Constitution\n3. Intelligence\n4. Wisdom\n5. Charisma\n";

    // Constant declaring request to pick one other ability score to increase
    // for Tiefling
    public static final String ABIL_INC_TIEFLING = ", you may pick one extra" +
            " ability score to increase by +2\n0. Charisma\n1. Dexterity\n";

    private String name;
    private String race;
    private String gender;
    private int specialization;
    private int speed;

    // Ability scores
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    // Specializations
    private String[] specs = {"Barbarian", "Bard", "Cleric",
                              "Druid", "Fighter", "Monk",
                              "Paladin", "Ranger", "Rogue",
                              "Sorcerer", "Warlock", "Wizard"};

    // Races
    private String[] races = {"Dragonborn", "Dwarf", "Elf",
                              "Gnome", "Half Elf", "Half Orc",
                              "Halfling", "Human", "Tiefling"};

    public String toString() {
        return "Your character is " + this.getName() + ", a " +
                this.getGender() + " " + this.getRace() + ".  " +
                this.getName() + " is a " +
                this.getSpecialization().toLowerCase() +
                " by trade.  Their ability scores are:" +
                this.displayAbilityScores();
    }

    public String displayAbilityScores() {
        return "\n\nStrength:\t" + this.getStrength() +
        "\nDexterity:\t" + this.getDexterity() +
        "\nConstitution:\t" + this.getConstitution() +
        "\nIntelligence:\t" + this.getIntelligence() +
        "\nWisdom:\t" + this.getWisdom() +
        "\nCharisma:\t" + this. getCharisma();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(int race) {
        this.race = races[race];
    }

    public String getGender() {
        return gender;
    }

    public void setGender(int gender) {
        if(gender == 0)
            this.gender = "male";
        else if(gender == 1)
            this.gender = "female";
    }

    public String getSpecialization() {
        return this.specs[this.specialization];
    }

    public void setSpecialization(int specialization) {
        this.specialization = specialization;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    private void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    private void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    private void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    private void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    private  void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void allocateScores(int scores[]) throws IOException {
        if(scores.length == 6) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int choice;

            while(this.specialization < 0 || this.specialization > 11) {
                System.out.println("\nInvalid choice entered.  Please enter a number from 0 - 11:\t");
                this.setSpecialization(Integer.parseInt(reader.readLine()));
            }

            // Barbarian
            if(this.specialization == 0) {
                this.setIntelligence(scores[0]);
                this.setCharisma(scores[1]);
                this.setWisdom(scores[2]);
                this.setDexterity(scores[3]);
                this.setConstitution(scores[4]);
                this.setStrength(scores[5]);
            }
            // Bard
            else if(this.specialization == 1) {
                this.setIntelligence(scores[0]);
                this.setWisdom(scores[1]);
                this.setStrength(scores[2]);
                this.setConstitution(scores[3]);
                this.setDexterity(scores[4]);
                this.setCharisma(scores[5]);
            }
            // Cleric
            else if(this.specialization == 2) {
                this.setDexterity(scores[0]);
                this.setCharisma(scores[1]);
                this.setIntelligence(scores[2]);
                this.setStrength(scores[3]);
                this.setConstitution(scores[4]);
                this.setWisdom(scores[5]);
            }
            // Druid
            else if(this.specialization == 3) {
                this.setStrength(scores[0]);
                this.setCharisma(scores[1]);
                this.setIntelligence(scores[2]);
                this.setConstitution(scores[3]);
                this.setDexterity(scores[4]);
                this.setWisdom(scores[5]);
            }
            // Fighter
            else if(this.specialization == 4) {
                System.out.print("Would you prefer Dexterity (0) or Strength (1) as your main ability score?\t");
                choice = Integer.parseInt(reader.readLine());

                if(choice == 1) {
                    this.setDexterity(scores[0]);
                    this.setIntelligence(scores[1]);
                    this.setCharisma(scores[2]);
                    this.setWisdom(scores[3]);
                    this.setConstitution(scores[4]);
                    this.setStrength(scores[5]);
                }
                else if(choice == 0) {
                    this.setStrength(scores[0]);
                    this.setIntelligence(scores[1]);
                    this.setCharisma(scores[2]);
                    this.setWisdom(scores[3]);
                    this.setConstitution(scores[4]);
                    this.setDexterity(scores[5]);
                }
            }
            // Monk
            else if(this.specialization == 5) {
                this.setCharisma(scores[0]);
                this.setIntelligence(scores[1]);
                this.setStrength(scores[2]);
                this.setConstitution(scores[3]);
                this.setWisdom(scores[4]);
                this.setDexterity(scores[5]);
            }
            // Paladin
            else if(this.specialization == 6) {
                this.setDexterity(scores[0]);
                this.setIntelligence(scores[1]);
                this.setWisdom(scores[2]);
                this.setConstitution(scores[3]);
                this.setCharisma(scores[4]);
                this.setStrength(scores[5]);
            }
            // Ranger
            else if(this.specialization == 7) {
                this.setCharisma(scores[0]);
                this.setStrength(scores[1]);
                this.setIntelligence(scores[2]);
                this.setWisdom(scores[3]);
                this.setConstitution(scores[4]);
                this.setDexterity(scores[5]);
            }
            // Rogue
            else if(this.specialization == 8) {
                this.setStrength(scores[0]);
                this.setIntelligence(scores[1]);
                this.setConstitution(scores[2]);
                this.setWisdom(scores[3]);
                this.setCharisma(scores[4]);
                this.setDexterity(scores[5]);
            }
            // Sorcerer
            else if(this.specialization == 9) {
                this.setStrength(scores[0]);
                this.setWisdom(scores[1]);
                this.setIntelligence(scores[2]);
                this.setConstitution(scores[3]);
                this.setDexterity(scores[4]);
                this.setCharisma(scores[5]);
            }
            // Warlock
            else if(this.specialization == 10) {
                this.setStrength(scores[0]);
                this.setWisdom(scores[1]);
                this.setIntelligence(scores[2]);
                this.setDexterity(scores[3]);
                this.setConstitution(scores[4]);
                this.setCharisma(scores[5]);
            }
            // Wizard
            else if(this.specialization == 11) {
                this.setStrength(scores[0]);
                this.setCharisma(scores[1]);
                this.setWisdom(scores[2]);
                this.setDexterity(scores[3]);
                this.setConstitution(scores[4]);
                this.setIntelligence(scores[5]);
            }
        }
    }

    private void incByOne(int choice) {
        if(choice == 0)
            this.strength++;
        else if(choice == 1)
            this.dexterity++;
        else if(choice == 2)
            this.constitution++;
        else if(choice == 3)
            this.intelligence++;
        else if(choice == 4)
            this.wisdom++;
        else if(choice == 5)
            this.charisma++;
    }

    public void addRacialModifiers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice;

        // Dragonborn
        if(this.race.equals(this.races[0])) {
            this.strength += 2;
            this.charisma++;
        }
        // Dwarf
        else if(this.race.equals(this.races[1])) {
            // All dwarves get +2 to constitution by default
            this.constitution += 2;

            // Prompt user to pick subrace
            System.out.println(SUBRACE);
            System.out.print("0. Hill Dwarf\n1. Mountain Dwarf\n");
            choice = Integer.parseInt(reader.readLine());

            // Input validation
            while(choice < 0 || choice > 1) {
                System.out.println("\nInvalid choice entered.  Please enter a number from 0 - 11:\t");
                choice = Integer.parseInt(reader.readLine());
            }

            // Hill Dwarf gets wisdom +1 and hitpoint max +1
            if(choice == 0) {
                this.wisdom++;
                // need to implement hp system
            }
            // Mountain Dwarf gets strength +2
            else if(choice == 1) {
                this.strength += 2;
            }
        }
        // Elf
        else if(this.race.equals(this.races[2])) {
            // All elves get +2 to dexterity by default
            this.dexterity += 2;

            // Prompt user to pick subrace
            System.out.println(SUBRACE);
            System.out.print("0. High Elf\n1. Wood Elf\n2. Dark Elf (Drow)\n");
            choice = Integer.parseInt(reader.readLine());

            // Input validation
            while(choice < 0 || choice > 2) {
                System.out.println("\nInvalid choice entered.  Please enter a number from 0 - 11:\t");
                choice = Integer.parseInt(reader.readLine());
            }

            // High Elf gets intelligence +1
            if(choice == 0) {
                this.intelligence++;
            }
            // Wood Elf gets wisdom +1
            else if(choice == 1) {
                this.wisdom++;
            }
            // Dark Elf gets charisma +1
            else if(choice == 2) {
                this.charisma++;
            }
        }
        // Gnome
        else if(this.race.equals(this.races[3])) {
            // All gnomes get +2 to intelligence and 25 speed by default
            this.intelligence += 2;
            // Set speed
            this.setSpeed(25);

            // Prompt user to pick subrace
            System.out.println(SUBRACE);
            System.out.print("0. Forest Gnome\n1. Rock Gnome\n2. Deep Gnome\n");
            choice = Integer.parseInt(reader.readLine());

            // Input validation
            while(choice < 0 || choice > 2) {
                System.out.println("\nInvalid choice entered.  Please enter a number from 0 - 11:\t");
                choice = Integer.parseInt(reader.readLine());
            }

            // Forest Gnome gets dexterity +1
            if(choice == 0) {
                this.dexterity++;
            }
            // Rock Gnome gets constitution +1
            else if(choice == 1) {
                this.constitution++;
            }
            // Deep Gnome gets intelligence +2 and dexterity +1
            else if(choice == 2) {
                this.intelligence += 2;
                this.dexterity++;
            }
        }
        // Half Elf
        else if(this.race.equals(this.races[4])) {
            // All half elves get +2 to charisma and +1 to two other ability
            // scores of their choice and speed of 30 by default
            this.charisma += 2;

            System.out.print("\n\nAs a " + this.race + ABIL_INC_HALF_ELF);
            choice = Integer.parseInt(reader.readLine());

            // Input validation
            while(choice < 0 || choice > 2) {
                System.out.println("\nInvalid choice entered.  Please enter a number from 0 - 11:\t");
                choice = Integer.parseInt(reader.readLine());
            }

            // First choice increased
            this.incByOne(choice);

            choice = Integer.parseInt(reader.readLine());

            // Second choice increased
            this.incByOne(choice);

            // Set speed
            this.setSpeed(30);
        }
        // Half Orc
        else if(this.race.equals(this.races[5])) {
            // All half orcs get +2 to strength and +1 to constitution
            // as well as 30 speed by default
            this.strength += 2;
            this.constitution++;
            // Set speed
            this.setSpeed(30);
        }
        // Halfling
        else if(this.race.equals(this.races[6])) {
            // All halflings get +2 to dexterity as well as 25 speed by default
            this.dexterity += 2;
            // Set speed
            this.setSpeed(25);

            // Prompt user to pick subrace
            System.out.println(SUBRACE);
            System.out.print("0. Lightfoot\n1. Stout\n");
            choice = Integer.parseInt(reader.readLine());

            // Input validation
            while(choice < 0 || choice > 5) {
                System.out.println("\nInvalid choice entered.  Please enter a number from 0 - 11:\t");
                choice = Integer.parseInt(reader.readLine());
            }

            // Lightfoot gets charisma +1
            if(choice == 0)
                this.charisma++;
            // Sout gets constitution +1
            else if(choice == 1)
                this.constitution++;
        }
        // Human
        else if(this.race.equals(this.races[7])) {
            // All humans get +1 to EACH of their ability scores and 30 speed
            // by default
            for(int i = 0; i < 6; i++) {
                this.incByOne(i);
            }
            // Set speed
            this.setSpeed(30);
        }
        // Tiefling
        else if(this.race.equals(this.races[8])) {
            // All tieflings get +1 to intelligence and +2 to their choice of
            // either dexterity or charisma as well as 30 speed by default
            this.intelligence++;
            System.out.println("\n\nAs a " + this.race + ABIL_INC_TIEFLING);
            choice = Integer.parseInt(reader.readLine());

            // Input validation
            while(choice < 0 || choice > 1) {
                System.out.println("\nInvalid choice entered.  Please enter a number from 0 - 11:\t");
                choice = Integer.parseInt(reader.readLine());
            }

            // Charisma increase
            if(choice == 0)
                this.charisma += 2;
            else if(choice == 1)
                this.dexterity += 2;
        }
    }
}
