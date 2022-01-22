package BattleShipGame;
//-----------------------------------------------------
//Assignment (4)
//Written by: (Name = Muhammad Mubashir Student Id = 40152977 )
//For COMP 248 Section (R) â€“ Fall 2020
//------------------------------------------------
// This class will display the interface of the game
public class interfaceClass {
    String[][] interfaceArray ;
    public interfaceClass(String[][] interfaceArray){
        this.interfaceArray = interfaceArray;
        
    }
    // This will intialize the interface Array
    public void gameDisplayArray() {
        for (int i = 0; i < interfaceArray.length; i++) {
            for(int z=0 ; z<interfaceArray[i].length;z++){
                interfaceArray[i][z] = "_";
            }
            
        }
    }
    // This function will loop through the array and will display the grid
    public void displayArray() {
        System.out.println("");
        for (int z = 0; z < interfaceArray.length; z++) {
            System.out.print("                      ");
            for(int x = 0 ;x<interfaceArray[z].length;x++){
                System.out.print(interfaceArray[z][x]+" ");
            }
            System.out.println("");
    
        }
        
    }
    // This will take the grid number and update it with "*"
    public void updateArray(String inputValue){
        String[] characters = {"A","B","C","D","E","F","G","H"};
        int value =0;
        String num = ""+inputValue.charAt(1);
        int num1 = Integer.parseInt(num); 
        char firstAlpha = inputValue.charAt(0);
        String firstAlph = ""+firstAlpha;
        for(int i=0;i<characters.length;i++){
            if(characters[i].equals(firstAlph)){
                value = i;
                break;
            }
        }
        interfaceArray[num1-1][value] = "*";

    }
    // This will take two input one would be grid number other would be Letter which has to be updated in the grid
    public void updateArraywithvalue(String inputValue,String input){
        String[] characters = {"A","B","C","D","E","F","G","H"};
        int value =0;
        String num = ""+inputValue.charAt(1);
        int num1 = Integer.parseInt(num); 
        char firstAlpha = inputValue.charAt(0);
        String firstAlph = ""+firstAlpha;
        for(int i=0;i<characters.length;i++){
            if(characters[i].equals(firstAlph)){
                value = i;
                break;
            }
        }
        interfaceArray[num1-1][value] = input;
    }

    

    
};
