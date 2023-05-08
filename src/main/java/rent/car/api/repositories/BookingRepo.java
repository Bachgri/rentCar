package rent.car.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import rent.car.api.entities.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long> {

}
