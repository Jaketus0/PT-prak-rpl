package com.ug5b.soal2;

public class Buku {

    //TODO 1: Lengkapi class ini sesuai dengan class diagram Buku
    private String kode;
    private static int nextNum = 245100;
    private String judul;
    private String penulis;
    private long harga;
    private int stok;

    public Buku(String argJudul, String argPenulis, long argHarga, int argStok ){
        if (argStok <= 0) {
            this.stok = 0;
        }else {
            this.stok = argStok;
        }
        if (argHarga <= 0) {
            this.harga = 0;
        }else{
            this.harga = argHarga;
        }
        judul = argJudul;
        penulis = argPenulis;
        nextNum += 1;
        kode = "NV"+nextNum;
    }
    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }


    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }



}
