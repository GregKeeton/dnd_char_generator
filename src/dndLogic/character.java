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
    private String name;
    private String race;
    private boolean gender;
    private int specialization;
    private int speed;

    // Ability scores
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getSpecialization() {
        return specialization;
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
}
