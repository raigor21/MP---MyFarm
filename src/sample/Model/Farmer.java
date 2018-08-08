package sample.Model;

import java.util.Random;

public class Farmer {
    private String name;
    private int coins;
    private Level level;
    private Inventory inventory;
    private Field field;
    private Tools curTool;
    private Seed curSeed;

    public Tools getCurTool() {
        return curTool;
    }

    public void setCurTool(Tools curTool) {
        this.curTool = curTool;
    }

    public Seed getCurSeed() {
        return curSeed;
    }

    public void setCurSeed(Seed curSeed) {
        this.curSeed = curSeed;
    }

    public String getName() {
        return name;
    }

    public int getCoins() {
        return coins;
    }

    public Level getLevelClass() {
        return level;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Field getField() {
        return field;
    }

    public Tools getTools() {
        return curTool;
    }

    public Farmer(String name)

    {
        this.name = name;
        this.coins = 100;
        this.field = new Field();
        this.level = new Level();
        this.level.setType("Farmer");
        this.curTool = new Tools();
        this.inventory = new Inventory();
        }

    public void plowLand (int position)
    {
        // Validation checking
        double witherCost = field.getTiles().get(position).getSeed().getHC() * 0.1;

        if (field.getTiles().get(position).getIsOccupied() || field.getTiles().get(position).getHasRocks())
            System.out.println("Tile is occupied. Cannot be plowed!");


        else if (field.getTiles().get(position).getSeed().isWithered() && (witherCost > coins) )
            System.out.println("Insufficient coins to remove withered plant.");

        else if (field.getTiles().get(position).getIsPlowed())
            System.out.println("Tile already plowed.");

        else if (field.getTiles().get(position).getSeed().isWithered())
        {
            coins -= witherCost;
            field.getTiles().get(position).getSeed().setWithered(false);
            field.getTiles().get(position).setIsPlowed(false);
        }
        // Plowing of tile

        else
        {
            field.getTiles().get(position).setIsPlowed(true);
            level.addXp(5);
            level.levelUp();
        }

    }


    public void harvest (int position)
    {
        // Validation checking

        if (field.getTiles().get(position).getSeed().getHT() != 0)
            System.out.println("Not yet ready to harvest.");

        else if (field.getTiles().get(position).getSeed().getHC() > coins)
            System.out.println("Coins insufficient");

        else if (field.getTiles().get(position).getSeed().isWithered())
            System.out.println("Crop has withered.");

        else if (field.getTiles().get(position).getHasRocks())
            System.out.println("Invalid move.");

        // Harvesting the seed

        else
        {
            // Get products produced range

            Random random = new Random();
            field.getTiles().get(position).getSeed().setPP_t(random.nextInt(field.getTiles().get(position).getSeed().getPP_f()) + field.getTiles().get(position).getSeed().getPP_i());

            System.out.println("Total harvested: " + field.getTiles().get(position).getSeed().getPP_t());
            System.out.println("Total profit: "  + ( computeSP(position) - field.getTiles().get(position).getSeed().getSC() ) );

            coins += computeSP(position);

            field.getTiles().get(position).setIsOccupied(false);
            field.getTiles().get(position).setIsPlowed(false);

            level.addXp(5);
            level.levelUp();
        }

    }


    public boolean plantSeed (int position, Seed seed)
    {
        boolean found = false;
        int i = 0;

        // finds if you have the seed

        for (i = 0; i < inventory.getSeeds().size(); i++)
        {
            if (inventory.getSeeds().get(i).getName().equals(seed.getName()) )
                found = true;
        }


        if (found)
        {
            if (field.getTiles().get(position).getHasRocks())
                System.out.println("Tile has rocks. Unable to plant.");
            else if (field.getTiles().get(position).getIsOccupied())
                System.out.println("Tile has seeds already.");
            else if (!field.getTiles().get(position).getIsPlowed())
                System.out.println("Tile needs to be plowed first.");
            else
            {
                for (i = 0; i < inventory.getSeeds().size(); i++)
                    if (inventory.getSeeds().get(i).getName().equals(seed.getName()) )
                        inventory.getSeeds().remove(i);

                field.getTiles().get(position).setSeed(seed);
                field.getTiles().get(position).setIsOccupied(true);
                field.getTiles().get(position).getSeed().addNumFertilized( field.getTiles().get(position).getFertilizerApplied() );
            }

        }

        // if seed is not found

        else
            System.out.println("Seed not available");

        return found;

    }


    public boolean waterTile (int position)
    {
        if (!field.getTiles().get(position).getIsOccupied() || field.getTiles().get(position).getIsPlowed())
        {
            System.out.println("Plant a seed first!");
        }
        else if (field.getTiles().get(position).getHasRocks() || !field.getTiles().get(position).getIsPlowed())
        {
            System.out.println("Invalid move.");
        }
        else if (field.getTiles().get(position).getSeed().getWN_bl() > field.getTiles().get(position).getSeed().getNumOfWatered())
        {
            field.getTiles().get(position).getSeed().addNumOfWatered();
            return true;
        }

        return false;

    }

    public boolean applyFertilizer (int position)
    {
        if (!field.getTiles().get(position).getIsPlowed())
            System.out.println("Tile needs to be plowed.");
        else if (field.getTiles().get(position).getIsOccupied() || field.getTiles().get(position).getHasRocks())
            System.out.println("Cannot apply fertilizer");
        else if (inventory.getFertilizer() == 0)
            System.out.println("You have no fertilizer");
        else
        {
            field.getTiles().get(position).applyFertilizer();
            inventory.removeFertilizer();
            return true;
        }

        return false;
    }

    public boolean removeRocks(int position)
    {
        if (field.getTiles().get(position).getHasRocks())
        {
            field.getTiles().get(position).setHasRocks(false);
            return true;
        }

        return false;
    }

    public boolean buySeed(Seed seed)
    {
        double cost = seed.getSC();
        cost -= cost*(level.levelDiscount());

        if (coins < cost)
        {
            System.out.println("Coins insufficient");
        }

        else
        {
            System.out.println("Item bought successfully!");

            coins -= cost;
            inventory.addSeed(seed);
            level.addXp(10);
            if (level.levelUp())
            {
                System.out.println("Level up!");
            }

            return true;
        }

        return false;
    }

    public boolean buyFertilizer()
    {
        double cost = 10;
        cost -= cost*(level.levelDiscount());

        if (coins < cost)
        {
            System.out.println("Coins insufficient");
        }

        else
        {
            System.out.println("Item bought successfully!");

            cost -= cost*(level.levelDiscount());
            coins -= cost;
            inventory.addFertilizer();
            level.addXp(10);
            level.levelUp();

            return true;
        }

        return false;
    }


    public String seedInformation(int position)
    {
        return "Name: " + field.getTiles().get(position).getSeed().getName() + "\nCrop Type: " + field.getTiles().get(position).getSeed().getCT() +
                "\nWater Needed: " + field.getTiles().get(position).getSeed().getWN() + "\nFertilizer Needed: " + field.getTiles().get(position).getSeed().getFN() +
                "\nHarvest Cost: " + field.getTiles().get(position).getSeed().getHC() + "\nSeeds Cost: " + field.getTiles().get(position).getSeed().getSC() +
                "\nBase Selling Price: " + field.getTiles().get(position).getSeed().getBP();
    }

    public boolean setFarmerType(String type)
    {
        boolean fail = true;

        if (type.equals("Registered"))
        {
            if (coins >= 200)
            {
                if (level.setType(type))
                {
                    coins -= 200;
                    fail = false;

                    for (Seed i: inventory.getSeeds())
                        i.updateHT(level.getHarvestTime());

                }
            }
        }



        else if (type.equals("Distinguished"))
        {
            if (coins >= 250)
            {
                if (level.setType(type))
                {
                    coins -= 250;
                    fail = false;
                }
            }
        }



        else if (type.equals("Honorable"))
        {
            if (coins >= 350)
            {
                if (level.setType(type))
                {
                    coins -= 350;
                    fail = false;
                }

            }
        }

        if (fail)
            System.out.println("Insufficient coins to register.");

        return !fail;
    }


    public double computeSP(int position)
    {

            return  field.getTiles().get(position).getSeed().computeSP() + level.getEarningBuying() +
                ( level.levelDiscount() * field.getTiles().get(position).getSeed().computeSP() );

         
    }

}
