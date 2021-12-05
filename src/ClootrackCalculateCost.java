import java.util.*;
import java.io.*;

public class ClootrackCalculateCost {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        int T = Integer.parseInt(br.readLine().trim());
	        for(int t_i=0; t_i<T; t_i++)
	        {
	            int N = Integer.parseInt(br.readLine().trim());
	            int k = Integer.parseInt(br.readLine().trim());
	            int X = Integer.parseInt(br.readLine().trim());
	            String[] arr_price = br.readLine().split(" ");
	            int[] price = new int[N];
	            for(int i_price=0; i_price<arr_price.length; i_price++)
	            {
	            	price[i_price] = Integer.parseInt(arr_price[i_price]);
	            }

	            long out_ = getCost(X, k, price, N);
	            System.out.println(out_);
	         }

	         wr.close();
	         br.close();
	    }
	    static long getCost(int X, int k, int[] price, int N){
	        // Write your code here
	        HashSet<Integer>d = new HashSet<Integer>();
	        long result = 0;
	        for(int i=0;i<price.length;i++)
	        {
	            d.add(price[i]);
	        }
	        int l = d.size();
	        int diff=0;
	        if(k<l)
	        {
	            diff = l-k;
	            result = (long)X * diff;
	        }
	        else 
	        result=0;
	        return result;
	   }
}
