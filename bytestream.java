import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class bytestream {
    public static void main(String[] args) {
        try{
            FileInputStream in = new FileInputStream("Input.txt");
            FileOutputStream out = new FileOutputStream("Output.txt");
            int c;
            while ((c= in.read())!= -1) {
                out.write(c);
            }
        }
        catch(IOException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        in.close();
        out.close();
    } 
}
