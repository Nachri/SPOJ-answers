import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i;
        i = Integer.parseInt(r.readLine());

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strings;

        int g = 0;
        while (g < i) {
            strings = r.readLine().split(" ");
            int x = Integer.parseInt(strings[0]);
            int y = Integer.parseInt(strings[1]);
            out.write(nwd(x,y) + "\n");
            g++;
        }
        out.flush();
    }


    public static int nwd(int x, int y) {
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return x;
    }
}