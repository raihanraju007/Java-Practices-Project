package JavaPrograms100;

import java.util.Scanner;

public class ConvertFahrenheitToCelsius5 {
    public static void main(String[] args) {
//        5.How to convert Fahrenheit to Celsius Program in java
        int temperature;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit : ");
        temperature = sc.nextInt();

        temperature = ((temperature - 32)*5)/9;
        System.out.println("Temperature in Celsius = " + temperature);

    }
}
