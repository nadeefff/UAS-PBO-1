/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataMahasiswaUAS;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "mahasiswa")
@NamedQueries({
    @NamedQuery(name = "Mahasiswa.findAll", query = "SELECT m FROM Mahasiswa m"),
    @NamedQuery(name = "Mahasiswa.findByNim", query = "SELECT m FROM Mahasiswa m WHERE m.nim = :nim"),
    @NamedQuery(name = "Mahasiswa.findByNama", query = "SELECT m FROM Mahasiswa m WHERE m.nama = :nama"),
    @NamedQuery(name = "Mahasiswa.findByAlamat", query = "SELECT m FROM Mahasiswa m WHERE m.alamat = :alamat"),
    @NamedQuery(name = "Mahasiswa.findByAsalSma", query = "SELECT m FROM Mahasiswa m WHERE m.asalSma = :asalSma"),
    @NamedQuery(name = "Mahasiswa.findByNamaOrangTua", query = "SELECT m FROM Mahasiswa m WHERE m.namaOrangTua = :namaOrangTua")
})
public class Mahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;

    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "asal_sma")
    private String asalSma;

    @Column(name = "nama_orang_tua")
    private String namaOrangTua;  // Field ini sudah ada

    // Getter dan Setter untuk namaOrtu
    public String getNamaOrtu() {
        return namaOrangTua;
    }

    public void setNamaOrtu(String namaOrtu) {
        this.namaOrangTua = namaOrtu;
    }

    // Getter dan Setter lainnya
    public String getNIM() {
        return nim;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsalSma() {
        return asalSma;
    }

    public void setAsalSma(String asalSma) {
        this.asalSma = asalSma;
    }

    @Override
    public String toString() {
        return "DataMahasiswaUAS.Mahasiswa[ nim=" + nim + " ]";
    }

    void setAsal(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
