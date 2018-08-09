package Model;

public class Level {

    private int level;
    private int xp;
    private int earningBuying;
    private int bonusLimits;
    private double harvestTime;
    private int fee;
    public String type;

    public Level()
    {
        this.level = 1;
        this.xp = 0;
        this.earningBuying = 0;
        this.bonusLimits = 0;
        this.harvestTime = 0.0;
        this.type = "Farmer";

    }

    public boolean setType (String type)
    {
        if (type.equals("Registered"))
        {
            if (level < 10)
                System.out.println("Level not yet reached.");
            else
            {
                harvestTime = 0.05;
                earningBuying = 2;
                this.type = "Registered Farmer.";
                return true;
            }
        }

        else if (type.equals("Distinguished"))
        {
            if (level < 15)
                System.out.println("Level not yet reached.");
            else
            {
                harvestTime = 0.1;
                earningBuying = 3;
                bonusLimits = 1;
                this.type = "Distinguished Farmer.";
                return true;
            }
        }

        else if (type.equals("Honorable"))
        {
            if (level < 20)
                System.out.println("Level not yet reached.");
            else
            {
                harvestTime = 0.15;
                earningBuying = 5;
                bonusLimits = 2;
                this.type = "Honorable Farmer.";
                return true;
            }
        }

        return false;


    }

    public int getLevel() {
        return level;
    }

    public boolean levelUp() {
        if (level*100 <= this.xp)
        {
            level++;
            return true;
        }
        return false;
    }

    public double levelDiscount()
    {
        return (double) (level-1) * 0.01;
    }

    public int getXp() {
        return xp;
    }

    public void addXp(int xp) {
        this.xp += xp;
    }

    public int getEarningBuying() {
        return earningBuying;
    }

    public void setEarningBuying(int earningBuying) {
        this.earningBuying = earningBuying;
    }

    public int getBonusLimits() {
        return bonusLimits;
    }

    public void setBonusLimits(int bonusLimits) {
        this.bonusLimits = bonusLimits;
    }

    public double getHarvestTime() {
        return harvestTime;
    }

    public void setHarvestTime(double harvestTime) {
        this.harvestTime = harvestTime;
    }

    public String getType() {
        return type;
    }

}
