public class FootballTeam{
    //Declare the local variables
    private String nameOfTeam;
    private int noOfWins;
    private int noOfLosses;

    //Create the constructor
    FootballTeam (String teamName, int wins, int losses){
        //The constructor accepts parameters and uses them
        //to initialize the global variables
        nameOfTeam = teamName;
        noOfWins = wins;
        noOfLosses = losses;
    }
    

    //Create the second costructor by overriding the first cnstructor
    FootballTeam (String teamName){
        //Initialize the global variables
        nameOfTeam = teamName;
        noOfWins = 0;
        noOfLosses = 0;
    }

    //Create a method to increment the number of wins
    private void IncrementWin (){
        noOfWins += 1;
    }

    //Create a method to increment the number of losses
    private void IncrementLoss (){
        noOfLosses += 1;
    }

    //Create a method to output the name of a team and the number of wins and losses it has
    private void outputMethod (){
        System.out.println("Team name: " +nameOfTeam);
        System.out.println("Wins: " +noOfWins);
        System.out.println("Losses: " +noOfLosses);
    }

    //Create a method to evaluate the record of a team
    private boolean evaluateRecord(){
        if (noOfWins>noOfLosses){
            return true;
        }
        return false;
    }

    //This is the main method
    public static void main(String [] args) {
        //Create an object that calls the constructor to create team
        //This object is also used to call non-static methods from the static main
        FootballTeam kibu = new FootballTeam("KIBU", 3, 5);

        System.out.println(kibu.evaluateRecord());//Call the evaluate method and prints the resultant boolean value
        for (int i = 0; i < 3; i++){
            //This loop calls the method three times and thus increments no. of wins by 3
            kibu.IncrementWin();
        }
        System.out.println(kibu.evaluateRecord());//Call the evaluate method again and prints the resultant boolean value
        // kibu.outputMethod();
    }

}