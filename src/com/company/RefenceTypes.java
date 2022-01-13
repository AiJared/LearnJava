package com.company;

import java.util.Date; // To use a class from a different package to our package we import it

public class RefenceTypes{
    public static void main(String [] args){
        byte age = 30; // Primitive types don't require us to allocate memory
        Date now= new Date(); // Here we use the new operator to allocate memory to this variable
        // These classes have members that we can access using the '.' operator
        now.getTime(); // This member method returns the time component of this object
        System.out.println(now);
    }
}