package com.github.gafmendes.citiesapi.countries.resources;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.github.gafmendes.citiesapi.countries.entities.Country;
import com.github.gafmendes.citiesapi.countries.repositories.CountryRepository;

@RestController
public class CountryResource {

	private final CountryRepository repository;
	
	public CountryResource(final CountryRepository repository) {
		this.repository = repository;
	}
	
	public List<Country> cities(){
		return repository.findAll();
	}
}
