/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
/**
 * FXML Controller class
 *
 * @author Caleb Cope
 */
public class BoardController implements Initializable  {
    @FXML
    private ImageView backgroundImage;
    @FXML
    private Rectangle space10;
    @FXML
    private Rectangle space20;
    @FXML
    private Rectangle space0;
    @FXML
    private Rectangle space30;
    @FXML
    private Rectangle space19;
    @FXML
    private Rectangle space18;
    @FXML
    private Rectangle space17;
    @FXML
    private Rectangle space16;
    @FXML
    private Rectangle space1913;
    @FXML
    private Rectangle space15;
    @FXML
    private Rectangle space14;
    @FXML
    private Rectangle space13;
    @FXML
    private Rectangle space12;
    @FXML
    private Rectangle space11;
    @FXML
    private Rectangle space31;
    @FXML
    private Rectangle space32;
    @FXML
    private Rectangle space33;
    @FXML
    private Rectangle space34;
    @FXML
    private Rectangle space35;
    @FXML
    private Rectangle space36;
    @FXML
    private Rectangle space37;
    @FXML
    private Rectangle space38;
    @FXML
    private Rectangle space39;
    @FXML
    private Rectangle space9;
    @FXML
    private Rectangle space8;
    @FXML
    private Rectangle space6;
    @FXML
    private Rectangle space7;
    @FXML
    private Rectangle space5;
    @FXML
    private Rectangle space4;
    @FXML
    private Rectangle space3;
    @FXML
    private Rectangle space2;
    @FXML
    private Rectangle space1;
    @FXML
    private Rectangle space21;
    @FXML
    private Rectangle space22;
    @FXML
    private Rectangle space24;
    @FXML
    private Rectangle space23;
    @FXML
    private Rectangle space25;
    @FXML
    private Rectangle space26;
    @FXML
    private Rectangle space27;
    @FXML
    private Rectangle space28;
    @FXML
    private Rectangle space29;
    @FXML
    private Rectangle brown1;
    @FXML
    private Rectangle brown2;
    @FXML
    private Rectangle black1;
    @FXML
    private Rectangle black2;
    @FXML
    private Rectangle black3;
    @FXML
    private Rectangle black4;
    @FXML
    private Rectangle lightBlue1;
    @FXML
    private Rectangle lightBlue2;
    @FXML
    private Rectangle lightBlue3;
    @FXML
    private Rectangle magenta1;
    @FXML
    private Rectangle magenta2;
    @FXML
    private Rectangle magenta3;
    @FXML
    private Rectangle orange1;
    @FXML
    private Rectangle orange2;
    @FXML
    private Rectangle orange3;
    @FXML
    private Rectangle red1;
    @FXML
    private Rectangle red2;
    @FXML
    private Rectangle red3;
    @FXML
    private Rectangle yellow1;
    @FXML
    private Rectangle yellow2;
    @FXML
    private Rectangle yellow21;
    @FXML
    private Rectangle green1;
    @FXML
    private Rectangle green2;
    @FXML
    private Rectangle green3;
    @FXML
    private Rectangle darkBlue1;
    @FXML
    private Rectangle darkBlue2;
    @FXML
    private Rectangle jail1;
    @FXML
    private Rectangle jail2;
    @FXML
    private Rectangle logoBG;
    @FXML
    private Text logo;
    @FXML
    private Rectangle communityChest;
    @FXML
    private Rectangle chance;
    @FXML
    public Circle p1_token;
    @FXML
    public Circle p2_token;
    @FXML
    public Circle p3_token;
    @FXML
    public Circle p4_token;
    @FXML
    private Button rollButton;
    @FXML
    private Label die1_label;
    @FXML
    private Label die2_label;
    @FXML
    private Button moveButton;
    @FXML
    private RadioButton p1_choice;
    @FXML
    private RadioButton p2_choice;
    @FXML
    private RadioButton p3_choice;
    @FXML
    private RadioButton p4_choice;
    @FXML
    private Label currentSpaceLabel;
    @FXML
    private Label currentPlayerLabel;
    @FXML
    private Label p1_nam;
    @FXML
    private Label p1_pos;
    @FXML
    private Label p1_mon;
    @FXML
    private Label p1_props;
    @FXML
    private Label p2_nam;
    @FXML
    private Label p2_pos;
    @FXML
    private Label p2_mon;
    @FXML
    private Label p2_props;
    @FXML
    private Label p3_nam;
    @FXML
    private Label p3_pos;
    @FXML
    private Label p3_mon;
    @FXML
    private Label p3_props;
    @FXML
    private Label p4_nam;
    @FXML
    private Label p4_pos;
    @FXML
    private Label p4_mon;
    @FXML
    private Label p4_props;
    @FXML
    public Button propertyYesButton;
    @FXML
    public Button propertyNoButton;
    @FXML
    public Button endTurnButton;
    @FXML
    public Button eventButton;
    @FXML
    public Rectangle popupRect;
    @FXML
    public Text popupPlayerName;
    @FXML
    public Text popupDescription;
    @FXML
    public Line popupDivider;
    @FXML
    public Button popupOK;
    @FXML
    public Text popupInstruction;
    @FXML
    private Text spaceText1;
    @FXML
    private Text spaceText3;
    @FXML
    private Text spaceText5;
    @FXML
    private Text spaceText6;
    @FXML
    private Text spaceText8;
    @FXML
    private Text spaceText9;
    @FXML
    private Text spaceText11;
    @FXML
    private Text spaceText12;
    @FXML
    private Text spaceText13;
    @FXML
    private Text spaceText14;
    @FXML
    private Text spaceText15;
    @FXML
    private Text spaceText16;
    @FXML
    private Text spaceText18;
    @FXML
    private Text spaceText19;
    @FXML
    private Text spaceText21;
    @FXML
    private Text spaceText23;
    @FXML
    private Text spaceText24;
    @FXML
    private Text spaceText25;
    @FXML
    private Text spaceText26;
    @FXML
    private Text spaceText27;
    @FXML
    private Text spaceText28;
    @FXML
    private Text spaceText29;
    @FXML
    private Text spaceText31;
    @FXML
    private Text spaceText32;
    @FXML
    private Text spaceText34;
    @FXML
    private Text spaceText35;
    @FXML
    private Text spaceText37;
    @FXML
    private Text spaceText39;
    @FXML
    private ImageView spaceImage0;
    @FXML
    private ImageView spaceImage20;
    @FXML
    private ImageView spaceImage30;
    @FXML
    private ImageView goArrow;
    @FXML
    private ImageView chanceImage1;
    @FXML
    private ImageView chanceImage2;
    @FXML
    private ImageView chanceImage3;
    @FXML
    private ImageView chestImage1;
    @FXML
    private ImageView chestImage2;
    @FXML
    private ImageView chestImage3;
    @FXML
    private Button pay50Button;
    @FXML
    private Button rollDoublesButton;
    @FXML
    private Button useCardButton;
    @FXML
    private ImageView p1JailCard;
    @FXML
    private ImageView p2JailCard;
    @FXML
    private ImageView p3JailCard;
    @FXML
    private ImageView p4JailCard;
    @FXML
    private Button finishButton;
    
    
    String player1Name1;
    String player2Name2;
    String player3Name3;
    String player4Name4;
    
