package Module3_CS_320;

import java.util.*;
import java.util.Map;
import java.util.HashMap;

//Contact Service
//Author Max MaysonetRamirez
//
//
//In this code, I've created the accessors and mutators for contact change. 
//Also confirming that the inputs aren't invalid, this should be all that is needed for the rubric requirements.
//

public class ContactService {

    private final Map<String, main> contacts = new HashMap<>();

    //Appending to the list of objects------------------------------------------------------------------

    public void addContact(main contact) {
        if (contact == null || contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException ("Invalid contact or contact already exists");
        }
        contacts.put(contact.getContactId(), contact);
    }

    //Accessor for the Contact object--------------------------------------------------------------------


    public main getContact(String contactId) {
        main contact = contacts.get(contactId);
        if (contact == null) {
            throw new NoSuchElementException("Contact not found");
        }
        return contact;
    }

    //Mutator to update contact-----------------------

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        main contact = getContact(contactId); // this will throw an exception if the contactId is not found

        if (firstName != null && !firstName.isEmpty() && firstName.length() <= 10) {
            contact.setFirstName(firstName);
        }
        if (lastName != null && !lastName.isEmpty() && lastName.length() <= 10) {
            contact.setLastName(lastName);
        }
        if (phone != null && !phone.isEmpty() && phone.length() == 10) {
            contact.setPhone(phone);
        }
        if (address != null && !address.isEmpty() && address.length() <= 30) {
            contact.setAddress(address);
        }
    }

    //Mutator to delete contact from contact list----------------------
    
    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new NoSuchElementException("Contact not found");
        }
        contacts.remove(contactId);
    }
}
