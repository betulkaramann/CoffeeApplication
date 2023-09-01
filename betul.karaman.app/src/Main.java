import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Coffee[] typeOfCoffee = {
                new Coffee("Espresso", 20),
                new Coffee("Double Espresso", 29),
                new Coffee("Cappuccino", 27),
                new Coffee("Caffe Latte", 27),
                new Coffee("Mocha", 32),
                new Coffee("Americano", 25),
                new Coffee("Hot Water", 5)
        };
        boolean flag = false;
        System.out.println("Merhaba, kahve uygulamasına hoşgeldiniz...");
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz");
        for(int i = 0; i< typeOfCoffee.length; i++){
            System.out.println((i+1) + ". " + typeOfCoffee[i].getName() + " (" + typeOfCoffee[i].getPrice() + " TL)");
        }
        Scanner scanner = new Scanner(System.in);
        while(!flag){
            System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
            int choose = scanner.nextInt();
            if(choose >=1 && choose <= typeOfCoffee.length){
                Coffee orderCoffee = typeOfCoffee[choose -1];
                System.out.println("Teşekkürler kahveniz hazırlanıyor...");
                flag = true;
            }
            else {
                System.out.println("Geçersiz kahve seçimi yaptınız...Tekrar deneyiniz");
            }
        }


    }
}