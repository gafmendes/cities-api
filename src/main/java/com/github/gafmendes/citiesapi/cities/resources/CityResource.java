package com.github.gafmendes.citiesapi.cities.resources;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.gafmendes.citiesapi.cities.entities.City;
import com.github.gafmendes.citiesapi.cities.repositories.CityRepository;

@RestController
@RequestMapping("cities")
public class CityResource {

private final CityRepository repository;
	
	public CityResource(final CityRepository repository) {
		this.repository = repository;
	}
	
	public Page<City> cities(final Pageable page){
		return repository.findAll(page);
	}
}
