package rent.car.api.controllers;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import rent.car.api.entities.Car;
import rent.car.api.services.CarService;

@RepositoryRestResource
@Path("/api/v1/cars")
public class CarController {
	@Autowired
	private CarService carService;
	//CRUD c'est definie par default dans DataRest
}
