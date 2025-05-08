/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_anf;

/**
 *
 * @author ANF
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String fakultas;
    private int tahunMasuk;

    public Mahasiswa(String nama, String nim, String prodi, String fakultas, int tahunMasuk) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.tahunMasuk = tahunMasuk;
    }

    public void tampilkanBiodata() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("---------------------------");
    }

    @Override
public String toString() {
    return "Nama: " + nama + "\nNIM: " + nim + "\nProdi: " + prodi +
           "\nFakultas: " + fakultas + "\nTahun Masuk: " + tahunMasuk;
}
}
