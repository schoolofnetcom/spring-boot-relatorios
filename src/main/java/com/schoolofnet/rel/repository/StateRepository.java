package com.schoolofnet.rel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoolofnet.rel.model.ReportChart;
import com.schoolofnet.rel.model.State;

@Repository
public interface StateRepository extends CrudRepository<State, Long> {

	@Query(value= "select new com.schoolofnet.rel.model.ReportChart(state.id, state.name, (select count(*) from City city where city.state_id = state.id) ) from State state")
	public List<ReportChart> countCitiesByState();

}
