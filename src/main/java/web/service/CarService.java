package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;

@Service
public class CarService {

    public List<Car> getList(List<Car> list, int count) {
        if (count < 5 && count > 0 ) {
            return list.subList(0,count);
        }
        return list;
    }
}
