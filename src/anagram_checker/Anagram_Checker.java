/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram_checker;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danial
 
            Algorithm 
        1) Sort both strings
        2) Compare the sorted strings
        3) Arrangement order is immaterial

* */
public class Anagram_Checker {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Exceptions exceptions = new Exceptions();
        
        
            /*
            char str1[] = {'l','i','s','t','e','n'};
            char str2[] = {'s','i','l','e','n','t'};
            if (Anagram_Checker.areStringsAnagram(str1, str2))
            System.out.println("The two strings are anagram of each other");
            else
            System.out.println("The two strings are not  anagram of each other");
            */
        /*
        try {
            exceptions.Checked_Exception();            //
        } catch (FileNotFoundException ex) {           //
            Logger.getLogger(Anagram_Checker.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        exceptions.qn3();
                               
    }
        
   
    // Arguments (Strings) to be checked if they are anagrams
    // Return bool
    static boolean areStringsAnagram(char[] string1, char[] string2)
    {
        // Get lenghts of both strings
        int lengthOfString1 = string1.length;
        int lengthOfString2 = string2.length;
  
        // Cannot be anagrams if lengts are not equal
        if (lengthOfString1 != lengthOfString2)
            return false;
  
        // Sort both strings
        quickSort(string1, 0, lengthOfString1 - 1);
        quickSort(string2, 0, lengthOfString2 - 1);
  
        // Compare sorted strings
        for (int i = 0; i < lengthOfString1;  i++)
            if (string1[i] != string2[i])
                return false;
  
        return true;
    }
  
   /* The functions exchange and partition are required for quickSort)
    
            A[] --> Array to be sorted

   */
    
    static void exchange(char ArrayToBeSorted[],int a, int b)
    {
        char temp;
        temp = ArrayToBeSorted[a];
        ArrayToBeSorted[a]   = ArrayToBeSorted[b];
        ArrayToBeSorted[b]   = temp;
    }
  

    
    static int partition(char ArrayToBeSorted[], int startingIndex, int endingIndex)
    {
        char x = ArrayToBeSorted[endingIndex];
        int i = (startingIndex - 1);
        int j;
      
        for (j = startingIndex; j <= endingIndex - 1; j++)
        {
            if(ArrayToBeSorted[j] <= x)
            {
                i++;
                exchange(ArrayToBeSorted, i, j);
            }
        }
        exchange (ArrayToBeSorted, i+1 , endingIndex);
        return (i + 1);
    }
  

    static void quickSort(char ArrayToBeSorted[], int startingIndex, int endingIndex)
    {
        int partitioningIndex;    
        if(startingIndex < endingIndex)
        {
            partitioningIndex = partition(ArrayToBeSorted, startingIndex, endingIndex);
            quickSort(ArrayToBeSorted, startingIndex, partitioningIndex - 1);
            quickSort(ArrayToBeSorted, partitioningIndex + 1, endingIndex);
        }
    }
    
    
}
