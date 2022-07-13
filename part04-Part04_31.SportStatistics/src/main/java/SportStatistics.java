
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int count = 0;
        int wins = 0;
        int loss = 0;
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                String[] teams = data.split(",");
                
                String team1 = teams[0];
                String team2 = teams[1];
                int score1 = Integer.valueOf(teams[2]);
                int score2 = Integer.valueOf(teams[3]);
                
                if (team.equals(team1) || team.equals(team2)) {
                    count ++;
                    if (team.equals(team1) && score1 > score2 ||team.equals(team2) && score2 > score1 ) {
                        wins++;
                    }
                }
                
                
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + (count-wins));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
