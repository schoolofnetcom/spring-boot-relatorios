package com.schoolofnet.rel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.schoolofnet.rel.model.State;
import com.schoolofnet.rel.services.StateServiceImpl;

@RestController
@RequestMapping("/states")
public class StateController {

	@Autowired
	private StateServiceImpl stateService;
	
	public StateController(StateServiceImpl stateService) {
		this.stateService = stateService;
	}
	
	@GetMapping
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public List<State> findAll() {
		return stateService.findAll();
	}
	
	@PostMapping
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public State create(@RequestBody State state) {
		return stateService.create(state);
	}
}
