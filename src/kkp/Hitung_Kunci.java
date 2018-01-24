/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kkp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
 import java.math.BigInteger;

public class Hitung_Kunci {
    
    private String directory;
    private String id;
    private BigInteger y,p,g,x,u;  
    
//============ Perhitungan KUNCI Y = g ^ x  mod p ==============================    
    public BigInteger getKunci(BigInteger p, BigInteger g, BigInteger x) {
        u = g.modPow(x, p);
        return u;
    }
//============= Menentukan Lokasi Penyimpanan ==================================
    public void setDir(String directorypublik) {
        this.directory = directorypublik; //set directory untuk save publik key
    }

    public void setId(String id) {
        this.id = id;
    }
//====================== Membuat Kunci Publik di Notepad =======================
    public void createpublic(BigInteger p, BigInteger g, BigInteger x) throws IOException {
        try {
            this.g = g;
            this.p = p;
            this.x = x;
            y = getKunci(p, g, x);
            String fileNamePublik = this.id + ".PublicKey";
            File filePublic = new File(this.directory + fileNamePublik);
            if (!filePublic.exists()) {
                filePublic.createNewFile();
            }
            FileWriter fwPublic = new FileWriter(filePublic.getAbsoluteFile());
            BufferedWriter bwPublic = new BufferedWriter(fwPublic);
            // Tulis Kunci
            bwPublic.write(id);
            bwPublic.write("\n");
            bwPublic.write(String.valueOf(y));
            bwPublic.write("\n");
            bwPublic.write(String.valueOf(this.g));
            bwPublic.write("\n");
            bwPublic.write(String.valueOf(this.p));
            bwPublic.write("\n");
            bwPublic.close();
            System.out.println("Berhasil membuat public key!, lihat di : " + this.directory + fileNamePublik);
        } catch (IOException e) {
        }
    }
//====================== Membuat Kunci Private di Notepad =======================
    public void createprivate(BigInteger p, BigInteger x) {
        try {
            this.p = p;
            this.x = x;
            String fileNamePrivate = this.id + ".PrivateKey";
            File filePrivate = new File(this.directory + fileNamePrivate);
            if (!filePrivate.exists()) {
                filePrivate.createNewFile();
            }
            FileWriter fwPrivate = new FileWriter(filePrivate.getAbsoluteFile());
            BufferedWriter bwPrivate = new BufferedWriter(fwPrivate);
            // menulis kunci private
            bwPrivate.write(id);
            bwPrivate.write("\n");
            bwPrivate.write(String.valueOf(this.x));
            bwPrivate.write("\n");
            bwPrivate.write(String.valueOf(this.p));
            bwPrivate.write("\n");
            bwPrivate.close();
            System.out.println("Berhasil Membuat Private Key!, lihat di : " + this.directory + fileNamePrivate);
        } catch (IOException e) {
        }
    } 
}
