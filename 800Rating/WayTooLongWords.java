import java.io.*;
import java.util.*;

public class WayTooLongWords {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        int n = fs.nextInt();
        for(int i = 0;i<n;i++){
            String word = fs.next();
            if(word.length()<=10){
                out.print(word);
            }else{
                out.print("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
            }
        }
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