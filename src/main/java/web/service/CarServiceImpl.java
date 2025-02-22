package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BWM", "X5", "Black"));
        cars.add(new Car("Audi", "Q5", "Yellow"));
        cars.add(new Car("Toyota", "Camry", "Green"));
        cars.add(new Car("Nissan", "Qashqai", "White"));
        cars.add(new Car("Hyundai", "Tucson", "Grey"));
    }

    @Override
    public List<Car> getCarByCount(int count) {
        return cars.stream().limit(count).toList();

    }
}
