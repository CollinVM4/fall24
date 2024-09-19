import java.util.ArrayList; // import the ArrayList class
import java.util.Collections; // thank you vscode :D

public class TicketAgent
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<AirplaneTickets> tickets = new ArrayList<AirplaneTickets>();

        AirplaneTickets t = new AirplaneTickets("Spirit", 50.00, 2);
        tickets.add(t);
        t = new AirplaneTickets("Delta", 350.00, 1);
        tickets.add(t);
        t = new AirplaneTickets("Delta", 10000.00, 2);
        tickets.add(t);
        t = new AirplaneTickets("The Fun Bus", 25.00, 5);
        tickets.add(t);
        t = new AirplaneTickets("Southwest", 350.00, 3);
        tickets.add(t);
        
        Collections.sort(tickets);


        for (AirplaneTickets at : tickets)
        {
            System.out.println(at);
        }


    }
}