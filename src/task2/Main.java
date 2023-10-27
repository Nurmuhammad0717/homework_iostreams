package task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        File file = new File("info/student.txt");

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());

        String line;
        List<String> studentInfo = new ArrayList<>();

        while((line=bufferedReader.readLine())!=null){
            studentInfo.add(line);
        }

        String student1 = studentInfo.get(0);

        String[] split = student1.split(",");

        for (String s : split) {
            System.out.println(s);
        }



    }
}
