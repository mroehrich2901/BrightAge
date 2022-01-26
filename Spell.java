public class Spell
{
    private final String HEALING = "healing" ;
    private final String FLAMES = "flames" ;

    private String spellName ;
    private int healingPoints ;
    private int destructionPoints ;

    public Spell(String spellName)
    {
        this.spellName = spellName ;

        if (spellName.equals(HEALING))
        {
            setHealingPoints(5);
            setDestructionPoints(0);
        }

        if (spellName.equals (FLAMES))
        {
            setHealingPoints(0);
            setDestructionPoints(10);
        }
    }

    // Accessor Methods

    public String getSpellName () {return spellName;}

    public int getHealingPoints(){return healingPoints;}

    public int getDestructionPoints(){return destructionPoints;}

    // Mutator Methods

    public void setHealingPoints(int newHealingPoints) {healingPoints = newHealingPoints ;}

    public void setDestructionPoints(int newDestructionPoints) {destructionPoints = newDestructionPoints;}

    //toString

    public String toString () {return spellName ;}


}
