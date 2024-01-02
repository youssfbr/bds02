package com.devsuperior.bds02.repositories;

import com.devsuperior.bds02.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityRepository extends JpaRepository<City, Long> {
}
