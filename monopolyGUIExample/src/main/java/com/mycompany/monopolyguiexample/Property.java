/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

/**
 *
 * @author Caleb Cope
 */
public class Property {
    String name;
    int position;
    int ownership; // This number represents the id of the player who owns it. The bank has an id of 4
    int cost;
    boolean is_mortgaged;
    String color;

    Property(String n, int p) {
        this.name = n;
        this.position = p;
        this.ownership = 4; // 4 represents the bank
        this.is_mortgaged = false;
        if (p % 5 == 0) {
            color = "black";
        }
        else if (p == 12 || p == 28) {
            color = "white";
        }
        else if (p < 5) {
            color = "brown";
        }
        else if (p < 10) {
            color = "lightBlue";
        }
        else if (p < 15) {
            color = "pink";
        }
        else if (p < 20) {
            color = "orange";
        }
        else if (p < 25) {
            color = "red";
        }
        else if (p < 30) {
            color = "yellow";
        }
        else if (p < 35) {
            color = "green";
        }
        else if (p < 40) {
            color = "darkBlue";
        }
    }
    void printInfo() {
        System.out.println();
        System.out.println("\tProperty name: ".concat(this.name));
	System.out.println("\tProperty position: ".concat(String.valueOf(this.position)));
	System.out.println("\tProperty cost: ".concat(String.valueOf(this.cost)));
	//System.out.println("\tProperty base rent: ".concat(String.valueOf(this.base_rent)));

	// ========= Demonstrate how to find the color of a property =========
	//String color;
        /*switch (this.type) {
            case 'r':
                color = "Railroad";
                break;
            case 'u':
                color = "Utility";
                break;
            default:
                if (this.position < 5)
                        color = "Brown";
                else if (this.position < 10)
                    color = "Light Blue";
                else if (this.position < 15)
                    color = "Magenta";
                else if (this.position < 20)
                    color = "Orange";
                else if (this.position < 25)
                    color = "Red";
                else if (this.position < 30)
                    color = "Yellow";
                else if (this.position < 35)
                    color = "Green";
                else
                    color = "Dark Blue";
                break;
        }
	System.out.println("\tProperty type: ".concat(color));*/
    }
    
    int calculateRent(Player owner, int diceRoll) {
        return 0;
    }     
}
