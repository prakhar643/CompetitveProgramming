import java.io.*;
import java.util.*;

public class BoyOrGirl {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        // Write your problem logic here
        String userName = fs.next();
        HashSet<Character> store = new HashSet<>();
        for(int i = 0;i<userName.length();i++){
            store.add(userName.charAt(i));
        }
        if(store.size()%2 == 0){
            out.println("CHAT WITH HER!");
        }
        else{
            out.println("IGNORE HIM!");
        }
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