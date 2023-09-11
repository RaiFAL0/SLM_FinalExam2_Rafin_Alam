package com.example.slm_finalexam2_rafin_alam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConverterTest {

    @Test
    void setTime(){
        TimeConverter tConv = new TimeConverter();
        int time = 16;
        tConv.setTime(time);
        assertEquals("4 PM", tConv.setTime(time));
    }






}