    String setNamePlayer1(String name) {
       p1_nam.setText(name);
       if(name.equals("")){
            p1_nam.setText("Player1");
        }
       return player1Name1;
    }
    String setNamePlayer2(String name) {
       p2_nam.setText(name);
       if(name.equals("")){
            p2_nam.setText("Player2");
        }
       return player2Name2;
    }
    String setNamePlayer3(String name) {
       p3_nam.setText(name);
       if(name.equals("")){
            p3_nam.setText("Player3");
        }
       return player3Name3;
    }
    String setNamePlayer4(String name) {
       p4_nam.setText(name);
       if(name.equals("")){
            p4_nam.setText("Player4");
        }
       return player4Name4;
    }
    
    Rectangle rect = new Rectangle();  // import the built rectangle class for Javafx app..
                                       // Set height, Width and X and Y axis.
    
    // Create bank to hold properties, houses, and hotels
    Bank bank = new Bank();
    
    // Create an array of Spaces
    Space[] allSpaces = createSpaces(bank.all_properties);
    
    //Create players
    Player player1 = new Player("Player 1", 565, 565, Color.rgb(255, 31, 116), 0);
    Player player2 = new Player("Player 2", 585, 565, Color.rgb(255, 31, 116), 1);
    Player player3 = new Player("Player 3", 565, 585, Color.rgb(255, 31, 116), 2);
    Player player4 = new Player("Player 4", 585, 585, Color.rgb(255, 31, 116), 3);
    ArrayList<Player> allPlayers = new ArrayList<Player>(Arrays.asList(player1, player2, player3, player4));
    
    //keep track of the current player. 0:player1, 1:player2, 2:player3, 3:player4
    int currentPlayer = 0;
    
    //set the current space to Go
    Space currentSpace = allSpaces[0];
    
    //keep track of doubles in a row
    int doublesCounter = 0;
    
    //keep track of how many bankrupt players
    int bankruptCount = 0;

    public BoardController() throws IOException {
        
    } 
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // set background image
        backgroundImage.setImage(new Image("uahbg.jpg"));
        
