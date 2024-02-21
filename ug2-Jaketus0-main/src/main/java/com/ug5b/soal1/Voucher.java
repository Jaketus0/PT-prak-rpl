package com.ug5b.soal1;

public class Voucher {

    //TODO 2: Lengkapi atribut dan fungsi sesuai dengan class diagram Voucher
    private String kode;
    private long nominal;

    public long getNominal() {
        return nominal;
    }

    public void setNominal(long nominal) {
        this.nominal = nominal;
    }

    public String getKode() {
        return kode;
    }

    public void buatVoucher() {
        if (nominal <= 0) {
            this.kode = "VC";
        }else{
            this.kode = "VC"+nominal;
        }
    }
}
