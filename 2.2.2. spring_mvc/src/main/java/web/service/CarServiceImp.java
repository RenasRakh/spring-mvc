package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDaoImp carDao;

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = carDao.getCars();
        List<Car> carsNew = new ArrayList<>();
        int i = 0;

        for (Car car: cars){
            if (i<count) {
                carsNew.add(car);
                i++;
            }
        }
        i = 0;

        return carsNew;
    }
}
