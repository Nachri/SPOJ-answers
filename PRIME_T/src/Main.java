import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i;
        i=Integer.parseInt(r.readLine());

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int g = 0;
        while(g<i){
            if(czyPierwsza(Integer.parseInt(r.readLine()))) out.write("TAK\n");
            else out.write("NIE\n");
            g++;
        }
        out.flush();

    }

    public static boolean czyPierwsza(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
        if(n%i ==0) return false;
        }
        return true;
    }

}
