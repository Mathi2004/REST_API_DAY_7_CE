package com.example.demo.Repository;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{
	@Query(value="select * from cartables where owners=:s",nativeQuery=true)
    public List<Car> getCarOwner(@Param("s") int owners);
	@Query(value="select * from cartables where address=:sn",nativeQuery=true)
    public List<Car> getCarAdd(@Param("sn") String address);
	@Query(value="select * from cartables where car_name=:sa",nativeQuery=true)
    public List<Car> getCarName(@Param("sa") String car_name);
	@Query(value="select * from cartables where owners=:s and car_type=:ss",nativeQuery=true)
    public List<Car> getCarDetails(@Param("s") int owners,@Param("ss") String car_type);
}
