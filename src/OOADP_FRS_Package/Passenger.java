package OOADP_FRS_Package;
/*  TODO :Checkpoint 3:
 1.5: Make Contact and Address classes nested inside the Passenger class. Make these two nested classes private and static.
 1.6: Provide two attributes inside the Passenger class, address of type Address and contact of type Contact. As there is a composition
    relationship between Address and Passenger and Contact and Passenger, these attributes should be initialized by instantiating Address and
    Contact classes inside the Passenger constructor. All the necessary details to instantiate these two objects should be provided via
    Passenger constructor.
 1.7: Provide a private static int attribute in the Passenger class and name it idCounter. This attribute should be used to assign unique
     ids to the passenger objects.
1.8: Provide a getPassengerCount() method inside the Passenger class. This method should return the number of passenger objects created
     inside the system. You can do that with the help of idCounter attribute.
 */
public class Passenger {
    private int id;
    private static int idCounter;

    //class Address having composition relationship with Passenger for getting Address

    public static class Address{
        String area, city, state;
        int pincode;
        public Address(String area,String city,String state,int pincode){
            this.area=area;
            this.city=city;
            this.state=state;
            this.pincode=pincode;
        }
    }
    private Address address;

    //class Contact having Composition relationship with passenger for getting Contact Details

    public static class Contact{
        String name,phone,email;
        public Contact(String name,String contact,String email)
        {
            this.name=name;
            this.phone=contact;
            this.email=email;
        }
    }
    private Contact contact;

    static {
        idCounter = 0;
    }

    //constructor of passenger to get the passenger details
    public Passenger(String addressArea,String addressCity,String addressState,int addressPincode,String contactName, String contactPhone,String contactEmail){
        this.id = ++idCounter;
        this.address = new Address(addressArea, addressCity, addressState,addressPincode);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getAddressDetails() {
        return address.area + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }

    public int getPassengerCount(){
        return this.idCounter;
    }

}
