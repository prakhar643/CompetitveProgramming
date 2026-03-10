
import java.io.*;
import java.util.*;

public class Team {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        int n = fs.nextInt();
        int count = 0;
        for(int i = 0;i<n;i++){
            int a = fs.nextInt();
            int b = fs.nextInt();
            int c = fs.nextInt();
            if(a+b+c >=2){
                count++;
            }
        }
        out.println(count);

    }

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
    }
}