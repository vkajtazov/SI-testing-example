/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import java.util.IllegalFormatException;

/**
 *
 * @author Viktor
 */
public class Operations {

    
    public String checkArray ( int [] array) throws NullPointerException{
        if(array==null || array.length==0) throw new NullPointerException();
        if(array.length<10)return "OK";
        else return "too long array";
    }
    
    public int [] sum (int [] array1, int [] array2) throws IllegalArgumentException,ArrayIndexOutOfBoundsException{
        if (array1 ==null || array2==null) throw new IllegalArgumentException();
        if(array1.length!= array2.length) throw new ArrayIndexOutOfBoundsException();
        
        for(int i=0;i<array1.length;i++){
            array1[i] +=array2[i];
        }
        return array1;
    }
    
    public boolean isOkArray (int [] array){
        return array.length>0;
    }
    
    
}
