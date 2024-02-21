package com.ug3.soal2;

import java.util.Scanner;
public class UG3Soal2
{
    public static void main( String[] args ) {
        // panggil fungsi fibonacci disini
        fibonacci("yehhehehhe","hehe");
    }

    public static void fibonacci(
            String firstWord,
            String secondWord

    ){
        int jlhfirst = firstWord.length();
        int jlhsecond = secondWord.length();
        System.out.print("Bilangan Fibonacci\n");
        for (int i=0; i<=10; i++){
            System.out.print(jlhfirst+" ");
            int hasil = jlhfirst+jlhsecond;
            jlhfirst = jlhsecond;
            jlhsecond = hasil;
        }
    }
}
