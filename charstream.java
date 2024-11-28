import java.io.*;
public class charstream {
    public static void main(String[] args) {
        try{
            FileReader in = new FileReader("Input.txt");
            FileWriter out = new FileWriter("Output.txt");
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
