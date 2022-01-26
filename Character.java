import java.util.ArrayList ;
import java.util.Random ;
public class Character {

    // Permanents

    private String name;
    private String race;
    private String birthSign;

    //Vitals

    private int health;
    private int minHealthCapacity;
    private int maxHealthCapacity;

    private int mana;
    private int minManaCapacity;
    private int maxManaCapacity;

    // Inventories

    private ArrayList weaponInventory = new ArrayList<Weapon>();

    private ArrayList armorInventory = new ArrayList<Armor>();

    private ArrayList spellInventory = new ArrayList<Spell>();

    // Player Equips

    private Weapon equippedWeapon = null;
    private Armor equippedArmor = null;
    private Spell equippedSpell = null;

    // Enemy Equips

    private Weapon enemyEquippedWeapon = null;
    private Armor enemyEquippedArmor = null;

    // Races

    private final String MAN = "Man";
    private final String ORC = "Orc";
    private final String WOOD_ELF = "Wood Elf";
    private final String ANCIENT_ELF = "Ancient Elf";
    private final String DWARF = "Dwarf";

    // Birth Sign

    private final String BODYGUARD = "Bodyguard";
    private final String WARRIOR = "Warrior";
    private final String HUNTER = "Hunter";
    private final String CRAFTSMAN = "Craftsman";
    //private final String CAPTAIN = "Captain";
    private final String MAGE = "Mage";
    private final String SCHOLAR = "Scholar";

    // Combat Variables

    private String diceRollType;

    // Skills

    private int level;
    private int xp;
    private int lightWarriorLevel;
    private int heavyWarriorLevel;
    private int archeryLevel;
    private int smithLevel;
    private int magicLevel;
    private int alchemyLevel;

    // Constructor

    //Man: Light Warrior and Archery
    //Orc: Heavy Warrior and Smithing
    //Wood Elf: Archery and alchemy
    //Ancient Elf: Magic and Alchemy
    //Dwarf: Smithing and Light Warrior

    public Character(String characterRace, String characterName, String characterSign) {
        setRace(characterRace);
        setName(characterName);
        setBirthSign(characterSign);

        if (characterRace.equals(MAN)) {
            setRace(MAN);
            setHealth(25);
            setMinHealthCapacity(0);
            setMaxHealthCapacity(25);
            setMana(10);
            setMinManaCapacity(0);
            setMaxManaCapacity(10);
            setLevel(1);
            setXp(0);
            setLightWarriorLevel(5);
            setHeavyWarriorLevel(1);
            setArcheryLevel(3);
            setSmithLevel(1);
            setMagicLevel(1);
            setAlchemyLevel(1);
        }

        if (characterRace.equals(ANCIENT_ELF)) {
            setRace(ANCIENT_ELF);
            setHealth(25);
            setMinHealthCapacity(0);
            setMaxHealthCapacity(25);
            setMana(20);
            setMinManaCapacity(0);
            setMaxManaCapacity(20);
            setLevel(1);
            setXp(0);
            setLightWarriorLevel(1);
            setHeavyWarriorLevel(1);
            setArcheryLevel(1);
            setSmithLevel(1);
            setMagicLevel(5);
            setAlchemyLevel(3);
        }

        if (characterRace.equals(WOOD_ELF)) {
            setRace(WOOD_ELF);
            setHealth(25);
            setMinHealthCapacity(0);
            setMaxHealthCapacity(25);
            setMana(20);
            setMinManaCapacity(0);
            setMaxManaCapacity(20);
            setLevel(1);
            setXp(0);
            setLightWarriorLevel(1);
            setHeavyWarriorLevel(1);
            setArcheryLevel(5);
            setSmithLevel(1);
            setMagicLevel(1);
            setAlchemyLevel(3);
        }

        if (characterRace.equals(DWARF)) {
            setRace(DWARF);
            setHealth(25);
            setMinHealthCapacity(0);
            setMaxHealthCapacity(25);
            setMana(10);
            setMinManaCapacity(0);
            setMaxManaCapacity(10);
            setLevel(1);
            setXp(0);
            setLightWarriorLevel(1);
            setHeavyWarriorLevel(3);
            setArcheryLevel(1);
            setSmithLevel(5);
            setMagicLevel(1);
            setAlchemyLevel(1);
        }

        if (characterRace.equals(ORC)) {
            setRace(ORC);
            setHealth(25);
            setMinHealthCapacity(0);
            setMaxHealthCapacity(25);
            setMana(10);
            setMinManaCapacity(0);
            setMaxManaCapacity(10);
            setLevel(1);
            setXp(0);
            setLightWarriorLevel(3);
            setHeavyWarriorLevel(5);
            setArcheryLevel(1);
            setSmithLevel(1);
            setMagicLevel(1);
            setAlchemyLevel(1);
        }

        if (characterSign.equals(BODYGUARD)) {
            setLightWarriorLevel(getLightWarriorLevel() + 5);
        }

        if (characterSign.equals(WARRIOR)) {
            setHeavyWarriorLevel(getHeavyWarriorLevel() + 5);
        }

        if (characterSign.equals(HUNTER)) {
            setArcheryLevel(getArcheryLevel() + 5);
        }

        if (characterSign.equals(CRAFTSMAN)) {
            setSmithLevel(getSmithLevel() + 5);
        }

        if (characterSign.equals(MAGE)) {
            setMagicLevel(getMagicLevel() + 5);
        }

        if (characterSign.equals(SCHOLAR)) {
            setAlchemyLevel(getAlchemyLevel() + 5);
        }


    }

