/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        ScientificCalculator calc = new ScientificCalculator();
        int result= calc.modulo(5, 2);
        System.out.println("modulo =" + result);

    }
}


        /*System.out.println(new App().getGreeting());
        //System.out.println("Starting QCalc..");
        StandardCalculator calc = new StandardCalculator();
        calc.add(1, 2);
        calc.subtract(6,2);
        calc.multiply(5,2);
        calc.divide(10,2);
        System.out.println(calc.getResult());
        //System.out.println(calc.result);

        //int result = calc.add(1,1);
        //int result = calc.subtract(3,2);
        //int result = calc.multiply(1,2);
        //int result = calc.divide(4,2);
        //System.out.println(result);*/
        
    

