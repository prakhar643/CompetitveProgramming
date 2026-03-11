import java.io.*;
import java.util.*;

public class BeautifulMatrix {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        // Write your problem logic here
        int r = 0;
        int c = 0;
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                int  x = fs.nextInt();
                if(x==1){
                    r = i;
                    c = j;
                }
            }
        }
        int steps = Math.abs(r-2) + Math.abs(c - 2);
        out.println(steps);
    }



    // Fast Input Class
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}