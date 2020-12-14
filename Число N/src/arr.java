import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*Задание 3

        Минимальное из N чисел:

        1. Ввести с клавиатуры число N.

        2. Считать N целых чисел и заполнить ими список - метод getIntegerList.

        3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
public class arr {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите число");
        List<Integer> integerList = getIntegerList();
        System.out.println("Минимальное значение "+getMinimum(integerList));
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= N ; i++) {

            arr.add(i);
            System.out.print(i+" ");

        }
        System.out.println("В списке "+ N +" целых чисел");

        return arr;
    }
    public static int getMinimum(List<Integer> array) throws IOException {

        int min = array.get(0);
        for (int i = 0; i < array.size() ; i++) {
            if (min>=array.get(i)){
                min=array.get(i);

            }
        }
        return min;
    }
}

