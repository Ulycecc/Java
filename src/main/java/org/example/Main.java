//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package org.example;
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int prod = 1;
        for (int i = 1; i < 10; i++){
            sum += i;
            prod *= i;
        }
        System.out.println("sum: " + sum);
        System.out.println("prod: " + prod);
    }
}