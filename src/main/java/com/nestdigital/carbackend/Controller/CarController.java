package com.nestdigital.carbackend.Controller;

import com.nestdigital.carbackend.Dao.CarDao;
import com.nestdigital.carbackend.Model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addCar",consumes = "application/json",produces = "application/json")
    public String addcar(@RequestBody CarModel car){
        System.out.println(car.toString());
        dao.save(car);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping( "/viewCar")
    public List<CarModel> viewcar(){
        return (List<CarModel>) dao.findAll();
    }


}
