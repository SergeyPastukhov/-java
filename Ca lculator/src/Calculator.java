
import java.util.Scanner;


//Задание 
//
//Используя IntelliJ IDEA, создайте класс Ca lculator . 
//
//Напишите программу – консольный калькулятор. Создайте две переменные с 
//
//именами operand1 и operand2. 
//
//Задайте переменным некоторые произвольные значения. Предложите 
//
//пользователю ввести знак арифметической операции. Примите 
//
//значение, введенное пользователем и поместите его в строковую переменную 
//
//sign . Для организации выбора алгоритма вычислительного процесса, 
//
//используйте переключатель switch . Выведите на экран результат выполнения 
//
//арифметической операции. В случае использования операции деления, 
//
//организуйте проверку попытки деления на ноль. И если таковая имеется, то 
//
//отмените выполнение арифметической операции и уведомите об ошибке 
//
//пользователя . 

public class Calculator {


    public static void main (String[] args){

            double operand1 ;
            double operand2;
            double sign;
            String operation;

         Scanner scanner = new Scanner(System.in);
        System.out.print("Напишите первое число: ");
        operand1  = scanner.nextDouble();

        System.out.print("напишите знак (+, -, *, /): ");
        operation = scanner.next();

        System.out.print("Напишите второе число: ");
        operand2 = scanner.nextDouble();

        if (operation == "/" || operand2 == 0) {
            System.out.println("Деление на " + operand2 + " не возможен");
        }
        else
        {
        switch(operation) {
            case "+": sign = operand1  + operand2;
                break;
            case "-": sign = operand1  - operand2;
                break;
            case "*": sign = operand1  * operand2;
                break;
            case "/": sign = operand1  / operand2;
                break;
            default:  System.out.println("не рабочие значения");
                return;
        }

            System.out.println(operand1 + " " + operation + " " + operand2 + " = " + sign);
            System.out.println("Ответ = " + sign);
        }

        }




}
