package com.example.java;

/**
 * Created by shashi on 28-12-2016.
 */
public class MinCoins {

    public int mincoins(int[] v, int s)
    {
        int n = v.length;
        int[] min = new int[s + 1];

        for(int k = 0; k <= s; k++)
            min[k] = 999;

        min[0] = 0;

        for(int i = 1; i <= s; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                if(v[j] <= i && min[i - v[j]] + 1 < min[i])
                {
                    min[i] = min[i - v[j]] + 1;
                }
            }
        }

        return min[s];

    }

    public static void main(String[] args)
    {
        MinCoins m = new MinCoins();
        int[] coins = {1, 3, 5};
        int num = 0;
        num = m.mincoins(coins, 11);
        System.out.println("Number of coins for sum 11 is: " + num);
    }
}





