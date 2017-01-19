package com.example.java;

/**
 * Created by shashi on 28-12-2016.
 */
public class MinSteps {

    public int getMin(int x, int y)
    {
        if(x <= y)
            return x;
        else
            return y;
    }

    public int minSteps(int n)
    {
        int[] dp = new int[n + 1];
        int i = 0;
        dp[0] = 0;
        dp[1] = 0;

        for(i = 2; i <= n; i++)
        {
            dp[i] = 1 + dp[i - 1];
            if(i % 2 == 0)
                dp[i] = getMin(dp[i], 1 + dp[i / 2]);
            if(i % 3 == 0)
                dp[i] = getMin(dp[i], 1 + dp[i / 3]);
        }

        return dp[n];
    }

    public static void main(String[] args)
    {
        MinSteps s = new MinSteps();
        int steps = s.minSteps(15);
        System.out.println("Min Steps required are: " + steps);

    }
}
