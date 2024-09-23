public class Main
{
    public static void main(String[]args)
    {
        Feeder f = new Feeder();
        System.out.println(f);
    
        Feeder g = new Feeder(500);
        System.out.println("Initial food in grams: " + g.getCurrentFood());
        
        g.simulateOneDay(12);
        System.out.println("Food after one day: " + g.getCurrentFood() + " grams");
        
        // Simulate many days with birds and display the result
        int daysWithFood = g.simulateManyDays(12, 10);
        System.out.println("Days with food: " + daysWithFood);
        
        // Test with another feeder
        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h.getCurrentFood());

        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);
    }
    
}
