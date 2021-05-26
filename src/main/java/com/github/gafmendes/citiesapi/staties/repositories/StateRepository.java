package com.github.gafmendes.citiesapi.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.gafmendes.citiesapi.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
