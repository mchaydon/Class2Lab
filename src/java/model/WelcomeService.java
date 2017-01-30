/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mike
 */
public class WelcomeService {
    private Calendar calendar = Calendar.getInstance();
    
    public final String getPartOfDay(){
        calendar.setTime(new Date());
        if (calendar.get(Calendar.HOUR_OF_DAY) >= 7 && calendar.get(Calendar.HOUR_OF_DAY) <= 11)
        {
            return "morning";
        }
        else if (calendar.get(Calendar.HOUR_OF_DAY) >= 12 && calendar.get(Calendar.HOUR_OF_DAY) <= 19)
        {
            return "afternoon";
        }
        else
        {
            return "evening";
        }
    }
    
    public final String getGreeting(String name)
    {
        return "Good " + getPartOfDay() + ", " + name + ". Welcome!";
    }
}
