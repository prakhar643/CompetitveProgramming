import java.io.*;
import java.util.*;

public class BingpCandies {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        // Write your problem logic here
          HashMap<Integer,Integer> map = new HashMap<>();
        int n = fs.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;i<n;j++){
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x,0) + 1);
            }
        }
        int max = 0;
         for(int freq : map.values()){
        max = Math.max(max, freq);
    }

    if(max > n){
        System.out.println("NO");
    }else{
        System.out.println("YES");
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