package rent.car.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import rent.car.api.entities.Car;

public interface CarRepo extends JpaRepository<Car, Long> {
	
}
