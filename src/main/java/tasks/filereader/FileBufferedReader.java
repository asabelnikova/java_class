package tasks.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferedReader extends FileProcessor {
    public FileBufferedReader(final String a) {
        super(a);
    }

    public void readFile() {
       readUsingFileReader();
    }

    //Используем класс Files для обработки небольших файлов, получаем содержимое файла файла
    private void readUsingFileReader(String fileName) throws IOException {

        final File file = new File(fileName);
        //создаем объект tasks.filereader.FileBufferedReader для объекта File
        final FileReader fr = new java.io.FileReader(file);
        //создаем BufferedReader с существующего tasks.filereader.FileBufferedReader для построчного считывания
        final BufferedReader br = new BufferedReader(fr);
        // считаем сначала первую строку
        String line;
        while ((line = br.readLine()) != null) {
            //обрабатываем считанную строку - пишем ее в консоль
            System.out.println(line);
        }
        br.close();
        fr.close();

    }
}
