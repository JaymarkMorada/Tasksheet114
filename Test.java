
public class Test {

    public static void main(String[] args) {

        GameCharacter layla = new GameCharacter("Layla", 1000, 500, 300, 25, 50, 20, 100);
        GameCharacter miya = new GameCharacter("Miya", 1200, 350, 400, 30, 40, 15, 120);

        layla.displayStats();
        miya.displayStats();

        layla.useSkill("Energy Burst", 100, 450);

        // Miya takes damage from Layla's attack
        miya.takeDamage(layla.damage);

        // Miya uses a skill
        miya.useSkill("Arrow Barrage", 120, 300);

        // Layla takes damage from Miya's skill
        layla.takeDamage(miya.damage);
    }
}


// Class representing a character with stats and skills
class GameCharacter {

    String name;
    int hp;
    int damage;
    int mana;
    int criticalChance;
    int armor;
    int penetration;
    int manaConsumption;

    // Constructor to initialize the character's stats
    public GameCharacter(String name, int hp, int damage, int mana, int criticalChance, int armor, int penetration, int manaConsumption) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.mana = mana;
        this.criticalChance = criticalChance;
        this.armor = armor;
        this.penetration = penetration;
        this.manaConsumption = manaConsumption;
    }

    // Method to simulate taking damage
    public void takeDamage(int incomingDamage) {
        this.hp -= incomingDamage;
        if (this.hp <= 0) {
            this.hp = 0;  // Prevent negative HP
            System.out.println(this.name + " has died.");
        } else {
            System.out.println(this.name + " has " + this.hp + " HP left.");
        }
    }

    // Method to use a skill
    public void useSkill(String skillName, int manaCost, int skillDamage) {
        if (this.mana >= manaCost) {
            this.mana -= manaCost;
            System.out.println(this.name + " uses skill: " + skillName + " dealing " + skillDamage + " damage!");
            System.out.println(this.name + " has " + this.mana + " mana left.");
        } else {
            System.out.println(this.name + " doesn't have enough mana to use " + skillName + ".");
        }
    }

    // Method to display character stats
    public void displayStats() {
        System.out.println("Character: " + this.name);
        System.out.println("HP: " + this.hp);
        System.out.println("Damage: " + this.damage);
        System.out.println("Mana: " + this.mana);
        System.out.println("Critical Chance: " + this.criticalChance + "%");
        System.out.println("Armor: " + this.armor);
        System.out.println("Penetration: " + this.penetration);
        System.out.println("Mana Consumption: " + this.manaConsumption);
        System.out.println();
    }
}