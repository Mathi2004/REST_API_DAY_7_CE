package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Car;
import com.example.demo.Repository.CarRepo;

@Service
public class CarService {
    @Autowired
    CarRepo cr;
    public Car saveinfo(Car c)
    {
    	return cr.save(c);
    }
    public List<Car> savedetails(List<Car> c)
    {
    	return cr.saveAll(c);
    }
    public List<Car> getinfo()
    {
    	return cr.findAll();
    }
    public List<Car> getOwn(int owners)
    {
    	return cr.getCarOwner(owners);
    }
    public List<Car> getAddress(String address)
    {
    	return cr.getCarAdd(address);
    }
    public List<Car> getcarname(String car_name)
    {
    	return cr.getCarName(car_name);
    }
    public List<Car> getDetails(int owners,String car_type)
    {
    	return cr.getCarDetails(owners, car_type);
    }
}
