/*
Программа определяет, какая семья (фамилия) живёт в городе:

Пример ввода:

Москва

Ивановы

Киев

Петровы

Лондон

Абрамовичи

Лондон

Пример вывода:

Абрамовичи
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.List;


public class Goroda {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<String> cities = new ArrayList<String>();
        List<String> families = new ArrayList<String>();


        while(true){
            System.out.println("Город: ");
            String city = reader.readLine();




            if(city.equals("end")){
                break;
            }
            System.out.println("Семья: ");

            String family = reader.readLine();
            cities.add(city);
            families.add(family);
            System.out.println("Можете написать end чтобы закончить цикл, или продолжайте записывать города.");

        }
        System.out.println("Запрос Города: ");
        String citysearch = reader.readLine();
        for (int i = 0; i < cities.size(); i++)
        {
            if (citysearch.equals(cities.get(i)))
            {
                System.out.println("Семья из этого города: " + families.get(i));
            } else {
                System.out.println("Не удачный запрос");

            }

        }




    }
}