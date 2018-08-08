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
public class Tools {
  private boolean water;
  private boolean pickaxe;
  private boolean plow;

  public Tools(){
    this.water = true;
    this.pickaxe = true;
    this.plow = true;

  }

  public boolean getWater(){
    return this.water;
  }

  public boolean getPlow(){
    return this.plow;
  }

  public boolean getPickaxe(){
    return this.pickaxe;
  }

  public void getWaterInfo(){
    System.out.println("Water your plants to keep them hydrated :D");
  }

  public void getPlowInfo(){
    System.out.println("Plow lands to make the soil suitable for seeds to grow");
  }

  public void getPickaxeInfo(){
    System.out.println("Pickaxe to clear rocks on tiles");
  }
}
