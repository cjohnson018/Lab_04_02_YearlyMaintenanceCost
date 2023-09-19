public class Main
{
    public static void main(String[] args)
    {
        double springCost = 230.22;
        double summerCost = 109.88;
        double fallCost = 210.95;
        double winterCost = 383.10;
        double yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The maintenance cost for the spring was " + springCost);
        System.out.println("The maintenance cost for the summer was " + summerCost);
        System.out.println("The maintenance cost for the fall was " + fallCost);
        System.out.println("The maintenance cost for the winter was " + winterCost);
        System.out.println("The maintenance cost for the whole year was " + yearlyCost);
    }
}