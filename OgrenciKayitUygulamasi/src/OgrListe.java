import java.util.Scanner;

public class OgrListe {
    OgrNode head = null;
    OgrNode tail = null;
    OgrNode temp= null;
    OgrNode temp2 = null;

    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;
Scanner scanner = new Scanner(System.in);// kullanıcıdan değer ama için kullanılır

    void ekle()

    {
        System.out.println("Bilgisayar bölümüne kayıt olacak öğrenci bilgilerini giriniz");
        System.out.println("numara : ");  numara = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ad : ");  ad = scanner.nextLine();
        System.out.println("soyad : ");  soyad = scanner.nextLine();
        System.out.println("vize  : ");  vize = scanner.nextInt();
        System.out.println("final : ");  fin = scanner.nextInt();

        OgrNode eleman = new OgrNode(numara,ad,soyad,vize,fin);

        if ( head==null) {
            head = eleman;
            tail= eleman;
            System.out.println("Bilgisayar Bölümüne Kayıt olacak liste yapısı oluşturuldu");

        }
        else
        {
            eleman.next=head;
            System.out.println(numara + " numaralı öğrenci bölüme kayıt edildi ");
        }
    }


    void sil()
    {
        if (head==null)
        {
            System.out.println("Liste Boş ");
        }

        else
        {
            System.out.println("Silmek istediğiniz öğrencinin numarsını giriniz ");
            numara= scanner.nextInt();
            if (numara== head.numara && head.next==null )
            {
                head=null;
                tail=null;
                System.out.println(numara + " Numaralı öğrenci silindi , listede kayıtlı öğrenci kalmadı");

            } else if (numara== head.numara && head.next!=null) {
                head=head.next; // baştaki elemanı silmek
                System.out.println(numara + " Numaralı öğrenci silindi ");
                
            }
            else
            {
                temp=head;
                temp2=head;
                while (temp.next!=null)
                {
                    if (numara== temp.numara)
                    {
                        temp2.next=temp.next;
                        System.out.println(numara + " Numaralı öğrenci silindi ");
                    }
                    temp2=temp;
                    temp = temp.next;
                }
                if (numara== temp.numara)
                {
                    temp2.next=null;
                    tail=temp2;
                    System.out.println(numara + " Numaralı öğrenci silindi ");
                }
            }

        }
    }

    void yazdır()
    {
        temp = head;
        while (temp!=null)
        {
            System.out.println(temp.numara+" numaralı öğrenci bilgileri");
            System.out.println("****************************************");
            System.out.println("ad        : "+temp.ad);
            System.out.println("****************************************");
            System.out.println("soyad     : "+temp.soyad);
            System.out.println("****************************************");
            System.out.println("vize      : "+temp.vize);
            System.out.println("****************************************");
            System.out.println("final     : "+temp.fin);
            System.out.println("****************************************");
            System.out.println("ortalama  : "+temp.ortalama);
            System.out.println("****************************************");
            System.out.println("durum     : "+temp.durum);
            temp=temp.next;
        }
    }
    void enBasarılıOgrenci()
    {
        if (head==null)
        {
            System.out.println("Liste boş!!!!!!");
        }
        temp = head;
        double buyuk=temp.ortalama;
        while (temp!=null)
        {
            if (buyuk < temp.ortalama)
            {
                buyuk= temp.ortalama;

                numara=temp.numara;
                ad= temp.ad;
                soyad=temp.soyad;
                vize=temp.vize;
                fin=temp.fin;
                ortalama=temp.ortalama;
                durum=temp.durum;
            }


            temp=temp.next;
        }
        System.out.println(temp.numara+" numaralı öğrenci bilgileri");
        System.out.println("****************************************");
        System.out.println("ad        : "+ad);
        System.out.println("****************************************");
        System.out.println("soyad     : "+soyad);
        System.out.println("****************************************");
        System.out.println("vize      : "+vize);
        System.out.println("****************************************");
        System.out.println("final     : "+fin);
        System.out.println("****************************************");
        System.out.println("ortalama  : "+ortalama);
        System.out.println("****************************************");
        System.out.println("durum     : "+durum);
    }
}
















