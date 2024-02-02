import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInput {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // int i=0;
        // int j =0;

        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
             int num =Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        finally{
            System.out.println("Bye");
        }
    }
}
