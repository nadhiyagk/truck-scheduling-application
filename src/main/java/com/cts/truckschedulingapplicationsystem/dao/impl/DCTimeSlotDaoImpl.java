package com.cts.truckschedulingapplicationsystem.dao.impl;

import com.cts.truckschedulingapplicationsystem.dao.DCTimeSlotDao;
import com.cts.truckschedulingapplicationsystem.exception.NoDataFoundException;
import com.cts.truckschedulingapplicationsystem.model.DCTimeSlot;
import com.cts.truckschedulingapplicationsystem.repository.Repository;
import com.cts.truckschedulingapplicationsystem.response.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
@org.springframework.stereotype.Repository
public class DCTimeSlotDaoImpl implements DCTimeSlotDao {
    @Autowired
    private Repository repository;



    @Override
    public void insertDCTimeSlot(DCTimeSlot dcTimeSlot) {
        repository.save(dcTimeSlot);

    }

    @Override
    public void updateDCTimeSlot(DCTimeSlot dcTimeSlot, String dcNumber){
        if(repository.existsById(dcNumber)){
            repository.save(dcTimeSlot);
        }else {
            throw new NoDataFoundException();
        }


    }

    @Override
    public void deleteDCTimeSlot(String dcNumber) {
        if(repository.existsById(dcNumber)) {
            repository.deleteById(dcNumber);
        }else{
            throw new NoDataFoundException();
        }
    }

    @Override
    public DCTimeSlot getDCTimeSlot(String dcNumber) {

        Optional<DCTimeSlot> dcTimeSlot =repository.findById(dcNumber);
        if(!dcTimeSlot.isPresent()){
            throw new NoDataFoundException();
        }
        return dcTimeSlot.get();
    }
}
