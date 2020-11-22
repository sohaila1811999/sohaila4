/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package developers;

import java.util.Scanner;

/**
 *
 * @author sohaila
 */
public class FlutterDeveloper extends inheritance implements NewInterface{
   
    public FlutterDeveloper() {
    }
                  int numberOfAbsenceHours;

 
   int salary;
String job= "Flutter";
    
        
//To change body of generated methods, choose Tools | Templates.

    @Override
    public double getSalary(int workTimeInHours, int theNumberOfHoursOfAbcensAllowed) {
    int numberOfAbsenceHours=10;
   if(numberOfAbsenceHours>10){
            return (salary-(numberOfAbsenceHours*60));

     }else {
  return    salary= workTimeInHours *50;}}

    @Override
    public double getTotalMoneyDeductedFromSalary(String job, int theNumberOfHoursOfAbcensAllowed) {
        return numberOfAbsenceHours*60;
    }

    }

 
  
  
    
    
     

        
  

