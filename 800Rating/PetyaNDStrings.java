import java.io.*;
import java.util.*;

public class PetyaNDStrings {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        // Write your problem logic here
        String first = fs.nextLine().toLowerCase();
        String second = fs.nextLine().toLowerCase();

        for(int i = 0;i<first.length();i++){
            if(first.charAt(i)<second.charAt(i)){
                out.println(-1);
                return;
            }
            else if(first.charAt(i) > second.charAt(i)){
                out.println(1);
                return;
            }
        }
        out.println(0);
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