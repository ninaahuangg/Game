public class Game
{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;

    public Game()
    {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    public void play() 
    {

    }

    public int getScore()
    {
        int points = 0;
        if (levelOne.goalReached()) points += levelOne.getPoints();
        if (levelTwo.goalReached()) points += levelTwo.getPoints();
        if (levelThree.goalReached()) points += levelThree.getPoints();
        if (isBonus()) points *= 3;
        return points;
    }

    public int playManyTimes(int num)
    {

    }
    public boolean isBonus()
    {
        return bonus;
    }
    public void makeBonus()
    {
        bonus = true;
    }
    public Level getLevel(int i)
    {
        if (i == 1) return levelOne;
        if (i == 2) return levelTwo;
        if (i == 3) return levelThree;
        return null;
    }
}