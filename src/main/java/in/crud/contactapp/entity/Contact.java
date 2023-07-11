package in.crud.contactapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
@AllArgsConstructor
@Table(name = "contact")
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
