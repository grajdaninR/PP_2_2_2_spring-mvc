package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    List<Car> list = new ArrayList<>(Arrays.asList(
            new Car ("Lada","Red",2019),
            new Car ("Chevrolet","Green",2020),
            new Car ("Mercedes","Yellow",2021),
            new Car ("Audi","Grey",2018),
            new Car ("BMW","Black",2022)));

    public List<Car> getList(int count) {
        if (count < 5 && count > 0 ) {
            return list.subList(0, count);
        }
        return list;
    }
}
