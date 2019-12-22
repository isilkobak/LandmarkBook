package com.isilkobak.landmarkbook;

import android.graphics.Bitmap;

public class Singleton { //Bu yapı tek bir obje üzerinde çalışmamıza yarar. Bu sınıf yalnızca bir objeye sahip olacak.
    Bitmap choosenImage;
    private static Singleton singleton; //static metotlar yalnızca static değişkenleri görür.

    private Singleton() { //class dışında contructor oluşturmayı private yaparak engelledik.

    }

    public Bitmap getChoosenImage() {
        return choosenImage;
    }

    public void setChoosenImage(Bitmap choosenImage) {
        this.choosenImage = choosenImage;
    }

    public static Singleton getInstance() { //bu yapı sayesinde yalnızca bir kez obje oluşturabileceğiz yani yalnızca oluşturulmamışsa.
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
//Aklıma bu döngüye girmez mi diye gelmişti. Girmez çünkü getInstance metodu objede çaprılmadığı müddetçe kendi içinde o obje yeni bir obje oluşturmaz.
// Oluşturulunca ne olur ? İç içe aynı objeler olur aslında ama efficient olmaz tabii.. Hangisini nasıl takip edeceksin ? Belki index ?
//Her taraftan oluşturulabilir bir obje arrayi tanımlayabilmiş oluruz aslında. Static objelere sahip class..