package com.snaco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int keySize = 16;
        int[] mynums = new int[keySize];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < keySize; i++){
            mynums[i] = (int)(Math.random()*37);
        }
        int[] yournums = new int[keySize];
        int j =0;
        System.out.println("Give these numbers to them.");
        for (int i : mynums) {
            yournums[j] = 1;
            for (int k = 0; k < i; k++)
                yournums[j] = (yournums[j] * 17) % 37;
            System.out.print(yournums[j++] + ",");
        }

        System.out.println("\nEnter their numbers: ");
        String TN = s.next();
        String [] tn = TN.split( ",");
        int theirnums[] = new int[keySize];
        for (int i = 0; i < 16; i++){
            theirnums[i] = Integer.parseInt(tn[i]);
        }
        int key[] = new int[keySize];
        System.out.print("The key is: ");
        for (int i = 0; i < keySize; i++){
            key[i] = 1;
            for (int k = 0; k < mynums[i]; k++)
                key[i] = (key[i] * theirnums[i]) % 37;
            if (key[i]<26)
                System.out.print((char)(key[i]+65));
            else
                System.out.print((char)(key[i]+22));
        }
        System.out.println("\nUSE IV: AGB48KN422MNOQ:F");
    }
}
