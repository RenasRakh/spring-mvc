package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao{
    List<Car> cars = new ArrayList<>();

        public CarDaoImp(){
            cars.add(new Car("car1", "a", 2010));
            cars.add(new Car("car2", "b", 2019));
            cars.add(new Car("car3", "c", 2016));
            cars.add(new Car("car4", "d", 2013));
            cars.add(new Car("car5", "e", 2011));
        }

    public List<Car> getCars() {
        return cars;
    }




}
