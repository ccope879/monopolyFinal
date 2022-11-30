/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

/**
 *
 * @author Caleb Cope
 */
public class UtilityProperty extends Property {
    UtilityProperty(String n, int p) {
        super(n, p);
        this.cost = 150;
    }
    
    @Override
    int calculateRent(Player owner, int diceRoll) {
        int rent;
        if (owner.utilityAmount == 1)
            rent = diceRoll * 4;
        else
            rent = diceRoll * 10;
        return rent;
    }
}
