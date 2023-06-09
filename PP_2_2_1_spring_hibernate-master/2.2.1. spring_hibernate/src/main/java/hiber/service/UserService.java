package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void add2(Car car);

    List<User> listUsers();

    List<Car> listCars();

    User getUserCars(String model, int series);

}
