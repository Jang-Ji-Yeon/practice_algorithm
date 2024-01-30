import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");

        long result = 0;
        for(int i = 0;i<strs.length;i++){
            result += Long.parseLong(strs[i]);
        }
    
        System.out.println(result);

    }

}