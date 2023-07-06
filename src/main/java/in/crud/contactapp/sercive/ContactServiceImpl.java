package in.crud.contactapp.sercive;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.crud.contactapp.entity.Contact;
import in.crud.contactapp.repository.ContactRespostory;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRespostory repo;

	@Override
	public String upsert(Contact contact) {
		Contact save = repo.save(contact);
		return "SUCCESS";
	}

	@Override
	public List<Contact> getAllContacts() {
		return repo.findAll();
	
	}


	

	@Override
	public Contact getContact(Long cid) {
		Optional<Contact> findById=repo.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteContact(Long cid) {
		repo.deleteById(cid);
		return "SUCCESS";
	}

}
