package BattleShipGame;

import java.util.ArrayList;
//-----------------------------------------------------
//Assignment (4)
//Written by: (Name = Muhammad Mubashir Student Id = 40152977 )
//For COMP 248 Section (R) â€“ Fall 2020
//------------------------------------------------
// This is the user class which would take the input from the user and check the validity of the input and if it is Valid
// then it will show the output

public class userclass {
    String[][] userInputted = new String[10][3];
    String[][] computerInputted= new String[10][3];
    ArrayList<String> inputedValues ;
    String[][] interfaceArray = new String[8][8];
    String updateAlpha;
    Boolean inSmallArray = false;
    boolean grenade = false;
    interfaceClass interfaceClass ;
    public  userclass(String[][] userInputted,String[][] computerInputted){
        this.userInputted = userInputted;
        this.computerInputted = computerInputted;
        inputedValues = new ArrayList<>();
        interfaceClass = new interfaceClass(interfaceArray);
        interfaceClass.gameDisplayArray();

    }
    // This input function will take the values and then it will check for the validity and after checking that it will check whether the 
    // the value is been privously inputted
    public void input(String input){
        grenade = false;
        // Will check valid input is added or not
        if(inputValues.validValues(input)){
            // Then check that input is privously inputted
            if(inputedValues.contains(input)){
                System.out.print("Position already been called");
                interfaceClass.displayArray();
                
            }
            else{
                // It will loop through the smallArray and see if the input is a ship or grenade
                if(checkSmallArray(input)){
                    if(!wincheck()){
                        interfaceClass.displayArray();
                    }
                    inputedValues.add(input);
                    
                }
                else{
                    // If the input is not ship nor grenade then it will just update the interface with "*"
                    System.out.println("nothing");
                    interfaceClass.updateArray(input);
                    interfaceClass.displayArray();
                    inputedValues.add(input);
                }

                
            }
        }
        else{
            // If the Input is not valid then it will print this
            System.out.print("The input is out of range ");
            interfaceClass.displayArray();
        }
        
    }


    public Boolean checkSmallArray(String input){
        // If the input is ship or grenade then it will update tg
        inSmallArray= false;
        // Will loop through the small array
        for(int i=0;i<userInputted.length;i++){
            if(userInputted[i][2].equals(input)){
                    if(userInputted[i][0].equals("G")){
                        userInputted[i][0] = "U"; 
                        grenade = true;
                        inSmallArray = true;
                        interfaceClass.updateArraywithvalue(input,"G");
                        grenade();
                        break;
                    }
                    else{
                        if(userInputted[i][0].equals("S")){
                            userInputted[i][0] = "U";
                            inSmallArray = true;
                            interfaceClass.updateArraywithvalue(input,"S");
                            ship();
                            break;
        
                        }   
                }}
            }
            for(int i=0;i<computerInputted.length;i++){
                if(computerInputted[i][2].equals(input)){
                    if(computerInputted[i][0].equals("g")){
                        computerInputted[i][0] = "C";
                        inSmallArray = true;
                        interfaceClass.updateArraywithvalue(input,"g");
                        grenade = true;
                        grenade();    
                        break;
                        }
                    if(computerInputted[i][0].equals("s")){
                        computerInputted[i][0] = "C";
                        inSmallArray = true;
                        interfaceClass.updateArraywithvalue(input,"s");
                        ship();
                        break;
                        }   
                    }
            }
            return inSmallArray;
        }
    
    public void grenade(){
        System.out.print("boom!grenade");
    }
    public void ship(){
        System.out.print("Ship hit!");
    }
    
    public Boolean wincheck(){
        Boolean checkwin = false;
        int user1=0;
        int user2=0;
        for(int i=0;i<userInputted.length;i++){
            if(userInputted[i][0].equals("S")){
                user1 =user1+1; 
            }

        }
        for(int z=0;z<computerInputted.length;z++){
            if(computerInputted[z][0].equals("s")){
                user2 = user2+1;
            }
        }
        if(user1 ==0 || user2==0){
            checkwin = true;
        }
        return checkwin;
    }
    public Boolean whowon(){
        int user1=0;
        int user2=0;
        Boolean whowin = false;
        for(int i=0;i<userInputted.length;i++){
            if(userInputted[i][0].equals("S")) {
                user1 =user1+1; 
            }

        }
        for(int z=0;z<computerInputted.length;z++){
            if(computerInputted[z][0].equals("s")){
                user2 = user2+1;
            }
        }
        if(user1 ==0){
            whowin = true;
        }
        if(user2 == 0){
            whowin = false;
        }
        return whowin;

    }
    
}
