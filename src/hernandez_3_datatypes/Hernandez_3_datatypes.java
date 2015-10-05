/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hernandez_3_datatypes;

/**
 *
 * @author ahernandez2248
 */
public class Hernandez_3_datatypes {

   
    public static void main(String[] args) {
       // This is a comment
        //We will use many comments to explain our code
        //This program explores some of the primitive data types
        int i = 0;
        float a = 0.01f;
        double b = 0.01;
        short c = 123;
        char d1= ';';
        char d2 = 'a';
        char d3= 42;
        char d4 = 145;
        String e = d4+"";
        String e1 = "diction";
        boolean f = true;
        boolean g = i % 2 == 0;
        
       /*
        Here we will look at some mathematical operators
        */
        // + this add 2 or more numbers (you don't say)
        // - subtracts 2 or more numbers
        // *  this multiplies numbers (you know, because you learned this in elementary school)
        // / this divides multiple numbers
        // % this is mondulo, it shows the remainder
        
        
        System.out.println(i + " This is an integer");
        System.out.println(a + " This is a float");
        System.out.println(b + " This is a double");
        System.out.println(c + " This is a short");
        System.out.println(d1 + " This is a char");
        System.out.println(d2+ " This is a char");
        System.out.println(d3 + " This is a char");
        System.out.println(d4 + " This is a char");
        System.out.println(e + " This is a string");
        System.out.println(e1 + " This is a string");
        System.out.println(f + " This is a boolean");
        System.out.println(g + " This is a boolean");
         
//        for(i = -123; i < 123; i++ ) {
//            System.out.println((char) i);
//
//           //a number value for char
//            //maps to a character
//         
//         }
        i=0;
        a=0;
        System.out.println(i + a + " This is an integer" + " plus a float");
        System.out.println(a + b + " This is a float" + " plus a double");
        System.out.println(b + c + " This is a double" + " plus a short");
        System.out.println(c + " This is a short");
    }
    
}
