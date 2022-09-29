package ua.com.prologistic;
 
import java.io.File;
 
public class GetFileExtension {
 
    public static void main(String[] args) {
        File file = new File("/Users/prologistic/java.txt");
        System.out.println("Расширение файла: " + getFileExtension(file));
        
        //проверяем метод на файле без расширения
        file = new File("/Users/prologistic/temp");
        System.out.println("Расширение файла: " + getFileExtension(file));
        
        //проверяем метод на файле с точкой в имени
        file = new File("/Users/prologistic/java.util.txt");
        System.out.println("Расширение файла: " + getFileExtension(file));
        
        //проверяем метод на файле без расширения
        file = new File("/Users/prologistic/.htaccess");
        System.out.println("Расширение файла: " + getFileExtension(file));
    }
 
    //метод определения расширения файла
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        // если в имени файла есть точка и она не является первым символом в названии файла
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
        return fileName.substring(fileName.lastIndexOf(".")+1);
        // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
    }
}