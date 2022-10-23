package com.nestdigital.carbackend.Dao;

import com.nestdigital.carbackend.Model.CarModel;
import org.springframework.data.repository.CrudRepository;

public interface CarDao extends CrudRepository<CarModel,Integer> {
}
