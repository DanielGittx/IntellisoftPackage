/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram_checker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author danial
 * Checked Exception - This is an exception that occurs at the compile time (also called compile time exceptions) 
 *                   - Example:- Trying to read a file that does not exist 
 * 
 * Unchecked Exceptions - These are exceptions due to logic errors or improper use of API (programming bugs); they are also called runtime exceptions
 *                        and are usually ignored during compilation
 *                    - Example:- Trying to access element 7 of an array of size 5
 * 
 * 
 */
public class Exceptions {
    
    // Trying to read a file that does not exist results in checked exception
    public void Checked_Exception () throws FileNotFoundException{
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file);
        
    }
    
    public void Unchecked_Exception (){
        int num[] = {16, 20, 43, 64,50};            //Array num declared size 5
         System.out.println(num[7]);                //Trying to access element 7  (non existent!)
        
    }

public void qn3 (){
            Integer a = 1000, b = 1000;
         System.out.println(a.equals(b) );
         Integer c = 100, d = 100;
         System.out.println(c == d);
}
}