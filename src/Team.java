import java.io.Serializable;
import java.util.ArrayList;

public class Team implements Serializable {
	
	String teamName;

	Team() {

	}

	Team(String teamName) {
		this.teamName = teamName;
	}

	ArrayList<Goalkeeper> goalkeepers = new ArrayList<Goalkeeper>();
	ArrayList<Defender> defenders = new ArrayList<Defender>();
	ArrayList<Midfielder> midfielders = new ArrayList<Midfielder>();
	ArrayList<Forward> forwards = new ArrayList<Forward>();

	public int getNumberOfPlayers() {
		return goalkeepers.size() + defenders.size() + midfielders.size() + forwards.size();
	}

	public int getNumberOfGoalkeepers() {
		return goalkeepers.size();
	}

	public int getNumberOfDefenders() {
		return defenders.size();
	}

	public int getNumberOfMidfielders() {
		return midfielders.size();
	}

	public int getNumberOfForwards() {
		return forwards.size();
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void addGoalkeeper(Goalkeeper goalkeeper) {
		goalkeepers.add(goalkeeper);
	}

	public void addDefender(Defender defender) {
		defenders.add(defender);
	}

	public void addMidfielder(Midfielder midfielder) {
		midfielders.add(midfielder);
	}

	public void addForward(Forward forward) {
		forwards.add(forward);
	}

	public String getInfo() {
		return "Team name: " + getTeamName() + "\n" + "Number of Goalkeepers: " + getNumberOfGoalkeepers() + "\n"
				+ "Number of Defenders: " + getNumberOfDefenders() + "\n" + "Number of Midfielders: "
				+ getNumberOfMidfielders() + "\n" + "Number of Forwards: " + getNumberOfForwards() + "\n"
				+ "Number of Players: " + getNumberOfPlayers() + "\n";

	}

	public String getPlayerInfo(String playerName) {
		for (int i = 0; i < goalkeepers.size(); i++) {
			if (playerName.equals(goalkeepers.get(i).getName())) {
				return goalkeepers.get(i).getInfo();
			}
		}
		for (int i = 0; i < defenders.size(); i++) {
			if (playerName.equals(defenders.get(i).getName())) {
				return defenders.get(i).getInfo();
			}
		}
		for (int i = 0; i < midfielders.size(); i++) {
			if (playerName.equals(midfielders.get(i).getName())) {
				return midfielders.get(i).getInfo();
			}
		}
		for (int i = 0; i < forwards.size(); i++) {
			if (playerName.equals(forwards.get(i).getName())) {
				return forwards.get(i).getInfo();
			}
		}
		return playerName + " is not present in team: " + getTeamName();
	}

	public String removePlayer(String playerName) {
		for (int i = 0; i < goalkeepers.size(); i++) {
			if (playerName.equals(goalkeepers.get(i).getName())) {
				goalkeepers.remove(i);
				return playerName + " successfully removed from team: " + getTeamName();
			}
		}
		for (int i = 0; i < defenders.size(); i++) {
			if (playerName.equals(defenders.get(i).getName())) {
				defenders.remove(i);
				return playerName + " successfully removed from team: " + getTeamName();
			}
		}
		for (int i = 0; i < midfielders.size(); i++) {
			if (playerName.equals(midfielders.get(i).getName())) {
				midfielders.remove(i);
				return playerName + " successfully removed from team: " + getTeamName();
			}
		}
		for (int i = 0; i < forwards.size(); i++) {
			if (playerName.equals(forwards.get(i).getName())) {
				forwards.remove(i);
				return playerName + " successfully removed from team: " + getTeamName();
			}
		}
		return playerName + " is not present in team: " + getTeamName();
	}

}
