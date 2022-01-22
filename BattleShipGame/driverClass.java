package BattleShipGame;

import java.util.Scanner;
//-----------------------------------------------------
//Assignment (4)
//Written by: (Name = Muhammad Mubashir Student Id = 40152977 )
//For COMP 248 Section (R) â€“ Fall 2020
//------------------------------------------------


public class driverClass {
    public static void main(String[] args) {
        // Opening line to the game
        System.out.println("Hi, lets play Battleship!");
        // Will intialize Three Arrays
        // One would be for interface
        String[][] dumyclass = new String[8][8];
        // In this Array user inputted values would be added
        String[][] user1Array = new String[10][3];
        // In this Array randomly generated values would be added
        String[][] computerArray = new String[10][3];
        String input = "";
        String currentUser = "user";
        // input Values will take values from user and make an Array randomly generated by the computer
        inputValues inputValues = new inputValues();
        inputValues.inputCoordinates();
        // Arrays generated by input values are made equal to the the Arrays intialized in the driver class 
        user1Array = inputValues.nUserArray;
        computerArray =inputValues.computerArray;
        // Then these Arrays are inputted in userclass
        userclass userclass = new userclass(user1Array,computerArray);
        // Interface class is intialized to show the grid when game is over
        interfaceClass interfaceClass = new interfaceClass(dumyclass);
        interfaceClass.gameDisplayArray();
        System.out.println("");
        System.out.println("Ok the computer placed its ships and grenade a random. Lets play.");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        // THis loop will run until we dont get a winner
            while(userclass.wincheck() == false){
                // Will check the current user variable
                while(currentUser.equals("user")){
                    // If it is user then it would take an input
                    System.out.print("Position of your rocket :");
                        input =sc.next();
                        // will pass that input is input function
                        userclass.input(input);
                        // After this it will check whether wincheck is true or not
                        if(userclass.wincheck()){
                            // If wincheck is true then it will check who have won
                            if(userclass.whowon() == true){
                            // System.out.println("I have won");
                            // Will break out of loop if somebody have won
                            break;
                            }
                            break;

                    }
                    // If a grenade would be hit then it will give computer one more turn to fire rocket
                    if(userclass.grenade == true){
                        input = randomUserCoordinates.random();
                        System.out.println("position of my rocket :"+input);
                        userclass.input(input);

                        if(userclass.wincheck()){
                            if(userclass.whowon() == false){
                                // It will check fot he win
                                // System.out.println("You have won");
                                break;
                            }
                            break;
                        }
                        // If the grenade is again hit then the current user will be set to user
                        if(userclass.grenade == true){
                            currentUser = "user";
                            break;
                        }
                    }
                    currentUser = "computer";    
                }
                    while(currentUser.equals("computer")){
                        input = randomUserCoordinates.random();
                        System.out.println("position of my rocket :"+input);
                        userclass.input(input);
                        if(userclass.wincheck()){
                            if(userclass.whowon() == false){
                                // System.out.println("You have won");
                                break;
                            }
                            break;
                        }
                        if(userclass.grenade == true){
                            System.out.print("position of your rocket :");
                            input = sc.next();
                            userclass.input(input);
                            if(userclass.wincheck()){
                                if(userclass.whowon() == true){
                                    // System.out.println("I have won");
                                    break;
                                }
                                break;
                            }
                            if(userclass.grenade == true){
                                currentUser = "computer";
                                break;
                            }
    
    
                        }
                    currentUser = "user";    
                    }
                    
            }
            // After getting out of the loop it will check which player have won and would print according to it
            if(userclass.whowon() == false){
                System.out.println("You have won");
            }
            if(userclass.whowon() == true){
                System.out.println("I have won");

            }
    // After the game has finished the orginal grid is printed
    for(int i = 0;i<user1Array.length;i++){
        interfaceClass.updateArraywithvalue(user1Array[i][2],user1Array[i][1]);
    }
    for(int z = 0;z<computerArray.length;z++){
        interfaceClass.updateArraywithvalue(computerArray[z][2], computerArray[z][1]);
    }
    // Interface is displayed
    interfaceClass.displayArray();
    sc.close();
}}
