package com.cts.truckschedulingapplicationsystem.service.impl;

import com.cts.truckschedulingapplicationsystem.dao.DCTimeSlotDao;
import com.cts.truckschedulingapplicationsystem.exception.NoDataFoundException;
import com.cts.truckschedulingapplicationsystem.model.DCTimeSlot;
import com.cts.truckschedulingapplicationsystem.response.CommonResponse;
import com.cts.truckschedulingapplicationsystem.service.DCTimeSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DCTimeSlotServiceImpl implements DCTimeSlotService {
    @Autowired
    private DCTimeSlotDao dao;

    @Override
    public CommonResponse insertDcSlot(DCTimeSlot dcTimeSlot) {
        dao.insertDCTimeSlot(dcTimeSlot);
        CommonResponse commonResponse=new CommonResponse();
        commonResponse.setMessage("Saved Successfully");
        return commonResponse;
    }

    @Override
    public CommonResponse updateDcSlot(DCTimeSlot dcTimeSlot, String dcNumber)  {
        CommonResponse commonResponse = new CommonResponse();
        if(dcNumber.equalsIgnoreCase(dcTimeSlot.getDcNumber())) {
            dao.updateDCTimeSlot(dcTimeSlot, dcNumber);
            commonResponse.setMessage("Saved Successfully");
        }else{
            commonResponse.setMessage("DC Number mismatch in Input");
        }
        return commonResponse;
    }

    @Override
    public CommonResponse deleteDcSlot(String dcNumber) {
        CommonResponse commonResponse = new CommonResponse();
        dao.deleteDCTimeSlot(dcNumber);
        commonResponse.setMessage("Deleted Successfully");
        return commonResponse;
    }

    @Override
    public DCTimeSlot getDcSlot(String dcNumber) {
        return dao.getDCTimeSlot(dcNumber);

    }
}
