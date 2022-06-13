package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            nums.add(new Random().nextInt(1,100));}
            System.out.print(nums);
        System.out.println();

        ArrayList <Integer> even = new ArrayList<>();

        for (Integer i: nums) {
        if (i % 2 == 0){
            even.add(i);
        }
        }
        System.out.println(even);

        ArrayList<Integer> odd = new ArrayList<>();
        for (Integer g: nums) {
            if (g % 2 == 1) {
                    odd.add(g);

                }
            }System.out.print(odd);
            }
        }






