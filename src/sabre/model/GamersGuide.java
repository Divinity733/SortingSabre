package sabre.model;

public class GamersGuide implements Comparable
{
	private String name;
	private double numberOfPlayers;
	private boolean isFun;
	
	public GamersGuide(String name, double numberOfPlayers, boolean isFun)
	{
		this.name = name;
		this.numberOfPlayers = numberOfPlayers;
		this.isFun = isFun;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getNumberOfPlayers()
	{
		return numberOfPlayers;
	}
	
	public boolean isFun()
	{
		return isFun;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setNumberOfPlayers(double numberOfPlayers)
	{
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public void setFun(boolean isFun)
	{
		this.isFun = isFun;
	}
	
	@Override
	public String toString()
	{
		String gameInfo = "";
		
		gameInfo += "Hi, I am a video game :D. My name is " + name;
		gameInfo += ". I can play with this many players: " + numberOfPlayers;
		if (isFun)
		{
			gameInfo += ". Brennan says I am fun too :D.";
		}
		else
		{
			gameInfo += ". Everyone knows I suck.";
		}
		
		return gameInfo;
	}
	
	public int compareTo(Object comparedGames)
	{
		int compared = 0;
		
		if (this.numberOfPlayers < ((GamersGuide) comparedGames).getNumberOfPlayers() || (!this.isFun && ((GamersGuide) comparedGames).isFun()))
		{
			compared = -1;
		}
		else if (this.numberOfPlayers > ((GamersGuide) comparedGames).getNumberOfPlayers() || (this.isFun && !((GamersGuide) comparedGames).isFun()))
		{
			compared = 1;
		}
		
		return compared;
	}
	
}
