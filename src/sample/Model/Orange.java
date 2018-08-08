/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.Model;

/**
 *
 * @author BEAST
 */
public class Orange extends Seed{

    public Orange(double newHT) {
        super("Orange", "FruitTree", 8, 8, 8, 6, 6, 3, 13, 15, 65, 4.5, newHT);
    }
    
    @Override
    public double computeSP(){
        if(super.getCT().equals("Flower"))
            return super.getBP() + super.getNumOfWatered() * (super.getBP() / 4) + super.getNumFertilized() * (super.getBP() / 4) + 0.5 * (super.getBP() + super.getNumOfWatered() * (super.getBP() / 4) + super.getNumFertilized() * (super.getBP() / 4));
        else
            return super.getBP() + super.getNumOfWatered() * (super.getBP() / 4) + super.getNumFertilized() * (super.getBP() / 4);
            
        
    }
    
}
