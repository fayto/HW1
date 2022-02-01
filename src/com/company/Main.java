package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int prev = scan.nextInt();
        int curr = 0;
        for (int i = 1; i < n; i++) {
            curr = scan.nextInt();
            if(curr > prev) {
                count ++;
            }
            prev = curr;
        }
        System.out.println(count);
    }
}
