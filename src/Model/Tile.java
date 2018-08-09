package Model;

public class Tile {
    private boolean isPlowed;
    private boolean isOccupied;
    private boolean hasRocks;
    private Seed seed;
    private int fertilizerApplied;

    public Tile ()
    {
        this.isPlowed = false;
        this.isOccupied = false;
        this.seed = null;
        this.fertilizerApplied = 0;
    }

    public boolean getIsPlowed() {
        return isPlowed;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public boolean getHasRocks() {
        return hasRocks;
    }

    public Seed getSeed() {
        return seed;
    }

    public int getFertilizerApplied() {
        return fertilizerApplied;
    }

    public void applyFertilizer() {
        this.fertilizerApplied++;
    }

    public void setIsPlowed(boolean plowed) {
        isPlowed = plowed;
    }

    public void setIsOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setHasRocks(boolean hasRocks) {
        this.hasRocks = hasRocks;
    }

    public void setSeed(Seed seed) {
        this.seed = seed;
    }
}
