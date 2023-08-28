package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Car;
import com.example.demo.Service.CarService;

@RestController
public class CarController
{
   @Autowired
   CarService cs;
   @PostMapping("savecar")
   public Car add(@RequestBody Car c)
   {
	   return cs.saveinfo(c);
   }
   @PostMapping("savecardetails")
   public List<Car> adddetails(@RequestBody List<Car> c)
   {
	   return cs.savedetails(c);
   }
   @GetMapping("showcardetails")
   public List<Car> showinfo()
   {
	   return cs.getinfo();
   }
   @GetMapping("getnew/{owners}")
   public List<Car> displayAll(@PathVariable  int owners)
   {
	   return cs.getOwn(owners);
   }
   @GetMapping("getadd/{address}")
   public List<Car> displayAdd(@PathVariable  String address)
   {
	   return cs.getAddress(address);
   }
   @GetMapping("getcarname/{car_name}")
   public List<Car> displaycarname(@PathVariable  String car_name)
   {
	   return cs.getcarname(car_name);
   }
   @GetMapping("getdetails/{owners}/cartype/{cartype}")
   public List<Car> displaydetails(@PathVariable  int owners,@PathVariable String cartype)
   {
	   return cs.getDetails(owners, cartype);
   }
}
