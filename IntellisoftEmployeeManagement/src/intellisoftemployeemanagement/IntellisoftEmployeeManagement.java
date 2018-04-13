/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intellisoftemployeemanagement;

import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author danial
 */
public class IntellisoftEmployeeManagement  implements Maps{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeDetails empDetails = new EmployeeDetails();
              
        
        //Employee details
        empDetails.setEmployeeID(0);
        empDetails.setFirstname("Daniel");
        empDetails.setLastname("Gitau");
        empDetails.setEmployeeAddress(125679);
        LocalDate contractsigneddate = LocalDate.of(2018, Month.JANUARY, 20);
        empDetails.setContractSignedDate( contractsigneddate);
        LocalDate contractexpirydate = LocalDate.of(2020, Month.JANUARY, 20);
        empDetails.setContractExpiryDate(contractexpirydate);
        empDetails.setContractType("Permanent");
        
        //Collect Employee details in employeedata map
        
        String[] empdetails = new String[]{empDetails.getFirstname(), empDetails.getLastname(), Integer.toString(empDetails.getEmployeeAddress()),empDetails.getContractType()};        //collecting some employee info
        employeeData.put(empDetails.getEmployeeID(), empdetails);         //add above details on the hashmap
        //add all dates to employeedates map
        empDetails.insertDates(empDetails.getEmployeeID(), empDetails.getContractSignedDate());
        empDetails.insertDates(empDetails.getEmployeeID(),  empDetails.getContractExpiryDate());
        

   //Print out some employee data that we've collected previously for Employee with unique ID 0 (I.e hashmap key is 0)
   
     System.out.println(employeeData.get(+empDetails.getEmployeeID())[0]);      //first name
     System.out.println(employeeData.get(empDetails.getEmployeeID())[1] );      //last name
     System.out.println(employeeData.get(empDetails.getEmployeeID())[2] );      //address
     System.out.println(employeeData.get(empDetails.getEmployeeID())[3] );      //type of contract
    
    
}}
