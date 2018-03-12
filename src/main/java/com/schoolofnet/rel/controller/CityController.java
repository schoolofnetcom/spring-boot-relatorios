package com.schoolofnet.rel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.schoolofnet.rel.model.City;
import com.schoolofnet.rel.services.CityService;

@RestController
@RequestMapping("/states/{stateId}/cities")
public class CityController {

	@Autowired
	private CityService cityService;
	
	public CityController(CityService cityService) {
		this.cityService = cityService;
	}
	
	@PostMapping
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public City create(@PathVariable("stateId") Long stateId, @RequestBody City city) {
		return cityService.create(stateId, city);
	}
}
