
public class AirplaneTickets implements Comparable<AirplaneTickets>
{
    private String airlineName;
    private double price;
    private int connections;


    public AirplaneTickets(String n, double p, int c)
    {
        this.airlineName = n;
        this.price = p;
        this.connections = c;
    }

    public String toString()
    {
        return "Airline: "+this.airlineName + "($" +this.price+", " +this.connections+ ")";
    }

    public int compareTo(AirplaneTickets o)
    {

        if (this.airlineName.equals("Spirit") && !o.airlineName.equals("Spirit"))
        {
            return 1;
        }
        if (!this.airlineName.equals("Spirit") && o.airlineName.equals("Spirit"))
        {
            return -1;
        }

        if (this.price - o.price > 0)
        {
            return 1;
        }
        if (this.price - o.price < 0)
        {
            return -1;
        }        

        return this.connections - o.connections;
    }
}