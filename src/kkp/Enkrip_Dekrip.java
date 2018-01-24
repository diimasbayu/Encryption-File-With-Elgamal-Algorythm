/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkp;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Enkrip_Dekrip {
    
    BigInteger y,p,g,x;
    String id, fileNameEncrypt,fileNameDecrypt , strChiper, hasilEnkrip,chiper;
    ArrayList rn;
    private static ByteArrayOutputStream byteOut;
    BufferedReader fileReader;
    private BigInteger gamma;
    private BigInteger delta;

    
    
    public void enkrip(File file, String save, String namaFile) throws IOException{
                System.out.println("\n=====ENKRIPSI=====");
        
                byteOut = new ByteArrayOutputStream();
                
                String ekstensi = namaFile.substring(namaFile.length()-4, namaFile.length());
                String namaFileAwal = file.getName().substring(0, file.getName().length()-4);
        
                Path pat = Paths.get(file.getPath());
                byte[] data = Files.readAllBytes(pat);
                
                String[] data1 = new String[data.length];
                System.out.print("Data : ");
                    for (int i = 0; i < data.length; i++) {
                        data1[i] = String.valueOf(data[i] & 0xff);
                        System.out.print(data1[i]+", ");
                     }     
                    System.out.println("");

                for(int i=0; i<data1.length; i++){
                rn = this.getBilanganAcak(data1[i], p);
                } 
                System.out.println("nilai Random "+rn);
               chiper = "";
               hasilEnkrip = "";//tanda hasil dari Enkrip
               int b = 1;
                
                for (int i = 0; i < data1.length; i++) {
                    BigInteger m = new BigInteger(data1[i]);
                    BigInteger k = new BigInteger(rn.get(i).toString());                            
                    gamma = g.modPow(k, p);
                    delta = y.pow(k.intValue()).multiply(m).mod(p);
                    chiper = gamma.toString() + " " + delta.toString() +" " ;
                    hasilEnkrip += chiper;               
                    
                    System.out.println("Melakukan enkripsi pada file "+file.getName() + " Loop = "+ b);    
                    b++;
                }
                hasilEnkrip += ekstensi;
                String filename = file.getName();
                String fileoutput = save;
                int dot = filename.lastIndexOf(".");
                int sep = filename.replace("\\", "/").lastIndexOf("/");
                
                
                        
                this.setFileEncrypt(fileoutput.replace("\\", "/"), filename.substring(0, dot), filename.substring(dot + 1)  );                      
              
                this.saveHasil(hasilEnkrip.getBytes(), this.fileNameEncrypt);

//                Path path1 = Paths.get(this.fileNameEncrypt);
//                Files.write(path1, hasilEnkrip.getBytes());			
    }
    
    public void dekrip(File file, String save) throws IOException{
        System.out.println("\n=====DEKRIPSI=====");

           fileReader = new BufferedReader(new FileReader(file));
           long panjang_file = file.length();
            
         

            String current ="";
            strChiper ="";
            
                for(int i=0; i<panjang_file; i++){
                while((current = fileReader.readLine()) != null){
                strChiper += current;
                }
            }
                String ekstensi = strChiper.substring(strChiper.length()-4, strChiper.length());
                strChiper = strChiper.substring(0, strChiper.length()-4);
               // if(strChiper.startsWith("en")){
                
               // String Chiper = strChiper.substring(strChiper.lastIndexOf("en")+2);
                PecahChiper pct = new PecahChiper();
                pct.setChiper(strChiper);

                ArrayList ngama = pct.getGamma();
                ArrayList ndelta = pct.getDelta();
                
//                System.out.println("Gamma\tDelta");
//                for (int i = 0; i < ngama.size(); i++) {
//                    System.out.println(ngama.get(i) + "\t" + ndelta.get(i));
//                }
                
            char[] chr = new char[ngama.size()];   
            BigInteger[] data2 = new BigInteger[chr.length];
                int j = 1;
            for (int i = 0; i < ngama.size(); i++) {
                BigInteger a = new BigInteger(ngama.get(i).toString());
                BigInteger b = new BigInteger(ndelta.get(i).toString());
                    data2[i] = b.multiply(a.pow(p.intValue() - 1 - x.intValue())).mod(p);
                        
                
                System.out.println("Melakukan Dekripsi pada file " + file + " Loop = "+ j);   
                j++;
            }
            byte[] data3 = new byte[data2.length];
                for (int i = 0; i < data2.length; i++) {
                data3[i] = (data2[i].byteValue());
                }
                        String filename = file.getName();
                        String fileout = save;
                        int dot1 = filename.lastIndexOf(".");
                        int sep1 = filename.replace("\\", "/").lastIndexOf("/");
                        
                       
                        this.setFileDecrypt(fileout.replace("\\", "/"), filename.substring(sep1 + 1, dot1),  ekstensi );
                        this.saveHasil(data3, this.fileNameDecrypt);
                        
                        System.out.println("FINISH");
                
            
    }
    
    public void setPublicKey(String kunciPublic) {
        BufferedReader br = null;
        try {
            int batas = 0;
            String current;
            br = new BufferedReader(new FileReader(kunciPublic));
            while ((current = br.readLine()) != null) {
                if (batas == 1) {
                    this.y = new BigInteger(current);
                } else if (batas == 2) {
                    this.g = new BigInteger(current);
                } else if (batas == 3){
                     this.p = new BigInteger(current);
                } else {
                    this.id = current;
                }
                batas++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("nilai y : " + this.y);
        System.out.println("nilai g : " + this.g);
        System.out.println("nilai p : " + this.p);
        System.out.println("id : " + this.id);
    }
    
    public void setPrivateKey(String filePrivate) {
        BufferedReader br = null;
        try {
            int batas = 0;
            String current;
            br = new BufferedReader(new FileReader(filePrivate));
            while ((current = br.readLine()) != null) {
                if (batas == 1) {
                    this.x = new BigInteger(current);
                } else if (batas == 2) {
                    this.p = new BigInteger(current); 
                } else {
                    this.id = current;
                }
                batas++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("nilai x : " + this.x);
        System.out.println("nilai p : " + this.p);
        System.out.println("id : " + id);
        }
    
    //Hitung Random Number
        private ArrayList listNumber = new ArrayList();
        public ArrayList getBilanganAcak(String pesan, BigInteger p) {

            int pp = p.intValue() - 2;

                int rand = (int) (pp * Math.random());

                listNumber.add(rand);

            return listNumber;
            }
        
        public void setFileEncrypt(String directory, String filename, String extens) {
            this.fileNameEncrypt = directory + "/" + "enc." + filename+ "." + extens;
            System.out.println("Lokasi Simpan => " +fileNameEncrypt);
        }
  
        public void setFileDecrypt(String directory, String filename, String extens) {
            String namafile = filename.replace("enc.", "");
           this.fileNameDecrypt = directory + "/" + "dec." + namafile + "." + extens;
            System.out.println("Lokasi Simpan => "+fileNameDecrypt);
        } 
        
        private void saveHasil(byte[] dataDecrypt, String file) throws IOException {
        Path path = Paths.get(file);
        Files.write(path, dataDecrypt);
        }
        
        //Method untuk menulis byte kedalam output array 
	private static void tulisBytes(byte[] bytes)
	{
		int size= bytes.length;

		for(int i=0; i< size; i++)
		{
			byteOut.write(bytes[i]);
		}
	}      
}
