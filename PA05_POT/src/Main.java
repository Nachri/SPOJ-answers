import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i;
        i=Integer.parseInt(r.readLine());

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strings;

        int g = 0;
        while(g<i){
            strings = r.readLine().split(" ");
            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);
            out.write(ldpowforce(a,b) + "\n");
            g++;
        }
        out.flush();
    }

    public static int ldpowforce(int a,int b){
        if (b==0) return 1;
        switch (a%10) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                switch(b%4) {
                    case 1:
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 0:
                        return 6;
                }
            case 3:
                switch(b%4) {
                    case 1:
                        return 3;
                    case 2:
                        return 9;
                    case 3:
                        return 7;
                    case 0:
                        return 1;
                }
            case 4:
                switch(b%2) {
                    case 1:
                        return 4;
                    case 0:
                        return 6;
                }
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                switch(b%4) {
                    case 1:
                        return 7;
                    case 2:
                        return 9;
                    case 3:
                        return 3;
                    case 0:
                        return 1;
                }
            case 8:
                switch(b%4) {
                    case 1:
                        return 8;
                    case 2:
                        return 4;
                    case 3:
                        return 2;
                    case 0:
                        return 6;
                }
            case 9:
                switch(b%2) {
                    case 1:
                        return 9;
                    case 0:
                        return 1;
                }
        }
        return 1;
    }
}