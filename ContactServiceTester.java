package Module3_CS_320;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Author Max MaysonetRamirez
//
//
//
// Contact Service Tester to test all Mutator and other methods including in the ContactService.Java


class ContactServiceTest {

    private ContactService contactService;

    @BeforeEach
    void setUp() {
        contactService = new ContactService();
    }

    @Test
    void testUpdateContact() {
        main contact = new main("1", "Updating", "Contact", "1234567891", "1 Yellow Lane");
        contactService.addContact(contact);
        assertDoesNotThrow(() -> contactService.updateContact("1", "TestName", "Woodward", "0987654321", "321 Avenue"));
    }

    @Test
    void testUpdateNonexistentContact() {
        assertThrows(NoSuchElementException.class, () -> contactService.updateContact("2", "TestName", "Woodward", "1024567893", "93201 South Avenue"));
    }

    
    @Test
    void testAddContact() {
        assertDoesNotThrow(() -> contactService.addContact(new main("1", "Henry", "Winkler", "1234567890", "11010 Mystreet")));
    }

    @Test
    void testAddExistingContact() {
        main contact = new main("1", "Henry", "Winkler", "1234567890", "11010 Mystreet");
        contactService.addContact(contact);
        assertThrows(IllegalArgumentException.class, () -> contactService.addContact(contact));
    }

    @Test
    void testDeleteNonexistentContact() {
        assertThrows(NoSuchElementException.class, () -> contactService.deleteContact("2"));
    }

    @Test
    void testGetContact() {
        main contact = new main("1", "Henry", "Winkler", "1234567890", "11010 Mystreet");
        contactService.addContact(contact);
        assertDoesNotThrow(() -> assertEquals(contact, contactService.getContact("1")));
    }

    @Test
    void testDeleteContact() {
        main contact = new main("1", "Henry", "Winkler", "1234567890", "11010 Mystreet");
        contactService.addContact(contact);
        assertDoesNotThrow(() -> contactService.deleteContact("1"));
    }

    @Test
    void testGetNonexistentContact() {
        assertThrows(NoSuchElementException.class, () -> contactService.getContact("2"));
    }
}