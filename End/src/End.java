import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class End {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while(true){
            System.out.println("Напишите слово, или напишите end чтобы закончить цикл: ");
            String write = reader.readLine();
            if(write.equals("end")){
                break;
            } else {
                list.add(write);
            }
        }

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
