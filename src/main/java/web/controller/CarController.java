package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping("/cars")
    public String printCars (@RequestParam(defaultValue = "5", value = "count") int cars, ModelMap model) {
    List<Car> list = new ArrayList<>(Arrays.asList(
            new Car ("Lada","Red",2019),
            new Car ("Chevrolet","Green",2020),
            new Car ("Mercedes","Yellow",2021),
            new Car ("Audi","Grey",2018),
            new Car ("BMW","Black",2022)));
    list = service.getList(list,cars);
    model.addAttribute("list",list);
    return "car";
 }


}

