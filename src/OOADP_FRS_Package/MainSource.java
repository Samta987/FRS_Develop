package OOADP_FRS_Package;

/*   TODO : checkpoint 2 :
1.1: Create a new Java project using the IntelliJ IDE. Keep your project in the same folder in which you have the class diagram for the
      Flight Reservation System.
1.2: Provide a .gitignore file in the root folder of your project, which is suitable for Java projects developed with IntelliJ.
     You can find one here.
1.3: Provide all the classes, along with their attributes, methods and constructors, which you have identified while drawing the class
  diagram. Keep the classes in the same package in which the Main class exists. You should have identified at least 7 classes as shown below:

        Address
        Contact
        Flight
        Passenger
        RegularTicket
        Ticket
        TouristTicket
1.1: Create a new Java project using the IntelliJ IDE. Keep your project in the same folder in which you have the class diagram for the
        Flight Reservation System.
1.2: Provide a .gitignore file in the root folder of your project, which is suitable for Java projects developed with IntelliJ.
        You can find one here.
1.3: Provide all the classes, along with their attributes, methods and constructors, which you have identified while drawing the class
      diagram. Keep the classes in the same package in which the Main class exists. You should have identified at least 7 classes as shown below:

* */
public class MainSource {
public static  void main(String args[])
    {
        /*1.1: Provide those attributes of the classes which establish aggregation and composition relationship with other classes,
         such as flight attribute of type Flight inside Ticket class which establishes aggregation relationship between Flight
         and Ticket class. (For now, between Flight and RegularTicket, and between Flight and TouristTicket).
          1.2: As there exists an aggregation relationship between Flight and Ticket (RegularTicket and TouristTicket), the flight attribute
         inside the Ticket class should be initialized by passing a Flight object via Ticket constructor.
        1.3: Similar to Flight and Ticket, also provide an aggregation relationship between Passenger and Ticket.
        1.4: Encapsulate all classes inside the Flight Reservation System. To encapsulate a class, you need to make all the attribute
         private and provide getters and setters for those attributes. You may not provide getter and/or setter for an attribute if there is no need.
        */
            System.out.println("Welcome to Flight Reservation System");
            Passenger passenger=new Passenger("Radhika nagar","Nanded","Maharashtra",
                    431605,"Samta Kapure","+91-0987654321","abcdxxx@gmail.com");

            System.out.println(passenger.getAddressDetails());
            System.out.println(passenger.getContactDetails());
            System.out.println(passenger.getPassengerCount());

            Flight flight=new Flight("20B","Air India",120,120);
            System.out.println(flight.getFlightDetails());
            System.out.println(flight.checkAvailability());
            System.out.println(flight.getBookedSeat());

            RegularTicket regularTicket=new RegularTicket("PNR305090","Mumbai","Banglore",flight,"07-09-2021 06:00:00",
                    "07-09-2021 12:00:00",passenger,"B20",15000,true,"Food");
            //String TouristPlace[]=new String[]{"Baga Beach","Grand Island","Church","Anjuna Beach","Casino Cruise"};

            TouristTicket touristTicket=new TouristTicket("PNR305091","Hyderabad","Goa",flight,"07-09-2021 06:00:00","07-09-2021 06:00:00",
                    passenger,"C13",7500,true,"Casa De Goa",new String[]{"Baga Beach","Grand Island","Church","Anjuna Beach","Casino Cruise"});


            MainSource.printTicketDetails(regularTicket);
            MainSource.printTicketDetails(touristTicket);
    }
/*
TODO:Checkpoint 5:
* 1.1: In the main class, provide a public static method with the following signature:
     + printTicketDetails(ticket: Ticket): void
1.2: The above method will accept an object of either RegularTicket type or TouristTicket type and print its PNR number on the console.
1.3: In the main() method, create two objects, one of them should be the type of RegularTicket class and another one should be of the
    type of TouristTicket class.
1.4: In the main() method, call printTicketDetails() method twice with both the objects to print their PNR numbers on the console.
*/
    public static void printTicketDetails(Ticket ticket)
    {
        System.out.println(ticket.getPnr());
    }
    }

