public class HockeyPlayer {

    private String name;
    private int jerseyNumber;
    private String handed;
    private int goals;
    private int assists;

    public HockeyPlayer(String playerName, int playerNumber, String handedness){
        name = playerName;
        jerseyNumber = playerNumber;
        handed = handedness;

    }

    public void gameFinished(int goalsScored, int assistsMade){
        goals+= goalsScored;
        assists+= assistsMade; 
    }

    public int pointsTotal(){
        return this.goals + this.assists;
    }

    public static void main(String[] args) {
        HockeyPlayer jim = new HockeyPlayer("Jim", 10, "right");
        System.out.println
    }

}
