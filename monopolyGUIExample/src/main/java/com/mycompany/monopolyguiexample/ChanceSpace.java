/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 *
 * @author Caleb Cope + Jacob Braden
 */
public class ChanceSpace extends Space {
    ChanceSpace(int p) {
        super("Chance", p);
    }

    @Override
    void handleEvent(int diceRoll, ArrayList<Player> allPlayers, Player player, 
            Button rollButton, Button moveButton, Button yes, Button no, 
            Button endTurn, Button viewEvent, Text description, Space[] allspaces, Circle token) {
        endTurn.setDisable(false);
        
        List<TranslateTransition> movement = new ArrayList();
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(token);
        
        Random rand = new Random();
        
        int randomInt = rand.nextInt(15);
        String message = "";
     
        switch (randomInt) {
                //Advance to Go
                case 0: message = "Advance to Go! Collect $200.";
                    player.position = 0;
                    player.playerMoney += 200;
                    translate.setToX(0);
                    translate.setToY(0);
                break;
                //go to Charger Union [space 39]
                case 1: message = "Visit the Charger Union! Head to that space.";
                    player.position = 39;
                    translate.setToY(-75);
                    translate.setToX(-9);
                break;
                //go to Shelby Center [space 27]
                case 2: 
                    message = "Get some math done at the Shelby Center. Collect $200 if you pass Go.";
                    if (player.position > 27)
                        player.payMoney(-200);
                    player.position = 27;
                    translate.setToY(-546);
                    translate.setToX(-178);
                break;
                //go to Morton Hall [space 11]
                case 3:
                    message = "Study some English at Morton Hall. Collect $200 if you pass Go.";
                    if (player.position > 11)
                        player.payMoney(-200);
                    player.position = 11;
                    translate.setToX(-548);
                    translate.setToY(-75);
                break;
                //go to Nearest Coffee Shop {space 12 or 28]
                case 4: 
                    message = "You need some energy, quick. Get to the nearest Coffee Shop!";
                    if (player.position > 12 && player.position < 28) {
                        player.position = 28;
                        translate.setToY(-546);
                        translate.setToX(-128);
                    }
                    else {
                        if (player.position > 28)
                            player.payMoney(-200);
                        player.position = 12;
                        translate.setToX(-548);
                        translate.setToY(-125);
                    }
                break;
                //go to Nearest Parking Spot [space 5, 15, 25, 35]
                case 5:
                    message = "You're in a rush! Advance to the nearest parking spot.";
                    if (player.position > 5 && player.position < 15) {
                        player.position = 15;
                        translate.setToY(-275);
                        translate.setToX(-548);
                    }
                    else if (player.position > 15 && player.position < 25) {
                        player.position = 25;
                        translate.setToY(-546);
                        translate.setToX(-278);
                    }
                    else {
                        if (player.position > 35)
                            player.payMoney(-200);
                        player.position = 5;
                        translate.setToY(0);
                        translate.setToX(-278);
                    }
                break;
                //go to Nearest Parking Spot [space 5, 15, 25, 35]
                case 6:
                    message = "You're in a rush! Advance to the nearest parking spot.";
                    if (player.position > 5 && player.position < 15) {
                        player.position = 15;
                        translate.setToY(-275);
                        translate.setToX(-548);
                    }
                    else if (player.position > 15 && player.position < 25) {
                        player.position = 25;
                        translate.setToY(-546);
                        translate.setToX(-278);
                    }
                    else {
                        if (player.position > 35)
                            player.payMoney(-200);
                        player.position = 5;
                        translate.setToY(0);
                        translate.setToX(-278);
                    }
                break;
                //go to Parking Deck [space 5]
                case 7:
                    message = "Head to the parking deck so you can get to class. Collect $200 if you pass Go.";
                    if (5 - player.position < 0)
                        player.payMoney(-200);
                    player.playerPosition(5 - player.position);
                    translate.setToY(0);
                    translate.setToX(-278);
                break;
                //pay 100
                case 8:
                    message = "You needed more dining dollars. Pay $100 to the bank.";
                    player.payMoney(100);
                break;
                //Pay 15
                case 9:
                    message = "You trampled a bed of flowers and had to get new ones. Pay $15 to the bank.";
                    player.payMoney(15);
                break;
                //pay 50
                case 10:
                    message = "You got a parking fee. Pay $50 to the bank.";
                    player.payMoney(50);
                break;
                //get paid 50
                case 11:
                    message = "You got a thanks for helping set up events on campus. Earn $50.";
                    player.payMoney(-50);
                break;
                //get 150
                case 12:
                    message = "Earn a paycheck working at the desk. Get $150.";
                    player.payMoney(-150);
                break;
                //go to jail
                case 13:
                    message = "GO TO JAIL! Don't pass Go; don't collect $200.";
                    player.position = 40;
                    translate.setToX(-527);
                    translate.setToY(-22);
                break;
                //get out of jail free
                case 14:
                    message = "GET OUT OF JAIL FREE! Use this to leave jail.";
                    //raise GOOJF tally +1
                    player.jailCardCounter++;
                break;
                
        }
        
        description.setText("Chance!\n" + message);
        
        movement.add(translate);
        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(movement);
        sequentialTransition.play();
    }
    
    @Override
    void spawnPopUp(String message, Button popupOK, Text popupDescription, Text popupInstruction, int diceRoll, ArrayList<Player> allPlayers, Player currentPlayer, Space[] allSpaces) {
        popupDescription.setText(message);
    }
}

