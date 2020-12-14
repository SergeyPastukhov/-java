
//Используя IntelliJ IDEA, создайте класс Translator .
//
//Напишите программу русско-английский переводчик.
//
//Программа знает 10 слов о погоде. Требуется, чтобы пользователь вводил
//
//слово на русском языке, а программа давала ему перевод этого слова на
//
//английском языке. Если пользователь ввел слово, для которого отсутствует
//
//перевод, то следует вывести сообщение, что такого слова нет.
//
//Самостоятельная деятельность учащегося


import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        System.out.println ("Введите слово из словаря: дождливо, солнечно, пасмурно, облачно, ветрено, снежно, холодно, тепло, туманно, душно. ");

        Scanner scanner = new Scanner(System.in);
        String myWeather;
        myWeather = scanner.next();


        switch (myWeather)
        {
            case "дождливо":
                System.out.println("Перевод данного слова rainy.");
                break;
            case "солнечно": System.out.println("Перевод данного слова sunny.");
                break;
            case "пасмурно": System.out.println("Перевод данного слова mainly cloudy.");
                break;
            case "облачно": System.out.println("Перевод данного слова cloudy.");
                break;
            case "ветрено": System.out.println("Перевод данного слова windy.");
                break;
            case "снежно": System.out.println("Перевод данного слова snowy.");
                break;
            case "холодно": System.out.println("Перевод данного слова cold.");
                break;
            case "тепло": System.out.println("Перевод данного слова warm.");
                break;
            case "туманно": System.out.println("Перевод данного слова hazy.");
                break;
            case "душно": System.out.println("Перевод данного слова stuffy.");
                break;
            default:System.out.println("Такого слова нет.");
                break;
    }

}


    }
