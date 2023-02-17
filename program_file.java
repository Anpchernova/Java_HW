import java.io.File;
import java.nio.file.Path;

public class program_file {
    public static void main(String args[])
    {
        File f = new File("C:\\Users\\kipik\\OneDrive\\Документы\\GB Python\\Java_HW\\file.txt");
        if (f.exists()){
            for (int i = 1; i < 101; i++){
            Files.writeString(f, "TEST");
            }
        } else{
            Files.createFile(f);
            for (int i = 1; i < 101; i++){
                Files.writeString(f, "TEST");
                }
        }
    }
}
