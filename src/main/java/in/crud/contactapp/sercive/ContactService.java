package in.crud.contactapp.sercive;

import java.util.List;

import in.crud.contactapp.entity.Contact;

public interface ContactService {

		String upsert (Contact contact);
		List<Contact> getAllContacts();
		Contact getContact(Long cid);
		String deleteContact(Long cid);

}
