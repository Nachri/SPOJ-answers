import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i;
        i = Integer.parseInt(r.readLine());

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] chars;
        StringBuilder str;

        int g = 0;
        while (g < i) {
            chars = r.readLine().toCharArray();
            int j = 0;
            str = new StringBuilder();
            for (int h = 0; h < chars.length; h++) {
                str.append(chars[h]);
                if (chars[h + 1] == chars[h]) j++;
                else if (j != 0) str.append(j);
            }
            out.write(str.toString() + "\n");
            g++;
        }
        out.flush();
    }
}
