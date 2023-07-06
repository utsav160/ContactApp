package in.crud.contactapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.crud.contactapp.entity.Contact;

public interface ContactRespostory extends JpaRepository<Contact, Long> {

}
