package Module3_CS_320;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Author : Max Maysonet
// Test all use cases for the contact and if they don't qualify, throws error
//
//
//

public class ContactTester {

    //Setter for the Contact====================================

    @Test
    void testValidSetters() {
        Contact contact = new Contact("1", "Little", "Nicky", "1234567890", "9090 BrideGroom Lane");
        assertDoesNotThrow(() -> {
            contact.setFirstName("Heather");
            contact.setLastName("Brown");
            contact.setPhone("8605555126");
            contact.setAddress("1756 North St");
        });
    }

    //Setting an invalid Contact=-------------------------------------------

    @Test
    void testInvalidSetters() {
        Contact contact = new Contact("1", "Little", "Nicky", "1234567890", "9090 BrideGroom Lane");
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("impossiblyLongFirstName"));
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName("evenlongerLastNameThatDoesntEverEnd"));
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("878754"));
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress("1489631958631515 REALLYLONG LANEEEEEEEEEEEEEEEE"));
    }

    @Test
    void testContactIdNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Little", "Nicky", "1234567890", "9090 BrideGroom Lane"));
    }

    @Test
    void testPhoneLength() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Little", "Nicky", "123000", "9090 BrideGroom Lane"));

    @Test
    void testCreateContact() {
        assertDoesNotThrow(() -> new Contact("1", "Little", "Nicky", "1234567890", "9090 BrideGroom Lane"));
    }

    @Test
    void testContactIdLength() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("101010101010101010101", "Little", "Nicky", "1234567890", "9090 BrideGroom Lane"));
    }

    @Test
    void testFirstNameNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", null, "Nicky", "1234567890", "9090 BrideGroom Lane"));
    }

    @Test
    void testFirstNameLength() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "LittleJonathonthathasaLongName", "Nicky", "1234567890", "9090 BrideGroom Lane"));
    }

    @Test
    void testLastNameNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Little", null, "1234567890", "9090 BrideGroom Lane"));
    }

    @Test
    void testLastNameLength() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Little", "Bobbyisthegreatestcoderthateverlived!!!!!!!!!!!!!!", "1234567890", "9090 BrideGroom Lane"));
    }

    @Test
    void testPhoneNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Little", "Nicky", null, "9090 BrideGroom Lane"));
    }

    @Test
    void testAddressNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Little", "Nicky", "1234567890", null));
    }

    @Test
    void testAddressLength() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Little", "Nicky", "1234567890", "21849841, West 2nd Avenue, Florida, TN"));
    }

}