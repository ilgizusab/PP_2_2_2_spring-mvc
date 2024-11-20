package web.services;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<Car>();

    public CarService(){
        cars.add(new Car("Camry", "Toyota", 2015));
        cars.add(new Car("Civic", "Honda", 2010));
        cars.add(new Car("Mustang", "Ford", 1965));
        cars.add(new Car("Vaz 2113", "Lada", 2012));
        cars.add(new Car("Cayene", "Porsche", 2020));
    }

    public List<Car> getCars(Integer count){
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
