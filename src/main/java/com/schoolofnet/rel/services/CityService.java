package com.schoolofnet.rel.services;

import java.util.List;

import com.schoolofnet.rel.model.City;

public interface CityService {
	public City create(Long stateId, City city);
	public List<City> reportAllCitiesByState(Long stateId);
}
