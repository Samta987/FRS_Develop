package OOADP_FRS_Package;

public class RegularTicket extends Ticket{


    private String specialService;


    public RegularTicket(String pnr, String from, String to, Flight flight, String departureDateAndTime, String arrivalDateAndTime, Passenger passenger, String seatNo,
                         float price, boolean ticketStatus,String specialService) {
        super(pnr, from, to, flight, departureDateAndTime, arrivalDateAndTime, passenger, seatNo, price, ticketStatus);
            this.specialService=specialService;
    }

    public RegularTicket() {
        super();
    }


    public String getSpecialService() {
        return specialService;
    }

    public void updateSpecialService(String specialService) {
        this.specialService = specialService;
    }


}
