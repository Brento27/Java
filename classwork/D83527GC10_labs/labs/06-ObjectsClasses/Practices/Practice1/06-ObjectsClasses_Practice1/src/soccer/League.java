/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer;

/**
 *
 * @author Brent
 */
public class League {
    public static void main(String[] args) {
        // TODO code logic here
        
        // Create 3 players
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";

        // Create a Player array with the name of thePlayers 
        // and instantiate with the created players 
        Player[] thePlayers = { player1, player2, player3 };
        
        // Create team1 and instantiate it with the teamName and playerArray
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        // Create team2 and instantiate it with the teamName and limited playerArray
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        
        // Now instantiate the playerArray elements with new Player
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        // For loop to print team1 playerNames
        for (Player thePlayer : team1.playerArray) {
            System.out.println(thePlayer.playerName);
        }
        // For loop to print team2 playerNames
        for (Player thePlayer : team2.playerArray) {
            System.out.println(thePlayer.playerName);
        }
    }
}
