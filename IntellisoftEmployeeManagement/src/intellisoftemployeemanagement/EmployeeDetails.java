/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intellisoftemployeemanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;






/**
 *
 * @author danial
 */
public class EmployeeDetails implements Maps {


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(int employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public LocalDate getContractSignedDate() {
        return contractSignedDate;
    }

    public void setContractSignedDate(LocalDate contractSignedDate) {
        this.contractSignedDate = contractSignedDate;
    }

    public LocalDate getContractExpiryDate() {
        return contractExpiryDate;
    }

    public void setContractExpiryDate(LocalDate contractExpiryDate) {
        this.contractExpiryDate = contractExpiryDate;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }
    
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    


    
    
   public void insertDates(Integer key, LocalDate value)
    {
        employeeDates.put(key, value);
    }
   /*
   public void insertData(Integer key, String value)
    {
        employeeData.put(key, value);
    }

    public String lookup(Integer key)
    {
        return employeeData.get(key);
 
    }
    
    public String lookupDates(Integer key)
    {
        return employeeData.get(key);
 
    }
    */


    private String lastname;
    LocalDate dateofBirth;             
    private int employeeID;
    private int employeeAddress;
    LocalDate contractSignedDate;
    LocalDate contractExpiryDate;
    String contractType;
 
    
}
