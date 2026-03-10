import java.io.*;
import java.util.*;

public class NextRoundJava {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        int n = fs.nextInt();
        int k = fs.nextInt();

        int [] arr = new int[n];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fs.nextInt();
        }
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] >=arr[k-1] && arr[idx] > 0){
                result++;
            }
        }
        out.println(result);
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