/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListKullanımı;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Sungur Fırat
 */
public class ArrayListKullanımı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer>listem=new ArrayList<Integer>();
       boolean bosmu;
       bosmu=listem.isEmpty();
       System.out.println("listenin bosluk durumu:"+bosmu);
       int girilenNot=0;
       do{
           girilenNot=Integer.valueOf(JOptionPane.showInputDialog("not giriniz"));
           if(girilenNot!=0)
           {
                  listem.add(girilenNot);    
           }
           
       }while(girilenNot!=0);
       JOptionPane.showMessageDialog(null,"Listem :"+listem);
       Collections.sort(listem);
        JOptionPane.showMessageDialog(null,"Listem :"+listem);
       int elemansayisi=listem.size();
       int toplam=0;
       for(int i=0;i<elemansayisi;i++)
       {
           toplam=toplam+listem.get(i);
       }
       int ortalma=toplam/elemansayisi;
        JOptionPane.showMessageDialog(null,"ortalama :"+ortalma);
        int silinecekRakam=Integer.valueOf(JOptionPane.showInputDialog("Silinecek sayı gir"));
        Object o=silinecekRakam;
        if(listem.contains(o))
        {
              listem.remove(o);
            JOptionPane.showMessageDialog(null,"Listem :"+listem);
        }
        
        
      
       
    }
}