        // set space images
        spaceImage0.setImage(new Image("goSpace.png"));
        goArrow.setImage(new Image("goArrow.png"));
        spaceImage30.setImage(new Image("goToJailSpace.png"));
        spaceImage20.setImage(new Image("freeParkingSpace.png"));
        chestImage1.setImage(new Image("communityChestSpace.png"));
        chestImage2.setImage(new Image("communityChestSpace.png"));
        chestImage3.setImage(new Image("communityChestSpace.png"));
        chanceImage1.setImage(new Image("chanceSpace.png"));
        chanceImage2.setImage(new Image("chanceSpace.png"));
        chanceImage3.setImage(new Image("chanceSpace.png"));
        
        // set players' Jail Card images
        p1JailCard.setImage(new Image("key.png"));
        p2JailCard.setImage(new Image("key.png"));
        p3JailCard.setImage(new Image("key.png"));
        p4JailCard.setImage(new Image("key.png"));
        p1JailCard.setVisible(false);
        p2JailCard.setVisible(false);
        p3JailCard.setVisible(false);
        p4JailCard.setVisible(false);
        
        // toggle buttons
        propertyYesButton.setVisible(false);
        propertyNoButton.setVisible(false);
        endTurnButton.setDisable(true);
        pay50Button.setVisible(false);
        rollDoublesButton.setVisible(false);
        useCardButton.setVisible(false);
        useCardButton.setDisable(true);
        finishButton.setVisible(false);
        
        // set player 1 as current player
        player1.is_up = true;
        
        // update info with names, starting cash (1500), and empty inventory
        p1_nam.setText(player1.name);
        p2_nam.setText(player2.name);
        p3_nam.setText(player3.name);
        p4_nam.setText(player4.name);
        p1_pos.setText(allSpaces[0].name);
        p2_pos.setText(allSpaces[0].name);
        p3_pos.setText(allSpaces[0].name);
        p4_pos.setText(allSpaces[0].name);
        p1_mon.setText(Integer.toString(player1.playerMoney));
        p2_mon.setText(Integer.toString(player2.playerMoney));
        p3_mon.setText(Integer.toString(player3.playerMoney));
        p4_mon.setText(Integer.toString(player4.playerMoney));
        p1_props.setText("");
        p2_props.setText("");
        p3_props.setText("");
        p4_props.setText("");
        p1_token.setVisible(true);
        //p4_token.setFill(Color.rgb(255, 31, 116));
        
        // make event popup window transparent
        popupRect.setVisible(false);
        popupDivider.setVisible(false);
        popupPlayerName.setVisible(false);
        popupDescription.setVisible(false);
        popupOK.setVisible(false);
        popupInstruction.setVisible(false);
        
        // update text for all property spaces
        spaceText1.setText(allSpaces[1].name);
        spaceText3.setText(allSpaces[3].name);
        spaceText5.setText(allSpaces[5].name);
        spaceText6.setText(allSpaces[6].name);
        spaceText8.setText(allSpaces[8].name);
        spaceText9.setText(allSpaces[9].name);
        spaceText11.setText(allSpaces[11].name);
        spaceText12.setText(allSpaces[12].name);
        spaceText13.setText(allSpaces[13].name);
        spaceText14.setText(allSpaces[14].name);
        spaceText15.setText(allSpaces[15].name);
        spaceText16.setText(allSpaces[16].name);
        spaceText18.setText(allSpaces[18].name);
        spaceText19.setText(allSpaces[19].name);
        spaceText21.setText(allSpaces[21].name);
        spaceText23.setText(allSpaces[23].name);
        spaceText24.setText(allSpaces[24].name);
        spaceText25.setText(allSpaces[25].name);
        spaceText26.setText(allSpaces[26].name);
        spaceText27.setText(allSpaces[27].name);
        spaceText28.setText(allSpaces[28].name);
        spaceText29.setText(allSpaces[29].name);
        spaceText31.setText(allSpaces[31].name);
        spaceText32.setText(allSpaces[32].name);
        spaceText34.setText(allSpaces[34].name);
        spaceText35.setText(allSpaces[35].name);
        spaceText37.setText(allSpaces[37].name);
        spaceText39.setText(allSpaces[39].name);
        
        // Debug
        //player1.jailCardCounter = 1;
        /*
        bank.all_properties.get(2).ownership = 0;
        bank.all_properties.get(3).ownership = 0;
        bank.all_properties.get(4).ownership = 0;
        player1.propertiesOwned.add(bank.all_properties.get(2));
        player1.propertiesOwned.add(bank.all_properties.get(3));
        player1.propertiesOwned.add(bank.all_properties.get(4));
        player1.lightBlueAmount = 3;
        */
        
