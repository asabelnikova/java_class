package tasks.filereader;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    private  File InputFile;
    public void UsingFileReader(String fileName)throws IOException{
        File file = new File(fileName);
        //создаем объект tasks.filereader.FileBufferedReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего tasks.filereader.FileBufferedReader для построчного считывания
        BufferedReader br = new BufferedReader(fr);
        // считаем сначала первую строку
        String line;
        while((line = br.readLine()) != null){
            //обрабатываем считанную строку - пишем ее в консоль
            System.out.println(line);
        }
        br.close();
        fr.close();

    }
}
