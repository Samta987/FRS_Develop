package OOADP_FRS_Package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/*  TODO: Checkpoint 4:
 1.1: Provide the inheritance relationship between Ticket and RegularTicket and between Ticket and TouristTickek. So now, both the
      RegularTicket and TouristTicket classes will extend the Ticket class.
1.2: Move all the common attributes and methods (along with getters and setters) from RegularTicket and TouristTicket classes to the Ticket
      class to improve code reusability.
1.3: Provide a parameterized constructor inside the Ticket class to initialize all the common attributes. This constructor will be called
    from the constructors of the RegularTicket class and TouristTicket class using the super() keyword.
1.4: Also make Ticket class abstract so you can't instantiate the Ticket class.
 */
public abstract class Ticket {

    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateAndTime;
    private String arrivalDateAndTime;
    private Passenger passenger;
    private String seatNo;
    private float price;
    private boolean ticketStatus;

    public Ticket(String pnr,String from,String to,Flight flight,String departureDateAndTime,String arrivalDateAndTime,Passenger passenger,String seatNo,float price,boolean ticketStatus){
        this.pnr=pnr;
        this.from=from;
        this.to=to;
        this.flight=flight;
        this.departureDateAndTime=departureDateAndTime;
        this.arrivalDateAndTime=arrivalDateAndTime;
        this.passenger=passenger;
        this.seatNo=seatNo;
        this.price=price;
        this.ticketStatus=ticketStatus;
    }

    public Ticket() {
        this.pnr=pnr;
        this.from=from;
        this.to=to;
        this.flight=flight;
        this.departureDateAndTime=departureDateAndTime;
        this.arrivalDateAndTime=arrivalDateAndTime;
        this.passenger=passenger;
        this.seatNo=seatNo;
        this.price=price;
        this.ticketStatus=ticketStatus;
    }


    public String checkStatus(){
        if(this.ticketStatus==true)
        {
            return "confirmed";
        }
        else
        {
            return "Cancelled";
        }
    }
        //Enter date and time in specific format DD/MM/YYYY HH:MM:SS(24hrs) Example :07/09/2021 9:00
    public String getFlightDuration(){
        String duration=calculateTimeDifference(this.departureDateAndTime,this.arrivalDateAndTime);
        return duration;
    }

    private String calculateTimeDifference(String departureDateAndTime, String arrivalDateAndTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String difference="";
        try {
            Date d1 = sdf.parse(departureDateAndTime);
            Date d2 = sdf.parse(arrivalDateAndTime);
            long difference_In_Time = d2.getTime() - d1.getTime();
            long difference_In_Minutes = TimeUnit.MILLISECONDS.toMinutes(difference_In_Time) % 60;
            long difference_In_Hours = TimeUnit.MILLISECONDS.toHours(difference_In_Time) % 24;
            difference =difference_In_Hours+" Hrs and "+difference_In_Minutes+" min";

        }catch(Exception e)
        {
            System.out.println("Enter valid Date in Correct Format EX:DD/MM/YYYY HH:MM:SS(24hrs)");
        }
        return difference;
    }


    public void cancel()
    {
        this.ticketStatus=false;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }


    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;

    }


}
