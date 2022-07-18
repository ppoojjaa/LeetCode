package com.company;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp =0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            max = Math.max(max,temp);
        }
        return max;
    }
}

