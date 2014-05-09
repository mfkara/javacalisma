/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sekilislemleri;

import sekiller.Daire;
import sekiller.Dortgen;
import sekiller.Ucgen;
import sekiller.sekil;

/**
 *
 * @author Sungur Fırat
 */
public class SekilUretici {
    public static sekil sekilUret(String sekilIsmi)
    {   
        sekil sekil=null;
        if(sekilIsmi.equalsIgnoreCase("ucgen"))
        {
            sekil=new Ucgen();
        }
      else if(sekilIsmi.equalsIgnoreCase("daire"))
        {
            sekil=new Daire();
        }
       else if(sekilIsmi.equalsIgnoreCase("dortgen"))
        {
            sekil=new Dortgen();
        }
        return sekil;
    }
}
