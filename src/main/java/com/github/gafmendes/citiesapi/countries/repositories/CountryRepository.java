package com.github.gafmendes.citiesapi.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.gafmendes.citiesapi.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
