package BattleShipGame;
import java.util.Scanner;
//-----------------------------------------------------
//Assignment (4)
//Written by: (Name = Muhammad Mubashir Student Id = 40152977 )
//For COMP 248 Section (R) â€“ Fall 2020
//------------------------------------------------
// This class will take all the values from the user
// After taking the input it will fill the array for ships and grenade

public class inputValues {
    // These are array which this function will fill
    String[][] nUserArray = new String[10][3];
    String[][] computerArray = new String[10][3];
    public void inputCoordinates(){
        String nString;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<6;i++){
            System.out.print("Enter the coordinates of your ship #"+(i+1)+" ");
            nString = sc.next();
            if(validValues(nString)){
                if(duplicate(nUserArray, nString) == false){
                    nUserArray[i][0] = "S";
                    nUserArray[i][1] = "S";
                    nUserArray[i][2] = nString;
                }
                else{
                    System.out.print("sorry, coordinate already used. try again.");
                    System.out.println("");
                    i--;
                } 
            }
            else{
                System.out.print("sorry, coordinate outside the grid. try again.");
                System.out.println("");
                i--;
            }
        }
    for(int i = 6;i<10;i++){
            System.out.print("Enter the coordinates of your grenade #"+(i-5)+" ");
            nString = sc.next();
            if(validValues(nString)){
                if(duplicate(nUserArray, nString) == false){
                    nUserArray[i][0] = "G";
                    nUserArray[i][1] = "G";
                    nUserArray[i][2] = nString;
                }
                else{
                    System.out.print("sorry, coordinate already used. try again.");
                    System.out.println("");
                    i--;
                } 
            }
            else{
                
                System.out.print("sorry, coordinate outside the grid. try again.");
                System.out.println("");
                i--;
            }
                   
        }
        // After takin the input from the user the computer will call the random array function
        computerArray = randomUserCoordinates.randomArray(nUserArray);
        
    }
    // this Function is used to check the validity of input this function is static as it is used in other classes
    public static Boolean validValues(String validInput){
        Boolean valid = false;
        int indexNumber;
        String index = ""+validInput.substring(1, validInput.length());
        indexNumber = Integer.parseInt(index);
        String indexAlpha = ""+validInput.charAt(0);
        char[] validAlphabet = {'A','B','C','D','E','F','G','H'};
        for(int i =0 ; i<validAlphabet.length;i++){
            String alpha = ""+validAlphabet[i];
            if(indexAlpha.equals(alpha)){
                if(indexNumber>0 && indexNumber<9){
                    valid = true;
                }
            }
            
        } 
        return valid;   
    }
    // This will check that input is not duplicate
    public static Boolean duplicate(String[][] Array,String nString){
        Boolean duplicate = false;
        for(int i = 0;i<Array.length;i++){
            if(Array[i][2] == null){
            }
            else{
                if(Array[i][2].equals(nString)){
                    duplicate= true;
                }

            }
        }
        return duplicate;
    }


};
