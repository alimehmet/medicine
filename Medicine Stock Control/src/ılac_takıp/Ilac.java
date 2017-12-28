package ılac_takıp;

import java.util.ArrayList;

public class Ilac 
{
    private ArrayList ad = new ArrayList();
    private ArrayList barkod = new ArrayList();
    private ArrayList tane = new ArrayList();
    private ArrayList ucret = new ArrayList();
    private ArrayList tFiyat = new ArrayList();
    private ArrayList tur = new ArrayList();
    
    void Ilac_Ekle(String ilacAdi, int barkodNo, int adet, int fiyat, String turu) 
    {
        int toptanFiyat;
        toptanFiyat = adet * fiyat;
        ad.add(ilacAdi);
        barkod.add(barkodNo);
        tane.add(adet);
        ucret.add(fiyat);
        tFiyat.add(toptanFiyat);
        tur.add(turu);
    }

    void Ilaclari_Listele() 
    {
        System.out.println("------------");
        System.out.println("");
        for (int i = 0; i < ad.size(); i++) {
            System.out.println("İlaç ismi = " + ad.get(i));
            System.out.println("İlaç barkodu = " + barkod.get(i));
            System.out.println("İlaç adeti = " + tane.get(i));
            System.out.println("İlaç fiyatı = " + ucret.get(i) + " TL");
            System.out.println("İlacın toplu fiyatı = " + tFiyat.get(i) + " TL");
            System.out.println("İlaç türü = " + tur.get(i));
            System.out.println("");
            System.out.println("------------");
            System.out.println("");
        }
    }

    void Ilac_Listele(int gBarkod) 
    {
        int kontrol = 0;
        for (int i = 0; i < ad.size(); i++) 
        {
            if (gBarkod == (int) barkod.get(i)) 
            {
                System.out.println("İlaç ismi = " + ad.get(i));
                System.out.println("İlaç barkodu = " + barkod.get(i));
                System.out.println("İlaç adeti = " + tane.get(i));
                System.out.println("İlaç fiyatı = " + ucret.get(i) + " TL");
                System.out.println("İlacın toplu fiyatı = " + tFiyat.get(i) + " TL");
                System.out.println("İlaç türü = " + tur.get(i));
            } else 
            {
                kontrol++;
            }
            if (kontrol == ad.size()) 
            {
                System.out.println(gBarkod + " barkodlu ilaç bulunamadı!");
            }

        }
    }

    void Ilac_Guncelle(int gBarkod, String ilacAdi, int barkodNo, int adet, int fiyat, String turu) 
    {
        int toptanFiyat, kontrol = 0;
        for (int i = 0; i < ad.size(); i++) 
        {
            if (kontrol == ad.size()) 
            {
                System.out.println(gBarkod + "'lu ilaç bulunamadı!");
            }
            if (gBarkod == (int) barkod.get(i)) 
            {
                toptanFiyat = adet * fiyat;
                ad.set(i, ilacAdi);
                barkod.set(i, barkodNo);
                tane.set(i, adet);
                ucret.set(i, fiyat);
                tFiyat.set(i, toptanFiyat);
                tur.set(i, turu);
                System.out.println(gBarkod + " barkodlu ilaç güncellendi!");
                System.out.println("");
            } else 
            {
                kontrol++;
            }

        }
    }

    void Ilac_Sil(int gBarkod) 
    {
        int kontrol = 0;
        for (int i = 0; i < ad.size(); i++) 
        {
            if (gBarkod == (int) barkod.get(i)) 
            {
                ad.remove(i);
                barkod.remove(i);
                tane.remove(i);
                ucret.remove(i);
                tFiyat.remove(i);
                tur.remove(i);
                System.out.println(gBarkod + " barkodlu ilaç kaldırıldı!");
                System.out.println("");
                continue;
            } else 
            {
                kontrol++;
            }
            if (kontrol == ad.size()) 
            {
                System.out.println(gBarkod + " barkodlu ilaç bulunamadı!");
            }
        }
    }
}
