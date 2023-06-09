package rent.car.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 64)
	private String fullName;
	@Column(unique = true,length = 64)
	private String username;
	@Column(length = 64)
	private String password;
	@Column(unique = true,length = 64)
	private String email;
	@Column(length = 64)
	private String phone;
	@Column(unique = true,length = 64)
	private String cin;
	@Column(length = 64)
	private String ville;
	
}
