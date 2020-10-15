package com.cts.truckschedulingapplicationsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "dc_time_slots")
public class DCTimeSlot {

    @Id
    @Column(name="dc_number",unique = true)
    private String dcNumber;
    @Column(name="dc_time_slots")
    private String dcTimeSlots;
    @Column(name="max_trucks")
    private int maxTrucks;

    public String getDcNumber() {
        return dcNumber;
    }

    public void setDcNumber(String dcNumber) {
        this.dcNumber = dcNumber;
    }

    public String getDcTimeSlots() {
        return dcTimeSlots;
    }

    public void setDcTimeSlots(String dcTimeSlots) {
        this.dcTimeSlots = dcTimeSlots;
    }

    public int getMaxTrucks() {
        return maxTrucks;
    }

    public void setMaxTrucks(int maxTrucks) {
        this.maxTrucks = maxTrucks;
    }
}
