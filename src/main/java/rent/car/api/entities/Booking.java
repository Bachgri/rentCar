package rent.car.api.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(fetch = FetchType.LAZY)
	private Car car;
	@ManyToOne(fetch = FetchType.LAZY)
	private Utilisateur utilisateur;
	private String start;
	private String end;
	private double cost;
}
