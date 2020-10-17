package com.udacity.project.pricingservice.repository;

import com.udacity.project.pricingservice.entity.Price;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
