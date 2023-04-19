/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ColllectionsTry {
    
    public static void main2(String[] args) {
        List<String> str=new ArrayList<String>();
        str.add("arun");
        str.add("vijay");
        str.add("chitra");
        str.add("gokul");
        str.add("harish");
        
        str.set(3,"raj");
        str.set(4, "mari");
        
        System.out.println(str);
        
        
        
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(89);
        arr.add(78);
        arr.add(56);
        arr.add(45);
        arr.add(23);
        arr.add(99);
        
        Iterator<Integer> numbersIterator = arr.iterator();
        
       
        
        
//        while (numbersIterator.hasNext()) {
//            Integer num = numbersIterator.next();
            
            
            
            
            
//            if(num % 2 != 0) {
//                numbersIterator.remove();
//            }
        }

        System.out.println(arr);
        
        
        
        
//        Iterator<Integer>num=arr.iterator();
//        while(num.hasNext()){
//            Integer numm=num.next();
//            if (numm%2!=0){
//                num.remove();
//            }
//            
//            System.out.println("Number is printed");
//        }
        
        
//        System.out.println(arr);
//        System.out.println(arr.size());
//        System.out.println(arr.get(2));
//        System.out.println(arr.get(3));
//       
        
        
        
        
        
        
        
        
    }
    
}
