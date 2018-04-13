/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intellisoftemployeemanagement;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danial
 */
public interface Maps {
    
    
       Map<Integer, String[]> employeeData = new HashMap<>();       //Data 
   
    Map<Integer, LocalDate> employeeDates = new HashMap<>();  //Dates
}
