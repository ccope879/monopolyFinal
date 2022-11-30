/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Caleb Cope
 */
public class Space {
    String name;
    int position;
    //private ActionEvent event;
 

    Space(String n, int p) {
        this.name = n;
        this.position = p;
    }

    void handleEvent(int diceRoll, ArrayList<Player> allPlayers, Player player, 
            Button rollButton, Button moveButton, Button yes, Button no, 
            Button endTurn, Button viewEvent, Text description, Space[] allspaces, Circle token) {
        endTurn.setDisable(false);
        
        
    }
    
    void spawnPopUp(String message, Button popupOK, Text popupDescription, Text popupInstruction, int diceRoll, ArrayList<Player> allPlayers, 
        Player currentPlayer, Space[] allSpaces) {
        
        Space currSpace = allSpaces[currentPlayer.position];
        popupDescription.setText("You landed on " + currSpace.name + "! Press End Turn to end your turn.");
    }
}
