package OOADP_FRS_Package;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeat;
    public static int bookingCounter;

    static {
        bookingCounter = 0;
    }

    public Flight(String flightNumber,String airline,int capacity,int bookedSeat){
            ++bookingCounter;
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.bookedSeat=bookedSeat;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(int bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFlightDetails() {
        return this.getFlightNumber()+","+this.getAirline()+","+this.getBookedSeat();
    }

    public String checkAvailability() {
        String availability;
        if(this.bookedSeat<this.capacity)
        {
            availability="Seat Available";

        }
        else
        {
            availability="Seat not Available";
        }
        return availability;
    }

    public void incrementBookingCounter() {
                this.bookedSeat++;
    }
}
