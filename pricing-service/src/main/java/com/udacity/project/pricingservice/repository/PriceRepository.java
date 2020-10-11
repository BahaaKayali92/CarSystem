package com.udacity.project.pricingservice.repository;

import com.udacity.project.pricingservice.entity.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
