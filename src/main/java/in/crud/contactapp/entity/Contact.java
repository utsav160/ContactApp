package in.crud.contactapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
@AllArgsConstructor

@NoArgsConstructor
public class Contact {
	@Id
	@GeneratedValue   
	private Long cid;
	private String name;
	private String email;
	private String activeSw;
	private Long phno;

}