    // Accessor Methods

    // Inventories
    public ArrayList getWeaponInventory() {
        return weaponInventory;
    }

    public ArrayList getArmorInventory() {
        return armorInventory;
    }

    public ArrayList getSpellInventory() {
        return spellInventory;
    }

    // Permanents
    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getBirthSign() {
        return birthSign;
    }

    // Vitals
    public int getHealth() {
        return health;
    }

    public int getMinHealthCapacity() {
        return minHealthCapacity;
    }

    public int getMaxHealthCapacity() {
        return maxHealthCapacity;
    }

    public int getMana() {
        return mana;
    }

    public int getMinManaCapacity() {
        return minManaCapacity;
    }

    public int getMaxManaCapacity() {
        return maxManaCapacity;
    }


    // Skills:
    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getLightWarriorLevel() {
        return lightWarriorLevel;
    }

    public int getHeavyWarriorLevel() {
        return heavyWarriorLevel;
    }

    public int getArcheryLevel() {
        return archeryLevel;
    }

    public int getSmithLevel() {
        return smithLevel;
    }

    public int getMagicLevel() {
        return magicLevel;
    }

    public int getAlchemyLevel() {
        return alchemyLevel;
    }


    // Combat Variables

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public Armor getEquippedArmor() {
        return equippedArmor;
    }

    public Spell getEquippedSpell() {
        return equippedSpell;
    }

    public Weapon getEnemyEquippedWeapon() {
        return enemyEquippedWeapon;
    }

    public Armor getEnemyEquippedArmor() {
        return enemyEquippedArmor;
    }

    public String getDiceRollType() {
        return diceRollType;
    }


    // Mutator Methods:

    // Permanents
    public void setName(String newName) {
        name = newName;
    }

    public void setRace(String newRace) {
        race = newRace;
    }

    public void setBirthSign(String newBirthSign) {
        birthSign = newBirthSign;
    }

    // Vitals
    public int setHealth(int newHealth) {
        health = newHealth;
        return newHealth;
    }

    public void setMinHealthCapacity(int newMinHealthCapacity) {
        minHealthCapacity = newMinHealthCapacity;
    }

    public void setMaxHealthCapacity(int newMaxHealthCapacity) {
        maxHealthCapacity = newMaxHealthCapacity;
    }

    public int setMana(int newMana) {
        mana = newMana;
        return newMana;
    }

    public void setMinManaCapacity(int newMinManaCapacity) {
        minHealthCapacity = newMinManaCapacity;
    }

