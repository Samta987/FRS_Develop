package OOADP_FRS_Package;

public class TouristTicket extends Ticket{



    private String hotelAddress;
    private String[] selectedTouristPoints;


    public TouristTicket(String pnr, String from, String to, Flight flight, String departureDateAndTime, String arrivalDateAndTime,
                         Passenger passenger, String seatNo, float price, boolean ticketStatus,String hotelAddress,String[] selectedTouristPoints) {
        super(pnr, from, to, flight, departureDateAndTime, arrivalDateAndTime, passenger, seatNo, price, ticketStatus);
        this.hotelAddress=hotelAddress;
        this.selectedTouristPoints=selectedTouristPoints;

    }

    public TouristTicket() {
        super();
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
    public void getSelectedTouristPoints()
    {
        for (int i=0;i< this.selectedTouristPoints.length;i++) {
            System.out.println(selectedTouristPoints[i]);
        }
    }

    public void setSelectedTouristPoints(String[] selectedTouristPoints) {
        this.selectedTouristPoints = selectedTouristPoints;
    }


}
