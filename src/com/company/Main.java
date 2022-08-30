package com.company;

import java.util.Scanner;
import java.util.*;
public class Main {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        ForEachExample f = new ForEachExample();
        f.ForEachExample(n);
    }
}
class ForEachExample {
    public void ForEachExample(int n) {
        int i;
        ArrayList<Integer> List = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        for (i = 0; i < n; i++) {
            List.add(in.nextInt());
        }
        List.forEach(System.out::println);
    }
}
