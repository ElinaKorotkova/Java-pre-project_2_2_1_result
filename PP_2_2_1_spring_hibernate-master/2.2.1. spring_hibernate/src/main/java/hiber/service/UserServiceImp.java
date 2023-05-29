package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void add2(Car car) {
        userDao.add2(car);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Transactional
    @Override
    public List<Car> listCars() {
        return userDao.listCars();
    }

    @Transactional
    @Override
    public User getUserCars(String model, int series) {
        return userDao.getUserCars(model, series);
    }

}
