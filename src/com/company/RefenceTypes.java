package com.company;

import java.awt.*;
import java.util.Date; // To use a class from a different package to our package we import it

public class RefenceTypes{
    public static void main(String [] args){
        byte age = 30; // Primitive types don't require us to allocate memory
        Date now= new Date(); // Here we use the new operator to allocate memory to this variable
        // These classes have members that we can access using the '.' operator
        now.getTime(); // This member method returns the time component of this object
        System.out.println(now);
        // Reference types works differently compared to primitive types in terms of memory
        /* In the code below we have copied the value of our first variable into the next variable
        what java does is that it references the address of the memory of the first variable to the
        next variable that we just copied the value of the first variable in. They don't store an actual value
        they store a reference to an object. So point1 and point2 are referencing the exact same object in
        memory. The two objects are independent on each other because they are referencing the same object.
        That means updating on either of the variables the change will reflect on both of them as shown below.
         */
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}