    public void setMaxManaCapacity(int newMaxManaCapacity) {
        maxManaCapacity = newMaxManaCapacity;
    }


    // Combat Variables

    public void setDiceRollType(String newDiceRollType) {
        diceRollType = newDiceRollType;
    }

    // Skills
    public void setLevel(int newLevel) {
        level = newLevel;
    }

    public int setXp(int newXp) {
        xp = newXp;
        return newXp;
    }

    public void setLightWarriorLevel(int newLightWarriorLevel) {
        lightWarriorLevel = newLightWarriorLevel;
    }

    public void setHeavyWarriorLevel(int newHeavyWarriorLevel) {
        heavyWarriorLevel = newHeavyWarriorLevel;
    }

    public void setArcheryLevel(int newArcheryLevel) {
        archeryLevel = newArcheryLevel;
    }

    public void setSmithLevel(int newSmithLevel) {
        smithLevel = newSmithLevel;
    }

    public void setMagicLevel(int newMagicLevel) {
        magicLevel = newMagicLevel;
    }

    public void setAlchemyLevel(int newAlchemyLevel) {
        alchemyLevel = newAlchemyLevel;
    }

    //Combat:

    public void setEquippedWeapon(String promptInput) {
        for (int i = 0; i < weaponInventory.size(); i++) {
            Weapon weapon = (Weapon) weaponInventory.get(i);

            if (weapon.getWeaponName().equals(promptInput)) {
                equippedWeapon = weapon;
            }

        }
    }

    public void setEquippedArmor(String promptInput) {
        for (int i = 0; i < armorInventory.size(); i++) {
            Armor armor = (Armor) armorInventory.get(i);

            if (armor.getArmorName().equals(promptInput)) {
                equippedArmor = armor;
            }
        }
    }

    public void setEquippedSpell(String promptInput) {
        for (int i = 0; i < spellInventory.size(); i++) {
            Spell spell = (Spell) spellInventory.get(i);

            if (spell.getSpellName().equals(promptInput)) {
                equippedSpell = spell;
            }
        }
    }

    public void rollDice(String promptInput) {
        if (promptInput.equals("attack")) {
            Random dice = new Random();
            int rollResult = dice.nextInt(12);

            if (rollResult == 2 || rollResult == 4 || rollResult == 6 || rollResult == 8 || rollResult == 10 || rollResult == 12) {
                setDiceRollType("even");
                System.out.println("\nYou rolled " + rollResult + ", attack successful!");

            } else if (rollResult == 1 || rollResult == 3 || rollResult == 5 || rollResult == 7 || rollResult == 9 || rollResult == 11) {
                setDiceRollType("odd");
                System.out.println("\nYou rolled " + rollResult + ", attack failed!");
            }
        }
    }

    public void enemyRoll() {
        Random dice = new Random();
        int rollResult = dice.nextInt(12);

        if (rollResult == 2 || rollResult == 4 || rollResult == 6 || rollResult == 8 || rollResult == 10 || rollResult == 12) {
            setDiceRollType("even");
            System.out.println("\nEnemy rolled a " + rollResult + ", you have been damaged!");
        } else if (rollResult == 1 || rollResult == 3 || rollResult == 5 || rollResult == 7 || rollResult == 9 || rollResult == 11) {
            setDiceRollType("odd");
            System.out.println("\nEnemy rolled a " + rollResult + ", enemy attack failed!");
        }
    }

    public int damageEnemy(Weapon equippedWeapon)
    {
        int totalDamageEnemyPoints ;

        if (equippedWeapon.getWeaponType().equals("light warrior"))
        {
            totalDamageEnemyPoints = equippedWeapon.getDamagePoints() + (lightWarriorLevel/2) ;

            return totalDamageEnemyPoints;
        }

        else if (equippedWeapon.getWeaponType().equals("heavy warrior"))
        {
            totalDamageEnemyPoints = equippedWeapon.getDamagePoints() + (heavyWarriorLevel/2) ;

            return totalDamageEnemyPoints;
        }

        else if (equippedWeapon.getWeaponType().equals("archery"))
        {
            totalDamageEnemyPoints = equippedWeapon.getDamagePoints() + (archeryLevel/2) ;

            return totalDamageEnemyPoints;

        }
        else
            return 0;
    }

