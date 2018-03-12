package com.schoolofnet.rel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.schoolofnet.rel.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

	@Query(value = "select city.* from cities as city, states as state where city.state_id = state.id and city.state_id = :state_id", nativeQuery = true)
	public List<City> findAllCitiesByState(@Param("state_id") Long id);
}
