
package ılac_takıp;

import java.util.ArrayList;

public class Test 
{
    public static void main(String[] args) 
    {
     Ilac ilac = new Ilac();
     ilac.Ilac_Ekle("stilex", 1321523, 21, 9, "Hap");
     ilac.Ilac_Ekle("aspirin", 8978698, 8, 8, "Hap");
     ilac.Ilac_Ekle("parol", 5675634, 56, 7, "Hap");
     ilac.Ilac_Ekle("calpol", 5675634, 56, 7, "Şurup");
     ilac.Ilaclari_Listele();
    }
}
