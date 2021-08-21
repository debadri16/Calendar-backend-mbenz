package com.example.calendar.Repository;

import com.example.calendar.Model.Plan;

import org.springframework.data.repository.CrudRepository;

public interface PlanRepository extends CrudRepository<Plan, Long> {
    
}
