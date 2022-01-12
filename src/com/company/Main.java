package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Variables
        byte age = 30; // specify the type for example 'int' then give it a name e.g 'age' the assign a value e.g
        // 30
        age = 35;
        // We can copy the value assigned to one variable on another variable as shown below
        byte myAge = 30; // byte data type takes 1 byte of the memory
        byte herAge = myAge;
        int items = 2; // int type takes 4 bytes and can hold millions of numbers
        long viewsCount = 3_123_456_789L; // long type takes 8 bytes of memory and can hold up to 2 billion no.s
        float price = 10.99F; // float type takes 2 bytes
        double converter = 12.97;// takes 4 bytes
        char letter = 'A';
        boolean isEligible = true;
        System.out.println(age);
        System.out.println(herAge);
        System.out.println(items);
        System.out.println(viewsCount);
        System.out.println(price);
        System.out.println(converter);
        System.out.println(letter);
        System.out.println(isEligible);
    }
}
