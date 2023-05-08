package rent.car.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import rent.car.api.entities.Utilisateur;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {

}
