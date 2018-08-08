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
public abstract class Seed {
    private String name;
    private String CT;
    private double HT;
    private int WN;
    private int WN_bl;
    private int FN;
    private int FN_bl;
    private int HC;
    private int PP_i;
    private int PP_f;
    private int PP_t;
    private double SC;
    private double BP;
    private boolean withered;
    private int numOfWatered;
    private int numFertilized;
    private boolean product;

    public Seed(String name, String CT, double HT, int WN, int WN_bl, int FN, int FN_bl, int HC, int PP_i, int PP_f, double SC, double BP, double newHT) {
        this.name = name;
        this.CT = CT;
        this.HT = HT;
        this.WN = WN;
        this.WN_bl = WN_bl;
        this.FN = FN;
        this.FN_bl = FN_bl;
        this.HC = HC;
        this.PP_i = PP_i;
        this.PP_f = PP_f;
        this.PP_t = 0;
        this.SC = SC;
        this.BP = BP;
        this.withered = false;
        this.numFertilized = 0;
        this.numOfWatered = 0;
        this.product = false;

        updateHT(newHT);
    }
    
    abstract double computeSP();
    
    public void addNumFertilized(int fertilizer){
        this.numFertilized = fertilizer;
    }
    
    public void addNumOfWatered(){
        this.numOfWatered = this.numOfWatered + 1;
    }
    
     public boolean hasProduct(){
        return this.product;
    }
   
    public void setHT(double HT) {
        this.HT -= (this.HT*HT);
    }

    public void updateHT(double newHT){
        this.HT -= (this.HT*newHT);
    }

    public void setPP_t(int PP_t) {
        this.PP_t = PP_t;
    }

    public void setWithered(boolean withered) {
        this.withered = withered;
    }

    public String getName() {
        return name;
    }

    public String getCT() {
        return CT;
    }

    public double getHT() {
        return HT;
    }

    public int getWN() {
        return WN;
    }

    public int getWN_bl() {
        return WN_bl;
    }

    public int getFN() {
        return FN;
    }

    public int getFN_bl() {
        return FN_bl;
    }

    public int getHC() {
        return HC;
    }

    public int getPP_i() {
        return PP_i;
    }

    public int getPP_f() {
        return PP_f;
    }

    public int getPP_t() {
        return PP_t;
    }

    public double getSC() {
        return SC;
    }

    public double getBP() {
        return BP;
    }

    public boolean isWithered() {
        return withered;
    }

    public int getNumOfWatered() {
        return numOfWatered;
    }

    public int getNumFertilized() {
        return numFertilized;
    }

   

    
    
    
    

}
