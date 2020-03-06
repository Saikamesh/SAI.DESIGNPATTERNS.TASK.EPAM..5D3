package EPAM.Design.Patterns.creational.Factory;

//import java.io.*;      
abstract class plan{  
         protected double rate;  
         abstract void getRate();  
   
         public void Bill(double units){  
              System.out.println(units*rate);  
          }  
}
