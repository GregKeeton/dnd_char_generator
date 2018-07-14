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
    String name;
    String race;
    boolean gender;
    int specialization;
    int speed;

    // Ability scores
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

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

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void allocateScores(int scores[]) throws IOException {
        if(scores.length == 6) {
            if(this.specialization == 0) {
                this.setIntelligence(scores[0]);
                this.setCharisma(scores[1]);
                this.setWisdom(scores[2]);
                this.setDexterity(scores[3]);
                this.setConstitution(scores[4]);
                this.setStrength(scores[5]);
            }
            else if(this.specialization == 1) {
                this.setIntelligence(scores[0]);
                this.setWisdom(scores[1]);
                this.setStrength(scores[2]);
                this.setConstitution(scores[3]);
                this.setDexterity(scores[4]);
                this.setCharisma(scores[5]);
            }
            //else if(this.specialization == 2) {

            //}
            else if(this.specialization == 3) {
                this.setStrength(scores[0]);
                this.setCharisma(scores[1]);
                this.setIntelligence(scores[2]);
                this.setConstitution(scores[3]);
                this.setDexterity(scores[4]);
                this.setWisdom(scores[5]);
            }
            else if(this.specialization == 4) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int choice;
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
        }
    }
}
