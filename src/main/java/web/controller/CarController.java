package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars",  params = {"count"})
    public String getCars(@RequestParam int count, Model model) {
        model.addAttribute("cars", carService.getCarByCount(count));
        return "cars";
    }

    @GetMapping(value = "/cars")
    public String getCars(Model model) {
        model.addAttribute("cars", carService.getCarByCount(5));
        return "cars";
    }

}
