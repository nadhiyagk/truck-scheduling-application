package com.cts.truckschedulingapplicationsystem.controller;

import com.cts.truckschedulingapplicationsystem.model.DCTimeSlot;
import com.cts.truckschedulingapplicationsystem.repository.Repository;
import com.cts.truckschedulingapplicationsystem.response.CommonResponse;
import com.cts.truckschedulingapplicationsystem.service.DCTimeSlotService;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/truckSchedule")
public class Controller {

    private DCTimeSlotService service;

    public Controller(DCTimeSlotService service) {
        this.service = service;
    }

    @PostMapping("/insertDcSlot")
    public ResponseEntity<CommonResponse> insertDCSlot(@RequestBody DCTimeSlot dcTimeSlot) {
        CommonResponse commonResponse= service.insertDcSlot(dcTimeSlot);
        return ResponseEntity.accepted().body(commonResponse);

    }
    @PutMapping("/updateDcSlot/dcNumber/{dcNumber}")
    public ResponseEntity<CommonResponse> updateDcSlot(@RequestBody DCTimeSlot dcTimeSlot, @PathVariable String dcNumber) {
        CommonResponse commonResponse=service.updateDcSlot(dcTimeSlot,dcNumber);
        return ResponseEntity.accepted().body(commonResponse);
    }
    @DeleteMapping("/deleteDcSlot/dcNumber/{dcNumber}")
    public ResponseEntity<CommonResponse> deleteDcSlot(@PathVariable String dcNumber) {
        CommonResponse commonResponse=service.deleteDcSlot(dcNumber);
        return ResponseEntity.accepted().body(commonResponse);
    }
    @GetMapping("/getDcSlot/dcNumber/{dcNumber}")
    public ResponseEntity<DCTimeSlot> getDcSlot(@PathVariable String dcNumber) {
        return ResponseEntity.accepted().body(service.getDcSlot(dcNumber));
    }

}
