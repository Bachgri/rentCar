package rent.car.api.services.impl;

import rent.car.api.repositories.CarRepo;
import rent.car.api.services.CarService;

public class CarServiceImpl implements CarService {

	private CarRepo cr;

	public CarServiceImpl(CarRepo cr) {
		this.cr = cr;// pour l'injection des dépendences sinon utilisé l'annotation @Autowired
	}
	
	
	
}
