package com.ug3.soal1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UGSoal1
{
    public static void main( String[] args )
    {
        // panggil fungsi absen disini
        Scanner nama = new Scanner(System.in);
        String namaKaryawan = nama.nextLine();
        UGSoal1 obj = new UGSoal1();
        obj.absen(namaKaryawan, "", "");
    }

    public void absen(String name, String date, String time) {
        // tulis kode anda disini
        System.out.print("berhasil absensi\n");
        System.out.print("Atas nama : "+ name + "\n") ;
        System.out.print("Pada tanggal : "+ date + "\n");
        System.out.print("Pukul : " + time);
    }


}