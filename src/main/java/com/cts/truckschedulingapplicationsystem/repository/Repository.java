package com.cts.truckschedulingapplicationsystem.repository;

import com.cts.truckschedulingapplicationsystem.model.DCTimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<DCTimeSlot,String> {

}
