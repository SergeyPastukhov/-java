/*
Задание 2

Используя коллекцию удвойте слово:

1. Введите с клавиатуры 5 слов в список строк.

2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.

3. Используя цикл for выведите результат на экран, каждое значение с новой строки.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DoubleLetter {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<String>();
        System.out.println("Введите 5 слов: ");
      for (int i = 0; i < 5; i++)
    {
        list.add(i, reader.readLine());
    }
    ArrayList<String> result = doubleValues(list);
        for (int i = 0; i < list.size(); i++)
            System.out.println(result.get(i));
}
    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for (int i = 0; i < list.size();)
        {
            list.add(i + 1, list.get(i));
            i += 2;
        }
        return list;
    }

}
