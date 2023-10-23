package Module3_CS_320;


public class main {

    //Author : Max MaysonetRamirez
    //Creating the "contact" object
    //
    //
    //
    //Date coded 09/28/2023

    private final String contactId; //Per requirements on the rubric
    private String firstName; 
    private String lastName;
    private String phone;
    private String address;

    public main(String contactId, String firstName, String lastName, String phone, String address) { //per requirements of maximum length on the rubric
        if (contactId == null || contactId.length() > 10 || firstName == null || firstName.length() > 10
                || lastName == null || lastName.length() > 10 || phone == null || phone.length() != 10
                || address == null || address.length() >= 30) { 
            throw new IllegalArgumentException("Invalid argument");
        }

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }


    //Creating the accessors and mutators for the contact characteristics\-----------------------------------------------------------


    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid firstName");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid lastName");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone");
        }
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}