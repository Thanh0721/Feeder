
public class Feeder 
{

    private int currentFood;

    public Feeder() 
    {
        currentFood = 0;
    }

    public Feeder(int c)
    {
        currentFood = c;
    }

    public int getCurrentFood()
    {
        return currentFood;
    }

    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds) 
    {
        if (Math.random() < 0.05) 
        {
            // 5% chance of bear attack
            currentFood = 0;
        } 
        else 
        {
            // Birds eat randomly between 10 and 50 grams each
            int eaten = (int) (Math.random() * 41) + 10; // Random number between 10 and 50
            currentFood -= eaten * numBirds; // Total food eaten
            if (currentFood < 0) 
            {
                currentFood = 0;
            }
        }
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) 
    {
        return 0;
    }

}
