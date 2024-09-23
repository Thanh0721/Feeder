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

    // Simulates one day with numBirds birds or possibly a bear at the bird feeder
    public void simulateOneDay(int numBirds) 
    {
        if (Math.random() < 0.05) 
        {
            currentFood = 0;
        } 
        else 
        {
            // Birds eat randomly between 10 and 50 grams each
            int eaten = (int) (Math.random() * 41) + 10;
            currentFood -= eaten * numBirds; // Total food eaten
            if (currentFood < 0) 
            {
                currentFood = 0;
            }
        }
    }

    // Returns the number of days birds or a bear found food to eat
    public int simulateManyDays(int numBirds, int numDays) 
    {
        int days = 0;
        for (int i = 0; i < numDays; i++)
        {
            simulateOneDay(numBirds);
            if (currentFood > 0)
            {
                days++;
            }
        }
        return days;
    }

    public String toString()
    {
        return "Current Food: " + currentFood;
    }

}
