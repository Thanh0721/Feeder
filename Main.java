public class Main
{
    public static void main(String[]args)
    {
        //g.simulateOneDay(12);
        //System.out.println("Food after one day: " + g.getCurrentFood() + " grams");
        
        // Simulate many days with birds and display the result
        //int daysWithFood = g.simulateManyDays(12, 10);
       // System.out.println("Days with food: " + daysWithFood);

        Feeder f = new Feeder(500);
        f.simulateOneDay(12);
        System.out.println(f);
    
        Feeder g = new Feeder(1000);
        g.simulateOneDay(22);
        System.out.println("Initial food in grams: " + g.getCurrentFood());
        
        // Test with other feeders
        Feeder h = new Feeder(100);
        h.simulateOneDay(5);
        System.out.println(h.getCurrentFood());

        Feeder i = new Feeder(2400);
        i.simulateManyDays(10, 4);
        System.out.println(i.simulateManyDays(10, 4));

        Feeder j = new Feeder(250);
        j.simulateManyDays(10, 5);
        System.out.println(j.simulateManyDays(10, 5));

        Feeder k = new Feeder(0);
        k.simulateManyDays(5, 10);
        System.out.println(k.simulateManyDays(5, 10));
    }
    
}
