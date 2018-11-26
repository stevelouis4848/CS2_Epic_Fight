

import java.util.*;

public class sum_count
{
    public static int[][] memo;
    public static int MOD = 1000000007;
    public static int IMPOSSIBLE = -1;
    public static int a, b, c;
    public static int target, k;
    public static void main(String[] Args)
    {
        a = 1;
        b = 2;
        c = 100;
        target = 1000;
        k = 100;
        
        int[] cur = new int[target + 1];
        int[] next = new int[target + 1];
        cur[0] = 1;
        for (int i = 0; i < k; i++)
        {
            Arrays.fill(next, 0);
            for (int j = 0; j <= target; j++)
            {
                if (j + a <= target){
                    next[j + a] += cur[j];
                    next[j + a] %= MOD;
                }
                if (j + b <= target){
                    next[j + b] += cur[j];
                    next[j + b] %= MOD;
                }
                if (j + c <= target){
                    next[j + c] += cur[j];
                    next[j + c] %= MOD;
                }
            }
            int[] tmp = cur;
            cur = next;
            next = tmp;
        }
        
        System.out.println(cur[target]);
        
        
        memo = new int[target][k];
        for(int[] a : memo)
            Arrays.fill(a, IMPOSSIBLE);
        System.out.println(rec(0, 0));
        
    }
    
    public static int rec(int num_adds, int cur_sum)
    {
        if (num_adds == k && cur_sum == target)
            return 1;
        if (num_adds >= k)
            return 0;
        if (cur_sum >= target)
            return 0;
        if (memo[cur_sum][num_adds] != IMPOSSIBLE)
            return memo[cur_sum][num_adds];
        
        int ans = rec(num_adds + 1, cur_sum + a);
        ans += rec(num_adds + 1, cur_sum + b);
        ans %= MOD;
        ans += rec(num_adds + 1, cur_sum + c);
        ans %= MOD;
        
        memo[cur_sum][num_adds] = ans;
        return ans;
    }
}
