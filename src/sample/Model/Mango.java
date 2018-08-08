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
public class Mango extends Seed{

    public Mango(double newHT){
        super("Mango", "FruitTree", 7, 7, 7, 4, 4, 3, 5, 10,50,4, newHT);
    }
    
    @Override
    public double computeSP(){
        if(super.getCT().equals("Flower"))
            return super.getBP() + super.getNumOfWatered() * (super.getBP() / 4) + super.getNumFertilized() * (super.getBP() / 4) + 0.5 * (super.getBP() + super.getNumOfWatered() * (super.getBP() / 4) + super.getNumFertilized() * (super.getBP() / 4));
        else
            return super.getBP() + super.getNumOfWatered() * (super.getBP() / 4) + super.getNumFertilized() * (super.getBP() / 4);
            
        
    }
    
    
    
}
