package com.schoolofnet.rel.services;

import java.util.List;

import com.schoolofnet.rel.model.ReportChart;
import com.schoolofnet.rel.model.State;

public interface StateService {
	public List<State> findAll();
	public State create(State state);
	public List<ReportChart> countCitiesByState();
}
