package sample.Model;

import java.util.ArrayList;

public class Field {
    private ArrayList<Tile> tiles;

    public Field()
    {
        this.tiles = new ArrayList<Tile>();
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void displayTileInfo(int position)
    {
        if (tiles.get(position).getIsOccupied())
            System.out.println("The tile has a seed planted.");
        else if (tiles.get(position).getIsPlowed())
            System.out.println("The tile is plowed.");
        else if (tiles.get(position).getHasRocks())
            System.out.println("The tile has rocks.");


    }
}
