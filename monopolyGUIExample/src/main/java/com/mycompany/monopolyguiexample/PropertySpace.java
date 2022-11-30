/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 *
 * @author Caleb Cope
 */
public class PropertySpace extends Space {
    Property property;
    
    PropertySpace(Property prop) {
        super(prop.name, prop.position);
        this.property = prop;
    }

    @Override
    void handleEvent(int diceRoll, ArrayList<Player> allPlayers, Player player, 
            Button rollButton, Button moveButton, Button yes, Button no, 
            Button endTurn, Button viewEvent, Text description, Space[] allspaces, Circle token) {
        //Scanner s = new Scanner(System.in);
        endTurn.setDisable(true);
        if (this.property.ownership == 4) {
            yes.setVisible(true);
            yes.setDisable(false);
            no.setVisible(true);
            no.setDisable(false);
            
            //description.setText(this.property.name + " is unowned. Would you like to buy it?");
        }
        else if (this.property.ownership != player.id) {
            int rent = this.property.calculateRent(allPlayers.get(this.property.ownership), diceRoll);
            
            // current player pays rent
            player.payMoney(rent);

            // owner gets rent
            if (player.playerMoney >= rent) {
                allPlayers.get(this.property.ownership).playerMoney += rent;
            }
            else {
                allPlayers.get(this.property.ownership).playerMoney += player.playerMoney;
            }
        }
        endTurn.setDisable(false);
    }
    
    @Override
    void spawnPopUp(String message, Button popupOK, Text popupDescription, Text popupInstruction, int diceRoll, ArrayList<Player> allPlayers, 
            Player currentPlayer, Space[] allSpaces) {
        message = "";
        if (this.property.ownership != currentPlayer.id && this.property.ownership != 4) {
            int rent = this.property.calculateRent(allPlayers.get(this.property.ownership), diceRoll);
            message = "You must pay $" + String.valueOf(rent) + " to " + 
                    allPlayers.get(this.property.ownership).name + " for landing on " + this.property.name + "!";
        }
        if (this.property.ownership == 4) {
            message = this.property.name + " is unowned. Would you like to buy it for $" + this.property.cost + "?";
            popupOK.setVisible(false);
            popupInstruction.setVisible(false);
        }
        popupDescription.setText(message);
    }
}
