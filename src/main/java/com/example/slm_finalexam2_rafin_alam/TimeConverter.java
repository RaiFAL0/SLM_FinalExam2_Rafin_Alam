package com.example.slm_finalexam2_rafin_alam;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeConverter {
    int time;


    @RequestMapping("api/convert")
    public String setTime(@RequestParam int number) {
        if(number <1 || number >24){
            return "Invalid number. Pls enter a number";
        }
        if (number >= 1 && number < 12) {
            return number + " AM";
        } else if (number > 12 && number < 24) {
            return number + " PM";
        } else if (number == 12){
            return number + " PM";
        }
        else
            return number + " AM";
    }

    


}
