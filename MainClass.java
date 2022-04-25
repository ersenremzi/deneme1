//SORU2

package Meyveler;

import java.util.ArrayList;
public class MainClass {

        public static void main(String[] args) {

            Meyve m1 = new Meyve(1 , " Banana " , " Yellow  " , 5);
            Meyve m2 = new Meyve(2 , " Apple " ,  " Red "  , 4);
            Meyve m3 = new Meyve(3 , " Lemon " , " Yellow " , 7);
            Meyve m4 = new Meyve(4 , " Strawberry " , " Red " , 2);
            Meyve m5 = new Meyve(5 , " Watermelon " , "Green" , 8);
            Meyve m6 = new Meyve(6 , " Lime " , "Green" , 10);


            ArrayList<Meyve> meyveler =new ArrayList<Meyve>();
            meyveler.add(m1);
            meyveler.add(m2);
            meyveler.add(m3);
            meyveler.add(m4);
            meyveler.add(m5);
            meyveler.add(m6);

            int sayi=0;

            String renk = "Green" ; //equals ile filtreleme yapmak için string bir değişken oluşturduk.
            for (int i=0;i<meyveler.size();i++){ //dizi boyutu kadar dönecek bir döngü oluşturduk.

                if(meyveler.get(i).getFruitColor().equals(renk)){ //istenilen rule'a göre bir if komutu oluşturup;

                     sayi=sayi+meyveler.get(i).getQuantity(); //daha sonrasında her döngü sonunda int değişkeni kurala göre arttırıcak bloğu yazıyoruz.
                }






            }
            System.out.println(sayi);
}
    }

