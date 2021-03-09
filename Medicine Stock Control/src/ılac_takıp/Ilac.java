package ılac_takıp;

import java.util.ArrayList;

public class Ilac 
{
    private ArrayList ad = new ArrayList();
    private ArrayList barkod = new ArrayList();
    private ArrayList tane = new ArrayList();
    private ArrayList ucret = new ArrayList();
    private ArrayList toplamFiyat = new ArrayList();
    private ArrayList tur = new ArrayList();
    
    void Ilac_Ekle(String ilacAdi, int barkodNo, int adet, int fiyat, String turu) 
    {
        int toptanFiyat;
        toptanFiyat = adet * fiyat;
        ad.add(ilacAdi);
        barkod.add(barkodNo);
        tane.add(adet);
        ucret.add(fiyat);
        toplamFiyat.add(toptanFiyat);
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
            System.out.println("İlacın toplu fiyatı = " + toplamFiyat.get(i) + " TL");
            System.out.println("İlaç türü = " + tur.get(i));
            System.out.println("");
            System.out.println("------------");
            System.out.println("");
        }
    }

    void Ilac_Listele(int gelenBarkod) 
    {
        int kontrol = 0;
        for (int i = 0; i < ad.size(); i++) 
        {
            if (gelenBarkod == (int) barkod.get(i)) 
            {
                System.out.println("İlaç ismi = " + ad.get(i));
                System.out.println("İlaç barkodu = " + barkod.get(i));
                System.out.println("İlaç adeti = " + tane.get(i));
                System.out.println("İlaç fiyatı = " + ucret.get(i) + " TL");
                System.out.println("İlacın toplu fiyatı = " + toplamFiyat.get(i) + " TL");
                System.out.println("İlaç türü = " + tur.get(i));
            } else 
            {
                kontrol++;
            }
            if (kontrol == ad.size()) 
            {
                System.out.println(gelenBarkod + " barkodlu ilaç bulunamadı!");
            }

        }
    }

    void Ilac_Guncelle(int gelenBarkod, String ilacAdi, int barkodNo, int adet, int fiyat, String turu) 
    {
        int toptanFiyat, kontrol = 0;
        for (int i = 0; i < ad.size(); i++) 
        {
            if (kontrol == ad.size()) 
            {
                System.out.println(gelenBarkod + "'lu ilaç bulunamadı!");
            }
            if (gelenBarkod == (int) barkod.get(i)) 
            {
                toptanFiyat = adet * fiyat;
                ad.set(i, ilacAdi);
                barkod.set(i, barkodNo);
                tane.set(i, adet);
                ucret.set(i, fiyat);
                toplamFiyat.set(i, toptanFiyat);
                tur.set(i, turu);
                System.out.println(gelenBarkod + " barkodlu ilaç güncellendi!");
                System.out.println("");
            } else 
            {
                kontrol++;
            }

        }
    }

    void Ilac_Sil(int gelenBarkod) 
    {
        int kontrol = 0;
        for (int i = 0; i < ad.size(); i++) 
        {
            if (gelenBarkod == (int) barkod.get(i)) 
            {
                ad.remove(i);
                barkod.remove(i);
                tane.remove(i);
                ucret.remove(i);
                toplamFiyat.remove(i);
                tur.remove(i);
                System.out.println(gelenBarkod + " barkodlu ilaç kaldırıldı!");
                System.out.println("");
                continue;
            } else 
            {
                kontrol++;
            }
            if (kontrol == ad.size()) 
            {
                System.out.println(gelenBarkod + " barkodlu ilaç bulunamadı!");
            }
        }
    }
}
