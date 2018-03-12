package com.schoolofnet.rel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolofnet.rel.model.ReportChart;
import com.schoolofnet.rel.model.State;
import com.schoolofnet.rel.repository.StateRepository;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;
	
	public StateServiceImpl(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}

	@Override
	public List<State> findAll() {
		return (List<State>) stateRepository.findAll();
	}
	
	@Override
	public State create(State state) {
		return stateRepository.save(state);
	}
	
	@Override
	public List<ReportChart> countCitiesByState() {
		return stateRepository.countCitiesByState();
	}

}

