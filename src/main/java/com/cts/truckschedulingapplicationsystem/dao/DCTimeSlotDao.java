package com.cts.truckschedulingapplicationsystem.dao;

import com.cts.truckschedulingapplicationsystem.model.DCTimeSlot;
import com.cts.truckschedulingapplicationsystem.response.CommonResponse;

public interface DCTimeSlotDao {
    void insertDCTimeSlot(DCTimeSlot dcTimeSlot);
    void updateDCTimeSlot(DCTimeSlot dcTimeSlot, String dcNumber);
    void deleteDCTimeSlot(String dcNumber);
    DCTimeSlot getDCTimeSlot(String dcNumber);
}
