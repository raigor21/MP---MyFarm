

package Model;

import java.util.ArrayList;

public class Inventory {
   private int fertilizer;
   private Tools tools;
   private ArrayList<Seed> seeds;

   public Inventory(){
       this.tools = new Tools();
       this.fertilizer = 5;
       this.seeds = new ArrayList<Seed>();
   }
   
   public void addFertilizer(){
       this.fertilizer = this.fertilizer + 1;
   }
   
   public void removeFertilizer(){
       this.fertilizer = this.fertilizer - 1;
   }
   
   public void addSeed(Seed seed){
       this.seeds.add(seed);
   }
   
   public int countSpecificSeed(String SN){
       int count = 0;
       for(int i = 0; i < this.seeds.size();i++)
           if(this.seeds.get(i).getName().equals(SN))
               count = count + 1;
       
       return count;
       
   }
   
   public int getFertilizer(){
       return this.fertilizer;
   }
   
   public Tools getTools(){
       return this.tools;
   }
   
   public ArrayList<Seed> getSeeds(){
       return this.seeds;
   }
   
   
   
}
