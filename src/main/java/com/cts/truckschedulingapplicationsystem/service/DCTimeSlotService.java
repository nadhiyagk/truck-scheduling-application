package com.cts.truckschedulingapplicationsystem.service;

import com.cts.truckschedulingapplicationsystem.model.DCTimeSlot;
import com.cts.truckschedulingapplicationsystem.response.CommonResponse;

public interface DCTimeSlotService {
    CommonResponse insertDcSlot(DCTimeSlot dcTimeSlot);
    CommonResponse updateDcSlot(DCTimeSlot dcTimeSlot, String dcNumber);
    CommonResponse deleteDcSlot(String dcNumber);
    DCTimeSlot getDcSlot(String dcNumber);
}
