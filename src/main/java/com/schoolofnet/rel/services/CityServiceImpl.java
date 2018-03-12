package com.schoolofnet.rel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolofnet.rel.model.City;
import com.schoolofnet.rel.model.State;
import com.schoolofnet.rel.repository.CityRepository;
import com.schoolofnet.rel.repository.StateRepository;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private StateRepository stateRepository;
	
	public CityServiceImpl(CityRepository cityRepository, StateRepository stateRepository) {
		this.cityRepository = cityRepository;
		this.stateRepository = stateRepository;
	}
	
	@Override
	public City create(Long stateId, City city) {
		Optional<State> state = stateRepository.findById(stateId);
		
		city.setState_id(state.get());
		
		return cityRepository.save(city);
	}
	
	@Override
	public List<City> reportAllCitiesByState(Long stateId) {
		return cityRepository.findAllCitiesByState(stateId);
	}
}
