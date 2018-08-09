/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author BEAST
 */
public class Turnip extends Seed{

    public Turnip(double newHT) {
        super("Turnip", "Vegetable", 1, 1, 2, 0, 1, 1, 1, 1, 5, 6, newHT);
    }
    
    @Override
    public double computeSP(){
        if(super.getCT().equals("Flower"))
            return super.getBP() + super.getNumOfWatered() * (super.getBP() / 4) + super.getNumFertilized() * (super.getBP() / 4) + 0.5 * (super.getBP() + super.getNumOfWatered() * (super.getBP() / 4) + super.getNumFertilized() * (super.getBP() / 4));
        else
            return super.getBP() + super.getNumOfWatered() * (super.getBP() / 4) + super.getNumFertilized() * (super.getBP() / 4);
            
        
    }
    
}
