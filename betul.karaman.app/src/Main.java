/*
* Owner: Betül Karaman
* Gönderilen pdf de belirtilen adımlar tek tek uygulandı, versiyon kontrolü Github ile sağlandı.
* Github repo link:
* https://github.com/betulkaramann/CoffeeApplication
* Daha basic bir şekilde de yazılabilirdi fakat mailde belirtildiği gibi OOP yapısı pratiği için interface yapısı oluşturuldu.
* Test aşaması için JUnit kullanıldı.
* 3 farklı test birimi yazıldı bu testlerden bazıları beklenen sonucu dönerken bazıları fail aldı. Test amacına uygun kullanıldı.
* Kullanıcıdan girdi alınırken herhangi bir hata catchleme yapmıyoruz, gelişmiş programlarda kullanıcı girdisi kaynaklı tüm hatalar handle edilebilmelidir
*
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Coffee[] typeOfCoffee = {
                new Coffee("Espresso", 20, new MakingEspresso()),
                new Coffee("Double Espresso", 29, new MakingDoubleEspresso()),
                new Coffee("Cappuccino", 27, new MakingCappuccino()),
                new Coffee("Caffe Latte", 27, new MakingCaffeLatte()),
                new Coffee("Mocha", 32, new MakingMocha()),
                new Coffee("Americano", 25, new MakingAmericano()),
                new Coffee("Hot Water", 5, new MakingHotWater())
        };
        boolean flag = false;
        System.out.println("Merhaba, kahve uygulamasına hoşgeldiniz...");
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz");
        for(int i = 0; i< typeOfCoffee.length; i++){ //menüyü kullanıcıya gösterme
            System.out.println((i+1) + ". " + typeOfCoffee[i].getName() + " (" + typeOfCoffee[i].getPrice() + " TL)");
        }
        Scanner scanner = new Scanner(System.in);
        while(!flag){ // geçersiz sipariş girilmesi durumunda kullanıcıdan sürekli girdi alabilme
            System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
            int choose = scanner.nextInt();
            if(choose >=1 && choose <= typeOfCoffee.length){
                Coffee orderCoffee = typeOfCoffee[choose -1];
                System.out.println("Teşekkürler, kahveniz hazırlanıyor...\n");
                System.out.println(orderCoffee.getName() + " seçtiniz. Bu içeceğimiz "+ orderCoffee.CoffeeDescription() + " içermektedir.\n" + "Afiyet Olsun.");
                flag = true;
                scanner.close(); //bilgi sızıntısına karşı
            }
            else {
                System.out.println("Geçersiz kahve seçimi yaptınız...Tekrar deneyiniz\n");
            }
        }
    }
}