        updatePlayerInfo();
    }    
    
    //quickly check which player is up
    int findCurrentPlayer() {
        if (player1.is_up)
            return 0;
        else if (player2.is_up)
            return 1;
        else if (player3.is_up)
            return 2;
        else if (player4.is_up)
            return 3;
        else return 5;
    }
    
    private void updateCurrentPlayer() {
        // Read labels of dice to get the dice roll
        int die1 = Integer.parseInt(die1_label.getText());
        int die2 = Integer.parseInt(die2_label.getText());
        
        if (die1 != die2) {     //AKA not doubles
            // go to the next player
            allPlayers.get(currentPlayer).is_up = false;
            currentPlayer++;
            
            // if last player is up, cycle the array list
            if (currentPlayer == allPlayers.size()) {
                currentPlayer = 0;
            }
            
            // set next player as current player
            allPlayers.get(currentPlayer).is_up = true;
            
            // reset doubles counter
            doublesCounter = 0;
            
            // update the label to show the players who is up
            currentPlayerLabel.setText(allPlayers.get(currentPlayer).name);
            
            // update debug selection
            switch (currentPlayer) {
            }
        }
        else {      // if doubles, reset jail roll counter
            doublesCounter++;
            allPlayers.get(currentPlayer).jailRollCounter = 0;
        }
        
        if (allPlayers.get(currentPlayer).position == 40) {
            inJail();
        }
        else {
            rollButton.setDisable(false);
        }
        
        if (allPlayers.get(currentPlayer).isBankrupt == true) {
            updateCurrentPlayer();
        }
    }
    
    @FXML
    private void updatePosUI(ActionEvent event) throws InterruptedException {
        updatePos();
    }
    
    private void updatePos() throws InterruptedException {
        // Add labels together for total dice roll
        int die1 = Integer.parseInt(die1_label.getText());
        int die2 = Integer.parseInt(die2_label.getText());
        int diceRoll = die1 + die2;
        
        // create a list to keep track of piece movement
        List<TranslateTransition> movements = new ArrayList();
        
        // if in jail, set position to Just Visiting
        if (allPlayers.get(currentPlayer).position == 40) {
            
        }
        
        // if third double in a row is reached, send to jail
        /*if ((die1 == die2) && (doublesCounter == 2)) {
            switch (currentPlayer) {
                case 0: movements = goToJail(p1_token, movements);
                break;
                case 1: movements = goToJail(p2_token, movements);
                break;
                case 2: movements = goToJail(p3_token, movements);
                break;
                case 3: movements = goToJail(p4_token, movements);
                break;
            }
            
            // reset doubles counter (doubles counter increments to 0 by the end)
            doublesCounter = -1;
            
            // immediately change dice roll to 0
            diceRoll = 0;
            
            // set player's position to 40 (jail)
            allPlayers.get(currentPlayer).position = 40;
            
            // increment current player
            currentPlayer++;
            if (currentPlayer == allPlayers.size()) {
                currentPlayer = 0;
            }
            currentPlayerLabel.setText(allPlayers.get(currentPlayer).name);
            currentSpaceLabel.setText(allSpaces[allPlayers.get(currentPlayer).position].name);
        }*/
        
        while (diceRoll > 0) {
            // increment position one by one
            allPlayers.get(currentPlayer).position += 1;
            if (allPlayers.get(currentPlayer).position == 40)   // if pass Go, reset to 0
                allPlayers.get(currentPlayer).position -= 40;
            
            // decrement dice roll
            diceRoll -= 1;
            
            // collect all animations depending on the player
            switch (currentPlayer) {
                case 0: movements = movePiece(p1_token, allPlayers.get(currentPlayer).position, movements);
                break;
                case 1: movements = movePiece(p2_token, allPlayers.get(currentPlayer).position, movements);
                break;
                case 2: movements = movePiece(p3_token, allPlayers.get(currentPlayer).position, movements);
                break;
                case 3: movements = movePiece(p4_token, allPlayers.get(currentPlayer).position, movements);
                break;
            }
        }
        
        // 30 is Go To Jail
        if (allPlayers.get(currentPlayer).position == 30) {
            allPlayers.get(currentPlayer).position = 40;
            switch (currentPlayer) {
                case 0: movements = goToJail(p1_token, movements);
                break;
                case 1: movements = goToJail(p2_token, movements);
                break;
                case 2: movements = goToJail(p3_token, movements);
                break;
                case 3: movements = goToJail(p4_token, movements);
                break;
            }
        }

        // reset dice roll for handleEvent function
        int diceAmount = Integer.parseInt(die1_label.getText()) + Integer.parseInt(die2_label.getText());

        // execute animations
        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(movements);
        
        // after movement animation has finished, let the space handle the event
        sequentialTransition.setOnFinished(e -> spawnPopup());
        sequentialTransition.play();
        
        // let the space handle the event
        //allSpaces[allPlayers.get(currentPlayer).position].handleEvent(diceAmount, allPlayers, allPlayers.get(currentPlayer), rollButton, moveButton, propertyYesButton, propertyNoButton, endTurnButton);
        
        // disable move and roll buttons until event is resolved by the user
        moveButton.setDisable(true);
        rollButton.setDisable(true);
        
        // update current space and label
        currentSpace = allSpaces[allPlayers.get(currentPlayer).position];
        currentSpaceLabel.setText(currentSpace.name);
        
        // update player info for all players
        updatePlayerInfo();
    }
    
    @FXML
    private void endTurn(ActionEvent event) {   // when end turn button is clicked, enable move button
        updateCurrentPlayer();
        moveButton.setDisable(true);
        //rollButton.setDisable(false);
        endTurnButton.setDisable(true);
    }
    
    @FXML
    private void rollDice(ActionEvent event) {
        Random rand = new Random();
        
        // roll 2 dice 1-6
        int rand_int1 = rand.nextInt(6) + 1;
        int rand_int2 = rand.nextInt(6) + 1;
        
        // update dice labels
        String s1 = String.valueOf(rand_int1);
        String s2 = String.valueOf(rand_int2);
        die1_label.setText(s1);
        die2_label.setText(s2);
        //die1_label.setText("3");
        //die2_label.setText("4");
        
        // enable move button
        rollButton.setDisable(true);
        moveButton.setDisable(false);
    }
    
    // go straight from position 30 to position 40
    private List<TranslateTransition> goToJail(Circle token, 
            List<TranslateTransition> movelist) {
        TranslateTransition t = new TranslateTransition();
        t.setNode(token);
        t.setToX(38 - 565);
        t.setToY(543 - 565);
        movelist.add(t);
        return movelist;
    }
    
    
    private List<TranslateTransition> movePiece(Circle token, int playerPos, 
            List<TranslateTransition> movelist) throws InterruptedException {
        // specify the translation depending on the next position
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(token);
            
        // Go
        if (playerPos == 0) { 
            translate.setToX(565-565);
            translate.setToY(565-565);
            allPlayers.get(currentPlayer).playerMoney += 200;
        }
        
        // 1st brown space
        else if (playerPos == 1) {
            translate.setToX(487-565);
        }
        
        // Community Chest through 3rd light blue space
        else if ((playerPos >= 2) && (playerPos < 10)) {
            translate.setByX(-50);
        }
        
        // Just Visiting. Depends on which player is up
        else if (playerPos == 10) {
            if (player1.is_up) {
                translate.setToX(10-565);
                translate.setToY(546-565);
            }
            else if (player2.is_up) {
                translate.setToX(-10-565);
                translate.setToY(571-565);
            }
            else if (player3.is_up) {
                translate.setToX(30-565);
                translate.setToY(570-565);
            }
            else if (player4.is_up) {
                translate.setToX(45-565);
                translate.setToY(570-565);
            }
        }
        
        // 1st pink space
        else if (playerPos == 11) {
            translate.setToX(17-565);
            translate.setToY(490-565);
        }
        
        // 1st utility through 3rd orange space
        else if ((playerPos >= 12) && (playerPos < 20)) {
            translate.setByY(-50);
        }
        
        // Free Parking
        else if (playerPos == 20) {
            translate.setToX(17-565);
            translate.setToY(38-565);
        }
        
        // 1st red space
        else if (playerPos == 21) {
            translate.setToX(87-565);
            translate.setToY(19-565);
        }
        
        // Chance through 3rd yellow space
        else if ((playerPos >= 22) && (playerPos < 30)) {
            translate.setByX(50);
        }
        
        // Go To Jail
        else if (playerPos == 30) {
            translate.setToX(557-565);
            translate.setToY(38-565);
        }
        
        // 1st green space
        else if (playerPos == 31) {
            translate.setToY(90-565);
        }
        
        // 2nd green space through 2nd dark blue space
        else {
            translate.setByY(50);
        }
        
        movelist.add(translate);
        return movelist;
    }
    
    Space[] createSpaces(ArrayList<Property> property_list) {
        Space[] spaces = new Space[41];
        
        // ===== Create miscellaneous spaces =====
        spaces[0] = new GoSpace();
        spaces[4] = new IncomeTaxSpace();
        spaces[38] = new LuxuryTaxSpace();
        spaces[10] = new JustVisitingSpace();
        spaces[40] = new JailSpace();
        spaces[20] = new FreeParkingSpace();
        spaces[30] = new GoToJailSpace();

        // ===== Create property spaces =====
        int iter = 0;
        while (iter < 28) {
            spaces[property_list.get(iter).position] = new PropertySpace(property_list.get(iter));
            iter++;
        }

        // ===== Create Chance & Community Chest spaces =====
        spaces[2] = new CommunityChestSpace(2);
        spaces[17] = new CommunityChestSpace(17);
        spaces[33] = new CommunityChestSpace(33);
        spaces[7] = new ChanceSpace(7);
        spaces[22] = new ChanceSpace(22);
        spaces[36] = new ChanceSpace(36);

        return spaces;
    }
    
    void updatePlayerInfo() {
        //player 1
        p1_pos.setText(allSpaces[player1.position].name);
        p1_mon.setText(Integer.toString(player1.playerMoney));
        p1_props.setText("");
        for (int iter = 0; iter < player1.propertiesOwned.size(); iter++) {
            p1_props.setText(p1_props.getText() + player1.propertiesOwned.get(iter).name + "\n");
        }
        if (player1.playerMoney < 0) {
            p1_mon.setText("BANKRUPT");
            p1_token.setVisible(false);
            if (player1.isBankrupt == false) {
                player1.isBankrupt = true;
                bankruptCount++;
            }
        }
        if (player1.jailCardCounter > 0) {
            p1JailCard.setVisible(true);
        }
        else {
            p1JailCard.setVisible(false);
        }
        
        //player 2
        p2_pos.setText(allSpaces[player2.position].name);
        p2_mon.setText(Integer.toString(player2.playerMoney));
        p2_props.setText("");
        for (int iter = 0; iter < player2.propertiesOwned.size(); iter++) {
            p2_props.setText(p2_props.getText()+ player2.propertiesOwned.get(iter).name + "\n");
        }
        if (player2.playerMoney < 0) {
            p2_mon.setText("BANKRUPT");
            p2_token.setVisible(false);
            if (player2.isBankrupt == false) {
                player2.isBankrupt = true;
                bankruptCount++;
            }
        }
        if (player2.jailCardCounter > 0) {
            p2JailCard.setVisible(true);
        }
        else {
            p2JailCard.setVisible(false);
        }
        
        //player 3
        p3_pos.setText(allSpaces[player3.position].name);
        p3_mon.setText(Integer.toString(player3.playerMoney));
        p3_props.setText("");
        for (int iter = 0; iter < player3.propertiesOwned.size(); iter++) {
            p3_props.setText(p3_props.getText()+ player3.propertiesOwned.get(iter).name + "\n");
        }
        if (player3.playerMoney < 0) {
            p3_mon.setText("BANKRUPT");
            p3_token.setVisible(false);
            if (player3.isBankrupt == false) {
                player3.isBankrupt = true;
                bankruptCount++;
            }
        }
        if (player3.jailCardCounter > 0) {
            p3JailCard.setVisible(true);
        }
        else {
            p3JailCard.setVisible(false);
        }
        
        //player 4
        p4_pos.setText(allSpaces[player4.position].name);
        p4_mon.setText(Integer.toString(player4.playerMoney));
        p4_props.setText("");
        for (int iter = 0; iter < player4.propertiesOwned.size(); iter++) {
            p4_props.setText(p4_props.getText()+ player4.propertiesOwned.get(iter).name + "\n");
        }
        if (player4.playerMoney < 0) {
            p4_mon.setText("BANKRUPT");
            p4_token.setVisible(false);
            if (player4.isBankrupt == false) {
                player4.isBankrupt = true;
                bankruptCount++;
            }
        }
        if (player4.jailCardCounter > 0) {
            p4JailCard.setVisible(true);
        }
        else {
            p4JailCard.setVisible(false);
        }
        
        //check game status
        if (bankruptCount > 2) {
            // make the popup visible
            popupRect.setVisible(true);
            popupDivider.setVisible(true);
            popupPlayerName.setVisible(true);
            popupDescription.setVisible(true);
            popupOK.setVisible(false);
            popupInstruction.setVisible(true);
            endTurnButton.setDisable(true);
            
            finishButton.setVisible(true);

            // toggle the player name
            updateCurrentPlayer();
            popupPlayerName.setText(allPlayers.get(currentPlayer).name);

            popupDescription.setText("Congratulations! You are the winner!");
            popupInstruction.setText("Click 'Finish' to return to the Start Menu.");
        }
    }
    
    private void spawnPopup() {
        // make yes and no buttons invisible
        propertyYesButton.setVisible(false);
        propertyNoButton.setVisible(false);
        
        // retrieve dice roll for popup function
        int diceAmount = Integer.parseInt(die1_label.getText()) + Integer.parseInt(die2_label.getText());
        
        // make the popup visible
        popupRect.setVisible(true);
        popupDivider.setVisible(true);
        popupPlayerName.setVisible(true);
        popupDescription.setVisible(true);
        popupOK.setVisible(true);
        popupInstruction.setVisible(true);
                
        // toggle the player name
        popupPlayerName.setText(allPlayers.get(currentPlayer).name);
        
        popupInstruction.setText("Press 'OK' to continue.");
        
        String message = "";
        
        // toggle the description
        allSpaces[allPlayers.get(currentPlayer).position].spawnPopUp(message, popupOK,
                popupDescription, popupInstruction, diceAmount, allPlayers, allPlayers.get(currentPlayer), allSpaces);
        
        switch (currentPlayer) {
            case 0:
                allSpaces[allPlayers.get(currentPlayer).position].handleEvent(diceAmount, allPlayers, 
                allPlayers.get(currentPlayer), rollButton, moveButton, propertyYesButton, propertyNoButton, 
                endTurnButton, eventButton, popupDescription, allSpaces, p1_token);
                break;
            case 1:
                allSpaces[allPlayers.get(currentPlayer).position].handleEvent(diceAmount, allPlayers, 
                allPlayers.get(currentPlayer), rollButton, moveButton, propertyYesButton, propertyNoButton, 
                endTurnButton, eventButton, popupDescription, allSpaces, p2_token);
                break;
            case 2:
                allSpaces[allPlayers.get(currentPlayer).position].handleEvent(diceAmount, allPlayers, 
                allPlayers.get(currentPlayer), rollButton, moveButton, propertyYesButton, propertyNoButton, 
                endTurnButton, eventButton, popupDescription, allSpaces, p3_token);
                break;
            case 3:
                allSpaces[allPlayers.get(currentPlayer).position].handleEvent(diceAmount, allPlayers, 
                allPlayers.get(currentPlayer), rollButton, moveButton, propertyYesButton, propertyNoButton, 
                endTurnButton, eventButton, popupDescription, allSpaces, p4_token);
                break;
        }
       
        // disable all buttons except "OK"
        endTurnButton.setDisable(true);
    }
    
    @FXML
    private void spawnPopUp(ActionEvent event) {
        spawnPopup();
    }
    
    @FXML
    private void dismissPopup(ActionEvent event) {
        // reset dice roll for handleEvent function
        int diceAmount = Integer.parseInt(die1_label.getText()) + Integer.parseInt(die2_label.getText());
        
        popupRect.setVisible(false);
        popupDivider.setVisible(false);
        popupPlayerName.setVisible(false);
        popupDescription.setVisible(false);
        popupOK.setVisible(false);
        popupInstruction.setVisible(false);
        
        //allSpaces[allPlayers.get(currentPlayer).position].handleEvent(diceAmount, allPlayers, 
        //        allPlayers.get(currentPlayer), rollButton, moveButton, propertyYesButton, propertyNoButton, 
        //        endTurnButton, eventButton, popupDescription, allSpaces);
        
        // enable "End Turn" button
        endTurnButton.setDisable(false);
        
        // update player info
        updatePlayerInfo();
        
        /*
        // if player is in jail after closing popup, advance to next player
        if (allPlayers.get(currentPlayer).position == 40) {
            // increment current player
            currentPlayer++;
            if (currentPlayer == allPlayers.size()) {
                currentPlayer = 0;
            }
            currentPlayerLabel.setText(allPlayers.get(currentPlayer).name);
            currentSpaceLabel.setText(allSpaces[allPlayers.get(currentPlayer).position].name);
            
            // reset doubles counter
            doublesCounter = -1;
        }
        */
    }
    
    @FXML
    private void buyProperty(ActionEvent event) {
        // go through each property to check which one shares the same position as the player
        for (int iter = 0; iter < bank.all_properties.size(); iter++) {
            if (bank.all_properties.get(iter).position == allPlayers.get(currentPlayer).position) {
                
                // pay for the property
                allPlayers.get(currentPlayer).payMoney(bank.all_properties.get(iter).cost);
                
                // change ownership from bank to current player
                bank.all_properties.get(iter).ownership = findCurrentPlayer();
                
                // add the property to the player's inventory
                allPlayers.get(currentPlayer).propertiesOwned.add(bank.all_properties.get(iter));
                
                // update the player's amount of the property's type
                int p = bank.all_properties.get(iter).position;
                if (p % 5 == 0) {
                    allPlayers.get(currentPlayer).railroadAmount++;
                }
                else if (p == 12 || p == 28) {
                    allPlayers.get(currentPlayer).utilityAmount++;
                }
                else if (p < 5) {
                    allPlayers.get(currentPlayer).brownAmount++;
                }
                else if (p < 10) {
                    allPlayers.get(currentPlayer).lightBlueAmount++;
                }
                else if (p < 15) {
                    allPlayers.get(currentPlayer).pinkAmount++;
                }
                else if (p < 20) {
                    allPlayers.get(currentPlayer).orangeAmount++;
                }
                else if (p < 25) {
                    allPlayers.get(currentPlayer).redAmount++;
                }
                else if (p < 30) {
                    allPlayers.get(currentPlayer).yellowAmount++;
                }
                else if (p < 35) {
                    allPlayers.get(currentPlayer).greenAmount++;
                }
                else if (p < 40) {
                    allPlayers.get(currentPlayer).darkBlueAmount++;
                }
                
                break;
            }
        }
        popupOK.setVisible(true);
        popupInstruction.setVisible(true);
        popupDescription.setText(allPlayers.get(currentPlayer).name + " now owns " + allSpaces[allPlayers.get(currentPlayer).position].name + "!");
        propertyYesButton.setVisible(false);
        propertyNoButton.setVisible(false);
        //endTurnButton.setDisable(false);
        updatePlayerInfo();
    }
    
    @FXML
    private void passProperty(ActionEvent event) {
        // make the popup visible
        popupRect.setVisible(false);
        popupDivider.setVisible(false);
        popupPlayerName.setVisible(false);
        popupDescription.setVisible(false);
        popupInstruction.setVisible(false);
        popupOK.setVisible(false);
        propertyYesButton.setVisible(false);
        propertyNoButton.setVisible(false);
        endTurnButton.setDisable(false);
    }
    
    private void inJail() {
        
        
        // make the popup visible
        popupRect.setVisible(true);
        popupDivider.setVisible(true);
        popupPlayerName.setVisible(true);
        popupDescription.setVisible(true);
        popupInstruction.setVisible(true);

        pay50Button.setVisible(true);
        rollDoublesButton.setVisible(true);
        rollDoublesButton.setDisable(false);
        useCardButton.setVisible(true);
        useCardButton.setDisable(true);
        
        rollButton.setDisable(true);

        if (allPlayers.get(currentPlayer).jailCardCounter > 0) {
            useCardButton.setDisable(false);
        }

        if (allPlayers.get(currentPlayer).jailRollCounter == 3) {
            rollDoublesButton.setDisable(true);
        }

        // toggle the player name
        popupPlayerName.setText(allPlayers.get(currentPlayer).name);

        popupDescription.setText("You're in Jail! What will you do? You have " + String.valueOf(3 - allPlayers.get(currentPlayer).jailRollCounter) + " roll(s) remaining.");

        popupInstruction.setText("Pay $50, roll for doubles, or use Jail Card.");
    }
    
    @FXML
    private void pay50(ActionEvent event) throws InterruptedException {
        allPlayers.get(currentPlayer).payMoney(50);
        updatePlayerInfo();
        allPlayers.get(currentPlayer).position = 10;
        
        popupRect.setVisible(false);
        popupDivider.setVisible(false);
        popupPlayerName.setVisible(false);
        popupDescription.setVisible(false);
        //popupOK.setVisible(true);
        popupInstruction.setVisible(false);

        pay50Button.setVisible(false);
        rollDoublesButton.setVisible(false);
        useCardButton.setVisible(false);
        
        allPlayers.get(currentPlayer).jailRollCounter = 0;
        // enable roll button
        rollButton.setDisable(false);
        moveButton.setDisable(true);
    }
    
    @FXML
    private void useCard(ActionEvent event) throws InterruptedException {
        allPlayers.get(currentPlayer).jailCardCounter--;
        updatePlayerInfo();
        
        popupRect.setVisible(false);
        popupDivider.setVisible(false);
        popupPlayerName.setVisible(false);
        popupDescription.setVisible(false);
        //popupOK.setVisible(true);
        popupInstruction.setVisible(false);

        pay50Button.setVisible(false);
        rollDoublesButton.setVisible(false);
        useCardButton.setVisible(false);
        
        allPlayers.get(currentPlayer).jailRollCounter = 0;
        allPlayers.get(currentPlayer).position = 10;
        // enable roll button
        rollButton.setDisable(false);
        moveButton.setDisable(true);
    }
    
    @FXML
    private void rollForDoubles(ActionEvent event) throws InterruptedException {
        updatePlayerInfo();
        
        Random rand = new Random();
        
        // roll 2 dice 1-6
        int rand_int1 = rand.nextInt(6) + 1;
        int rand_int2 = rand.nextInt(6) + 1;
        
        // update dice labels
        String s1 = String.valueOf(rand_int1);
        String s2 = String.valueOf(rand_int2);
        die1_label.setText(s1);
        die2_label.setText(s2);
        //die1_label.setText("4");
        //die2_label.setText("4");
        
        if (die1_label.getText().equals(die2_label.getText())) {
            allPlayers.get(currentPlayer).position = 10;
            allPlayers.get(currentPlayer).jailRollCounter = 0;
            
            // enable move button
            rollButton.setDisable(true);
            moveButton.setDisable(false);
        }
        else {
            allPlayers.get(currentPlayer).jailRollCounter++;
            endTurnButton.setDisable(false);
        }
        
        popupRect.setVisible(false);
        popupDivider.setVisible(false);
        popupPlayerName.setVisible(false);
        popupDescription.setVisible(false);
        //popupOK.setVisible(true);
        popupInstruction.setVisible(false);

        pay50Button.setVisible(false);
        rollDoublesButton.setVisible(false);
        useCardButton.setVisible(false);
        
        
    }
    
    @FXML
    private void finish(ActionEvent event) {
        exit();
    }
}
