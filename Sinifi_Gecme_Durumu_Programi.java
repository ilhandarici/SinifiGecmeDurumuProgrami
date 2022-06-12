import java.util.Scanner;
public class Sinifi_Gecme_Durumu_Programi {
    public static void main(String[] args) {
        
            Scanner inp = new Scanner(System.in);
            String dersler[] = {"Matematik", "Türkçe", "Fizik", "Kimya", "Müzik"};
            int toplam = 0, sayac = 0, deger = 0;
            double ort;
        try{
            for (int i = 0; i<5; i++) {
                System.out.print(dersler[i] + " dersinizin notunu giriniz : ");
                deger = inp.nextInt();
                
                if(deger >= 0 && deger <= 100){
                    toplam += deger;
                sayac++;
                }
                else {
                    System.out.println(dersler[i] + "dersinizin notu 0-100 arasında bir değer olmadığı için ortalamaya dahil edilmemiştir...\nLütfen notunuzu tekrardan kontrol ediniz!");
                }
            }
            
            ort = toplam / sayac;
            if(ort <= 55){
                System.out.println("Sınıfta Kaldınız! Seneye tekrar görüşürüz...");
            }
            else{
                System.out.println("Tebrikler sınıfı başarıyla geçtiniz!");
            }
            System.out.println("Not ortalamanız : " + ort);
        }finally{
            inp.close();
            }
        
    }
    
}
