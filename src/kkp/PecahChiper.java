/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kkp;
import java.util.ArrayList;

public class PecahChiper {
     
 
    private String pecah[];
    private ArrayList Gamma = new ArrayList();
    private ArrayList Delta = new ArrayList();
 
    public String[] setChiper(String chiper) {
        pecah = chiper.split(" ");
        
        for (int i = 0; i < pecah.length; i++) {
 
            if (i % 2 == 0) {
                Gamma.add(pecah[i]);
            } else {
                Delta.add(pecah[i]);
            }
            
        }
      return pecah;
    }
 
    public ArrayList getGamma() {
        return Gamma;
    }
 
    public ArrayList getDelta() {
        return Delta;
    }
}

