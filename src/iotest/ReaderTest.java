package iotest;

import java.io.*;

public class ReaderTest {
    public static void main(String[] args){
        File file = new File("a.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("文件已存在");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line = null;
                while ((line=bufferedReader.readLine())!= null){
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