    public void castHealing(Spell equippedSpell) {

        int excessHealing;

        if (mana <= minManaCapacity || mana < 5)
            System.out.println("Not enough mana, cannot cast healing!");

        else if (mana > minManaCapacity && mana >= 5)
        {

            if (health < maxHealthCapacity)
            {
                health += equippedSpell.getHealingPoints();
                mana -= 10 - (mana* 0.10) ;
                System.out.println("Mana: " + mana);

                if (health > maxHealthCapacity)
                {
                    excessHealing = health - maxHealthCapacity;
                    health -= excessHealing;
                    System.out.println("Reached full health!");
                }
                else if (health == maxHealthCapacity)
                    System.out.println("Reached full health!");

                System.out.println(name + " Health: " + health);
            }
        }
    }

    public int castFlames (Spell equippedSpell) {
        if (mana <= minManaCapacity || mana < 10)
        {
            System.out.println("Not enough mana, cannot cast flames!");
            return 0;
        }
        else if (mana > minManaCapacity && mana >= 10)
        {
            Random dice = new Random();
            int rollResult = dice.nextInt(12);

            if (rollResult == 2 || rollResult == 4 || rollResult == 6 || rollResult == 8 || rollResult == 10 || rollResult == 12)
            {
                setDiceRollType("even");
                System.out.println("\nYou rolled " + rollResult + ", attack successful!");

                mana -= 10 - (mana * 0.10) ;
                System.out.println ("\nMana: " + mana) ;

                return equippedSpell.getDestructionPoints() ;

            }
            else if (rollResult == 1 || rollResult == 3 || rollResult == 5 || rollResult == 7 || rollResult == 9 || rollResult == 11)
            {
                setDiceRollType("odd");
                System.out.println("\nYou rolled " + rollResult + ", attack failed!");
                return 0 ;
            }
            else
                return 0 ;
        }
        else
            return 0 ;
    }



    //Crafting and Alchemy Methods:


    // Level Up Methods:

    public void levelUp()
    {
        setLevel(getLevel() + 1);
        setMaxHealthCapacity(getMaxHealthCapacity()+ 2);

        System.out.println("\nYou have leveled up!" + "\n Level: " + getLevel());

        System.out.println("\nSelect which skill you wish to increase: ") ;

        System.out.println("Light Warrior") ;
        System.out.println("Heavy Warrior") ;
        System.out.println("Archery") ;
        System.out.println("Smith") ;
        System.out.println("Magic") ;
        System.out.println("Alchemy") ;
    }


    public void skillLevelUp (String promptInput)
    {
        if (promptInput.equals("light warrior"))
            lightWarriorLevel += 5 ;

        if (promptInput.equals("heavy warrior"))
            heavyWarriorLevel += 5;

        if (promptInput.equals("archery"))
            archeryLevel += 5;

        if (promptInput.equals("smith"))
            smithLevel += 5;

        if (promptInput.equals("magic")) {
            magicLevel += 5;
            maxManaCapacity += 5;
        }

        if (promptInput.equals("alchemy"))
            alchemyLevel += 5;

        System.out.println ("\n" + characterMenu()) ;

    }

    // To string/character stats display methods

    public String characterMenu () {
        return "\nName: " + name +
                "\nRace: " + race +
                "\nLevel: " + level +
                "\nXP: " + xp +
                "\nLight Warrior Level: " + lightWarriorLevel +
                "\nHeavy Warrior Level: " + heavyWarriorLevel +
                "\nArchery Level: " + archeryLevel +
                "\nSmith Level: " + smithLevel +
                "\nMagic Level: " + magicLevel +
                "\nAlchemy Level: " + alchemyLevel ;
    }

}

