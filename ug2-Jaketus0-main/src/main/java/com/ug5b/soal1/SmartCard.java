package com.ug5b.soal1;

public class SmartCard {
    //TODO 1: Lengkapi atribut dan fungsi sesuai dengan class diagram SmartCard
    private String nama;
    private long saldo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public void topUp(Voucher vch) {

        if ("VC".equals(vch.getKode())) {
            System.out.println("Kode Voucher: "+ vch.getKode() +" || Top up gagal! Kode voucher tidak valid.");
        } else {
//            saldo = saldo + vch.getNominal();
            saldo = vch.getNominal();
            System.out.println("Kode Voucher: "+ vch.getKode() +" || Top up sukses!");
        }
    }
}
