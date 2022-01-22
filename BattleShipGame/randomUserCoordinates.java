package BattleShipGame;
//-----------------------------------------------------
//Assignment (4)
//Written by: (Name = Muhammad Mubashir Student Id = 40152977 )
//For COMP 248 Section (R) â€“ Fall 2020
//----------------------------------------------
public class randomUserCoordinates {
    // This class will generate random input and Random Array for the game
    public static String random(){
        String[] alphabetArray = {"A","B","C","D","E","F","G","H"};
        int max = 8;
        int min = 1;
        int range =max-min+1;
        int random1 = (int)(Math.random()*range);
        int random2 = (int)(Math.random()*range)+1;
        String randomString = alphabetArray[random1] + random2;
        return randomString;

    }
    // This Function will produce a random Array for computer 
    public static String[][] randomArray(String[][] userArray){
        String nString;
        String[][] nUserArray = new String[10][3];
        for(int i = 0;i<6;i++){
            nString = random();
            if(inputValues.validValues(nString)){
                if(inputValues.duplicate(nUserArray, nString) == false && inputValues.duplicate(userArray, nString) == false){
                    nUserArray[i][0] = "s";
                    nUserArray[i][1] = "s";
                    nUserArray[i][2] = nString;
                }
                else{
                    i--;
                } 
            }
            else{
                i--;
            }
        }
        for(int z = 6;z<10;z++){
            nString = random();
            if(inputValues.validValues(nString)){
                if(inputValues.duplicate(nUserArray, nString) == false &&inputValues.duplicate(userArray, nString) == false){
                    nUserArray[z][0] = "g";
                    nUserArray[z][1] = "g";
                    nUserArray[z][2] = nString;
                    }
                else{
                    z--;
                    } 
                }
                else{
                    z--;
                }
            
        }
        return nUserArray;
    
}};
