package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import Model.*;

public class SeedBagController {
    @FXML
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;

    @FXML
    Button p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;

    @FXML
    Label coinsDisplay, expDisplay;

    @FXML
    Label turnipCtr, carrotCtr, tomatoCtr, potatoCtr, roseCtr, tulipCtr, stargazerCtr, sunflowerCtr, mangoCtr, appleCtr, bananaCtr, orangeCtr;

    @FXML
    TextArea SBLog;

    Farmer farmer = new Farmer("Stanley");

    public void levelUpMessage()
    {
        if (farmer.getLevelClass().levelUp())
            SBLog.setText("Level up!");
    }
    public void displayCoinsExp()
    {
        coinsDisplay.setText("Coins: " + farmer.getCoins());
        expDisplay.setText(" Exp: " + farmer.getLevelClass().getXp());
    }


    public void initialize()
    {
        displayCoinsExp();


        b1.setOnAction(e -> {
            Turnip turnip = new Turnip(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(turnip))
            {
                SBLog.setText(turnip.getName() + " bought successfully! -" + turnip.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(turnip.getName()));
                turnipCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

        b2.setOnAction(e -> {
            Carrot carrot = new Carrot(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(carrot))
            {
                SBLog.setText(carrot.getName() + " bought successfully! -" + carrot.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(carrot.getName()));
                carrotCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

        b3.setOnAction(e -> {
            Tomato tomato = new Tomato(farmer.getLevelClass().getHarvestTime());

            if (farmer.buySeed(tomato)) {
                SBLog.setText(tomato.getName() + " bought successfully! -" + tomato.getSC() + " coins");
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(tomato.getName()));
                tomatoCtr.setText(quant);
                } else {
                SBLog.setText("Insufficient Coins");
                }
        });

        b4.setOnAction(e -> {
            Potato potato = new Potato(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(potato))
            {
                SBLog.setText(potato.getName() + " bought successfully! -" + potato.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(potato.getName()));
                potatoCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

        b5.setOnAction(e -> {
            Rose rose = new Rose(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(rose))
            {
                SBLog.setText(rose.getName() + " bought successfully! -" + rose.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(rose.getName()));
                roseCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

        b6.setOnAction(e -> {
            Tulip tulip = new Tulip(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(tulip))
            {
                SBLog.setText(tulip.getName() + " bought successfully! -" + tulip.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(tulip.getName()));
                tulipCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

        b7.setOnAction(e -> {
            Stargazer stargazer = new Stargazer(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(stargazer))
            {
                SBLog.setText(stargazer.getName() + " bought successfully! -" + stargazer.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(stargazer.getName()));
                stargazerCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

        b8.setOnAction(e -> {
            Sunflower sunflower = new Sunflower(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(sunflower))
            {
                SBLog.setText(sunflower.getName() + " bought successfully! -" + sunflower.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(sunflower.getName()));
                sunflowerCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

        b9.setOnAction(e -> {
            Mango mango = new Mango(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(mango))
            {
                SBLog.setText(mango.getName() + " bought successfully! -" + mango.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(mango.getName()));
                mangoCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

        b10.setOnAction(e -> {
            Apple apple = new Apple(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(apple))
            {
                SBLog.setText(apple.getName() + " bought successfully! -" + apple.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(apple.getName()));
                appleCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

        b11.setOnAction(e -> {
            Banana banana = new Banana(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(banana))
            {
                SBLog.setText(banana.getName() + " bought successfully! -" + banana.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(banana.getName()));
                bananaCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

        b12.setOnAction(e -> {
            Orange orange = new Orange(farmer.getLevelClass().getHarvestTime());

            if(farmer.buySeed(orange))
            {
                SBLog.setText(orange.getName() + " bought successfully! -" + orange.getSC() + " coins" );
                displayCoinsExp();
                levelUpMessage();

                String quant = Integer.toString(farmer.getInventory().countSpecificSeed(orange.getName()));
                orangeCtr.setText(quant);
            }
            else
            {
                SBLog.setText("Insufficient Coins");
            }

        });

//        p1.setOnAction(e -> {
//            if (turnipCtr.equals(0))
//                SBLog.setText("You have no seed to plant!");
//            else
//                farmer.setCurSeed();
//
//        });









    }
}
