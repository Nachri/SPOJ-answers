import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i;
        i=Integer.parseInt(r.readLine());

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int g = 0;
        while(g<i){
            String ans = String.valueOf(factorial(Integer.parseInt(r.readLine())));
            if(ans.length() == 1) out.write("0 " + ans + "\n");
            else out.write(ans.substring(ans.length() - 2,ans.length() - 1) + " " + ans.substring(ans.length() - 1) + "\n");
            g++;
        }
        out.flush();
    }

    public static int factorial(int n){
        if (n==0) return 1;
        if (n==1) return n;
        if (n>9) return 0;
        return n*factorial(n-1);

    }
}
