/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_anf;

/**
 *
 * @author ANF
 */
import java.util.ArrayList;

public class KelasMahasiswa {
    private String namaKelas;
    private ArrayList<Mahasiswa> listMahasiswa;

    public KelasMahasiswa(String namaKelas) {
        this.namaKelas = namaKelas;
        this.listMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        listMahasiswa.add(mhs);
    }

    public String tampilkanSemuaBiodata() {
    StringBuilder sb = new StringBuilder();
    sb.append("Daftar Mahasiswa di Kelas: ").append(namaKelas).append("\n\n");
    for (Mahasiswa m : listMahasiswa) {
        sb.append(m.toString()).append("\n\n");
    }
    return sb.toString();
}



    public ArrayList<Mahasiswa> getListMahasiswa() {
        return listMahasiswa;
    }
}
