import java.io.*;
import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws Exception {

        long[] comb = new long[]{1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136, 5768, 10609, 19513, 35890, 66012, 121415, 223317, 410744, 755476, 1389537, 2555757};

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i;
        i=Integer.parseInt(r.readLine());
        BigInteger v;

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int g = 0;
        while(g<i){
            v = BigInteger.ONE;
            for(String strings: r.readLine().split(" ")){
                v = v.multiply(BigInteger.valueOf(comb[Integer.parseInt(strings)]));
            }
            out.write((v.mod(BigInteger.valueOf(1000000007L)) + "\n"));
            g++;
        }
        out.flush();
    }

private static long comb(long a){

        if (a== 0){
            return 0;
        }
        else if (a== 1){
            return 1;
        }
        else if(a == 2){
            return 2;
        }
        else if(a == 3){
            return 4;
        }
        else {
            return comb(a - 1) + comb(a - 2) + comb(a - 3);
        }

}


}
