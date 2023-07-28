import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class İs_oncelik {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();

        int aa = 1;
        int bb = 1;
        int cc = 1;
        int dd=1;

        String iş1 = "";
        String iş2 = "";
        String iş3 = "";
        String iş4 = "";
        String iş5 = "";
        String iş6 = "";
        String iş7 = "";
        String iş8 = "";
        String iş9 = "";
        String iş10 = "";


        double iş1Zamanı = 0;
        double iş2Zamanı = 0;
        double iş3Zamanı = 0;
        double iş4Zamanı = 0;
        double iş5Zamanı = 0;
        double iş6Zamanı = 0;
        double iş7Zamanı = 0;
        double iş8Zamanı = 0;
        double iş9Zamanı = 0;
        double iş10Zamanı = 0;

        double iş1Onemi=0;
        double iş2Onemi=0;
        double iş3Onemi=0;
        double iş4Onemi=0;
        double iş5Onemi=0;
        double iş6Onemi=0;
        double iş7Onemi=0;
        double iş8Onemi=0;
        double iş9Onemi=0;
        double iş10Onemi=0;



        double iş1kriter2=0;
        double iş2kriter2=0;
        double iş3kriter2=0;
        double iş4kriter2=0;
        double iş5kriter2=0;
        double iş6kriter2=0;
        double iş7kriter2=0;
        double iş8kriter2=0;
        double iş9kriter2=0;
        double iş10kriter2=0;



        double iş1Puanı=0;
        double iş2Puanı=0;
        double iş3Puanı=0;
        double iş4Puanı=0;
        double iş5Puanı=0;
        double iş6Puanı=0;
        double iş7Puanı=0;
        double iş8Puanı=0;
        double iş9Puanı=0;
        double iş10Puanı=0;




        System.out.println("*** Programımıza hoş geldiniz ***");
        System.out.println();
        System.out.println();

        System.out.println("Bu bir iş öncelik programıdır ");
        System.out.println();


        System.out.println("sen tamam diyene kadar bütün işleri tek tek isteyeceğim ");
        System.out.println();
        System.out.println("Hazır mısın \n lütfen cevabı  'evet' veya 'hayır' şeklinde giriniz");

        for (int j = 0; j < bb; j++) {
            String cevap0 = klavye.nextLine();



            if (cevap0.equals("evet") || cevap0.equals("Evet") || cevap0.equals("EVET")) {
                System.out.println("o zaman başlyalım");

            } else if (cevap0.equals("hayır") || cevap0.equals("Hayır") || cevap0.equals("Hayır")) {
                System.out.println("hazır olduğunda bekliyor olacağım");
                System.out.println();
                System.out.println("program sonlandırılıyor...");
                System.exit(0);

            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                bb++;

            }

        }


        for (int i = 0; i < aa; i++) {


            System.out.println(i + 1 + ". işi giriniz");
            arrayList.add(klavye.nextLine());

            System.out.println("başka iş giricek misin,\n lütfen cevabı  'evet' veya 'hayır' şeklinde giriniz");

            for (int j = 0; j < cc; j++) {
                String cevap = klavye.nextLine();



                if (cevap.equals("evet") || cevap.equals("Evet") || cevap.equals("EVET")) {
                    aa++;

                } else if (cevap.equals("hayır") || cevap.equals("Hayır") || cevap.equals("Hayır")) {
                    break;

                } else {
                    System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                    cc++;
                }
            }
            if (aa == 10) {
                System.out.println("görev limiti doldu ");
                break;
            }


        }
        int görevSayısı = arrayList.size();
        System.out.println(görevSayısı + " adet görev girdiniz ");
        try {
            iş1 = arrayList.get(0);
        } catch (IndexOutOfBoundsException a) {

        }
        try {
            iş2 = arrayList.get(1);
        } catch (IndexOutOfBoundsException b) {
        }try {
            iş3 = arrayList.get(2);
        } catch (IndexOutOfBoundsException c) {
        }
        try {
            iş4 = arrayList.
                    get(3);
        } catch (IndexOutOfBoundsException d) {
        }
        try {
            iş5 = arrayList.get(4);
        } catch (IndexOutOfBoundsException e) {
        }
        try {
            iş6 = arrayList.get(5);
        } catch (IndexOutOfBoundsException f) {
        }
        try {
            iş7 = arrayList.get(6);
        } catch (IndexOutOfBoundsException g) {

        }
        try {
            iş8 = arrayList.get(7);
        } catch (IndexOutOfBoundsException h) {
        }
        try {
            iş9 = arrayList.get(8);
        } catch (IndexOutOfBoundsException i) {

        }
        try {
            iş10 = arrayList.get(9);
        } catch (IndexOutOfBoundsException j) {

        }


        System.out.println(" "+iş1 + " \n"+iş2 + " \n"+iş3 + " \n"+iş4 + " \n"+iş5 + " \n"+iş6 + " \n"+iş7 + " \n"+iş8 + " \n "+iş9 + " \n"+iş10 );
        boolean iş1Kontrol =iş1.isEmpty();
        boolean iş2Kontrol =iş2.isEmpty();
        boolean iş3Kontrol =iş3.isEmpty();
        boolean iş4Kontrol =iş4.isEmpty();
        boolean iş5Kontrol =iş5.isEmpty();
        boolean iş6Kontrol =iş6.isEmpty();
        boolean iş7Kontrol =iş7.isEmpty();
        boolean iş8Kontrol =iş8.isEmpty();
        boolean iş9Kontrol =iş9.isEmpty();
        boolean iş10Kontrol =iş10.isEmpty();



        if (iş1Kontrol== false){System.out.println(iş1+" işini yapmak için kaç saatiniz var");
            for (int i = 0; i <dd ; i++) {

                iş1Zamanı=klavye.nextDouble();
                if (iş1Zamanı<0) {
                    System.out.println("lütfen sıfırdan büyük bir değer gir");
                    dd++;}
            }
            if (iş1Zamanı<1) iş1Puanı=iş1Puanı+100;
            if (1<=iş1Zamanı&&iş1Zamanı<2) iş1Puanı=iş1Puanı+75;
            if (2<=iş1Zamanı&&iş1Zamanı<3) iş1Puanı=iş1Puanı+50;
            if (3<=iş1Zamanı&&iş1Zamanı<4) iş1Puanı=iş1Puanı+37;
            if (4<=iş1Zamanı&&iş1Zamanı<5) iş1Puanı=iş1Puanı+25;
            if (iş1Zamanı>5) iş1Puanı=iş1Puanı+5;
            System.out.println(iş1+" işi sizin için ne kadar önemli \n1 ile 5 arasında puanla ( 5 en yüksek değerdir)");
            for (int i = 0; i <dd ; i++) {

                iş1Onemi=klavye.nextDouble();
                if (5<iş1Onemi&&iş1Onemi<0) {
                    System.out.println("lütfen 1 ile 5 arasında bir değer gir");
                    dd++;}
            }
            if (iş1Onemi==1) iş1Puanı=iş1Puanı+5;
            if (1<=iş1Onemi&&iş1Onemi<2) iş1Puanı=iş1Puanı+20;
            if (2<=iş1Onemi&&iş1Onemi<3) iş1Puanı=iş1Puanı+35;
            if (3<=iş1Onemi&&iş1Onemi<4) iş1Puanı=iş1Puanı+40;
            if (4<=iş1Onemi&&iş1Onemi<5) iş1Puanı=iş1Puanı+55;
            if (iş1Onemi>=5) iş1Puanı=iş1Puanı+75;

        }
        if (iş2Kontrol==false){System.out.println(iş2+" işini yapmak için kaç saatiniz var");
            for (int i = 0; i <dd ; i++) {

                iş2Zamanı=klavye.nextDouble();
                if (iş2Zamanı<0) {
                    System.out.println("lütfen sıfırdan büyük bir değer gir");
                    dd++;}
            }
            if (iş2Zamanı<1) iş2Puanı=iş2Puanı+100;
            if (1<=iş2Zamanı&&iş2Zamanı<2) iş2Puanı=iş2Puanı+75;
            if (2<=iş2Zamanı&&iş2Zamanı<3) iş2Puanı=iş2Puanı+50;
            if (3<=iş2Zamanı&&iş2Zamanı<4) iş2Puanı=iş2Puanı+37;
            if (4<=iş2Zamanı&&iş2Zamanı<5) iş2Puanı=iş2Puanı+25;
            if (iş2Zamanı>5) iş2Puanı=iş2Puanı+5;
            System.out.println(iş2+" işi sizin için ne kadar önemli \n1 ile 5 arasında puanla ( 5 en yüksek değerdir)");
            for (int i = 0; i <dd ; i++) {

                iş2Onemi=klavye.nextDouble();
                if (5<iş2Onemi&&iş2Onemi<0) {
                    System.out.println("lütfen 1 ile 5 arasında bir değer gir");
                    dd++;}
            }
            if (iş2Onemi==1) iş2Puanı=iş2Puanı+5;
            if (1<=iş2Onemi&&iş2Onemi<2) iş2Puanı=iş2Puanı+20;
            if (2<=iş2Onemi&&iş2Onemi<3) iş2Puanı=iş2Puanı+35;
            if (3<=iş2Onemi&&iş2Onemi<4) iş2Puanı=iş2Puanı+40;
            if (4<=iş2Onemi&&iş1Onemi<5) iş2Puanı=iş2Puanı+55;
            if (iş2Onemi>=5) iş2Puanı=iş2Puanı+75;

        }
        if (iş3Kontrol==false){System.out.println(iş3+" işini yapmak için kaç saatiniz var");
            for (int i = 0; i <dd ; i++) {

                iş3Zamanı=klavye.nextDouble();
                if (iş3Zamanı<0) {
                    System.out.println("lütfen sıfırdan büyük bir değer gir");
                    dd++;}
            }
            if (iş3Zamanı<1) iş3Puanı=iş3Puanı+100;
            if (1<=iş3Zamanı&&iş3Zamanı<2) iş3Puanı=iş3Puanı+75;
            if (2<=iş3Zamanı&&iş3Zamanı<3) iş3Puanı=iş3Puanı+50;
            if (3<=iş3Zamanı&&iş3Zamanı<4) iş3Puanı=iş3Puanı+37;
            if (4<=iş3Zamanı&&iş3Zamanı<5) iş3Puanı=iş3Puanı+25;
            if (iş3Zamanı>5) iş3Puanı=iş3Puanı+5;
            System.out.println(iş3+" işi sizin için ne kadar önemli \n1 ile 5 arasında puanla ( 5 en yüksek değerdir)");
            for (int i = 0; i <dd ; i++) {

                iş3Onemi=klavye.nextDouble();
                if (5<iş3Onemi&&iş3Onemi<0) {
                    System.out.println("lütfen 1 ile 5 arasında bir değer gir");
                    dd++;}
            }
            if (iş3Onemi==1) iş3Puanı=iş3Puanı+5;
            if (1<=iş3Onemi&&iş3Onemi<2) iş3Puanı=iş3Puanı+20;
            if (2<=iş3Onemi&&iş3Onemi<3) iş3Puanı=iş3Puanı+35;
            if (3<=iş3Onemi&&iş3Onemi<4) iş3Puanı=iş3Puanı+40;
            if (4<=iş3Onemi&&iş3Onemi<5) iş3Puanı=iş3Puanı+55;
            if (iş3Onemi>=5) iş3Puanı=iş3Puanı+75;

        }
        if (iş4Kontrol==false){System.out.println(iş4+" işini yapmak için kaç saatiniz var");
            for (int i = 0; i <dd ; i++) {

                iş4Zamanı=klavye.nextDouble();
                if (iş4Zamanı<0) {
                    System.out.println("lütfen sıfırdan büyük bir değer gir");
                    dd++;}
            }
            if (iş4Zamanı<1) iş4Puanı=iş4Puanı+100;
            if (1<=iş4Zamanı&&iş4Zamanı<2) iş4Puanı=iş4Puanı+75;
            if (2<=iş4Zamanı&&iş4Zamanı<3) iş4Puanı=iş4Puanı+50;
            if (3<=iş4Zamanı&&iş4Zamanı<4) iş4Puanı=iş4Puanı+37;
            if (4<=iş4Zamanı&&iş4Zamanı<5) iş4Puanı=iş4Puanı+25;
            if (iş4Zamanı>5) iş4Puanı=iş4Puanı+5;
            System.out.println(iş4+" işi sizin için ne kadar önemli \n1 ile 5 arasında puanla ( 5 en yüksek değerdir)");
            for (int i = 0; i <dd ; i++) {

                iş4Onemi=klavye.nextDouble();
                if (5<iş4Onemi&&iş4Onemi<0) {
                    System.out.println("lütfen 1 ile 5 arasında bir değer gir");
                    dd++;}
            }
            if (iş4Onemi==1) iş4Puanı=iş4Puanı+5;
            if (1<=iş4Onemi&&iş4Onemi<2) iş4Puanı=iş4Puanı+20;
            if (2<=iş4Onemi&&iş4Onemi<3) iş4Puanı=iş4Puanı+35;
            if (3<=iş4Onemi&&iş4Onemi<4) iş4Puanı=iş4Puanı+40;
            if (4<=iş4Onemi&&iş4Onemi<5) iş4Puanı=iş4Puanı+55;
            if (iş4Onemi>=5) iş4Puanı=iş4Puanı+75;

        }
        if (iş5Kontrol==false){System.out.println(iş5+" işini yapmak için kaç saatiniz var");
            for (int i = 0; i <dd ; i++) {

                iş5Zamanı=klavye.nextDouble();
                if (iş5Zamanı<0) {
                    System.out.println("lütfen sıfırdan büyük bir değer gir");
                    dd++;}
            }
            if (iş5Zamanı<1) iş5Puanı=iş5Puanı+100;
            if (1<=iş5Zamanı&&iş5Zamanı<2) iş5Puanı=iş5Puanı+75;
            if (2<=iş5Zamanı&&iş5Zamanı<3) iş5Puanı=iş5Puanı+50;
            if (3<=iş5Zamanı&&iş5Zamanı<4) iş5Puanı=iş5Puanı+37;
            if (4<=iş5Zamanı&&iş5Zamanı<5) iş5Puanı=iş5Puanı+25;
            if (iş5Zamanı>5) iş5Puanı=iş5Puanı+5;
            System.out.println(iş5+" işi sizin için ne kadar önemli \n1 ile 5 arasında puanla ( 5 en yüksek değerdir)");
            for (int i = 0; i <dd ; i++) {

                iş5Onemi=klavye.nextDouble();
                if (5<iş5Onemi&&iş5Onemi<0) {
                    System.out.println("lütfen 1 ile 5 arasında bir değer gir");
                    dd++;}
            }
            if (iş5Onemi==1) iş5Puanı=iş5Puanı+5;
            if (1<=iş5Onemi&&iş5Onemi<2) iş5Puanı=iş5Puanı+20;
            if (2<=iş5Onemi&&iş5Onemi<3) iş5Puanı=iş5Puanı+35;
            if (3<=iş5Onemi&&iş5Onemi<4) iş5Puanı=iş5Puanı+40;
            if (4<=iş5Onemi&&iş5Onemi<5) iş5Puanı=iş5Puanı+55;
            if (iş5Onemi>=5) iş5Puanı=iş5Puanı+75;

        }
        if (iş6Kontrol==false){System.out.println(iş6+" işini yapmak için kaç saatiniz var");
            for (int i = 0; i <dd ; i++) {

                iş6Zamanı=klavye.nextDouble();
                if (iş6Zamanı<0) {
                    System.out.println("lütfen sıfırdan büyük bir değer gir");
                    dd++;}
            }
            if (iş6Zamanı<1) iş6Puanı=iş6Puanı+100;
            if (1<=iş6Zamanı&&iş6Zamanı<2) iş6Puanı=iş6Puanı+75;
            if (2<=iş6Zamanı&&iş6Zamanı<3) iş6Puanı=iş6Puanı+50;
            if (3<=iş6Zamanı&&iş6Zamanı<4) iş6Puanı=iş6Puanı+37;
            if (4<=iş6Zamanı&&iş6Zamanı<5) iş6Puanı=iş6Puanı+25;
            if (iş6Zamanı>5) iş6Puanı=iş6Puanı+5;
            System.out.println(iş6+" işi sizin için ne kadar önemli \n1 ile 5 arasında puanla ( 5 en yüksek değerdir)");
            for (int i = 0; i <dd ; i++) {

                iş6Onemi=klavye.nextDouble();
                if (5<iş6Onemi&&iş6Onemi<0) {
                    System.out.println("lütfen 1 ile 5 arasında bir değer gir");
                    dd++;}
            }
            if (iş6Onemi==1) iş6Puanı=iş6Puanı+5;
            if (1<=iş6Onemi&&iş6Onemi<2) iş6Puanı=iş6Puanı+20;
            if (2<=iş6Onemi&&iş6Onemi<3) iş6Puanı=iş6Puanı+35;
            if (3<=iş6Onemi&&iş6Onemi<4) iş6Puanı=iş6Puanı+40;
            if (4<=iş6Onemi&&iş6Onemi<5) iş6Puanı=iş6Puanı+55;
            if (iş6Onemi>=5) iş6Puanı=iş6Puanı+75;

        }
        if (iş7Kontrol==false){System.out.println(iş7+" işini yapmak için kaç saatiniz var");
            for (int i = 0; i <dd ; i++) {

                iş7Zamanı=klavye.nextDouble();
                if (iş7Zamanı<0) {
                    System.out.println("lütfen sıfırdan büyük bir değer gir");
                    dd++;}
            }
            if (iş7Zamanı<1) iş7Puanı=iş7Puanı+100;
            if (1<=iş7Zamanı&&iş7Zamanı<2) iş7Puanı=iş7Puanı+75;
            if (2<=iş7Zamanı&&iş7Zamanı<3) iş7Puanı=iş7Puanı+50;
            if (3<=iş7Zamanı&&iş7Zamanı<4) iş7Puanı=iş7Puanı+37;
            if (4<=iş7Zamanı&&iş7Zamanı<5) iş7Puanı=iş7Puanı+25;
            if (iş7Zamanı>5) iş7Puanı=iş7Puanı+5;
            System.out.println(iş7+" işi sizin için ne kadar önemli \n1 ile 5 arasında puanla ( 5 en yüksek değerdir)");
            for (int i = 0; i <dd ; i++) {

                iş7Onemi=klavye.nextDouble();
                if (5<iş7Onemi&&iş7Onemi<0) {
                    System.out.println("lütfen 1 ile 5 arasında bir değer gir");
                    dd++;}
            }
            if (iş7Onemi==1) iş7Puanı=iş7Puanı+5;
            if (1<=iş7Onemi&&iş7Onemi<2) iş7Puanı=iş7Puanı+20;
            if (2<=iş7Onemi&&iş7Onemi<3) iş7Puanı=iş7Puanı+35;
            if (3<=iş7Onemi&&iş7Onemi<4) iş7Puanı=iş7Puanı+40;
            if (4<=iş7Onemi&&iş7Onemi<5) iş7Puanı=iş7Puanı+55;
            if (iş7Onemi>=5) iş7Puanı=iş7Puanı+75;

        }
        if (iş8Kontrol==false){System.out.println(iş8+" işini yapmak için kaç saatiniz var");
            for (int i = 0; i <dd ; i++) {

                iş8Zamanı=klavye.nextDouble();
                if (iş8Zamanı<0) {
                    System.out.println("lütfen sıfırdan büyük bir değer gir");
                    dd++;}
            }
            if (iş8Zamanı<1) iş8Puanı=iş8Puanı+100;
            if (1<=iş8Zamanı&&iş8Zamanı<2) iş8Puanı=iş8Puanı+75;
            if (2<=iş8Zamanı&&iş8Zamanı<3) iş8Puanı=iş8Puanı+50;
            if (3<=iş8Zamanı&&iş8Zamanı<4) iş8Puanı=iş8Puanı+37;
            if (4<=iş8Zamanı&&iş8Zamanı<5) iş8Puanı=iş8Puanı+25;
            if (iş8Zamanı>5) iş8Puanı=iş8Puanı+5;
            System.out.println(iş8+" işi sizin için ne kadar önemli \n1 ile 5 arasında puanla ( 5 en yüksek değerdir)");
            for (int i = 0; i <dd ; i++) {

                iş8Onemi=klavye.nextDouble();
                if (5<iş8Onemi&&iş8Onemi<0) {
                    System.out.println("lütfen 1 ile 5 arasında bir değer gir");
                    dd++;}
            }
            if (iş8Onemi==1) iş8Puanı=iş8Puanı+5;
            if (1<=iş8Onemi&&iş8Onemi<2) iş8Puanı=iş8Puanı+20;
            if (2<=iş8Onemi&&iş8Onemi<3) iş8Puanı=iş8Puanı+35;
            if (3<=iş8Onemi&&iş8Onemi<4) iş8Puanı=iş8Puanı+40;
            if (4<=iş8Onemi&&iş8Onemi<5) iş8Puanı=iş8Puanı+55;
            if (iş8Onemi>=5) iş8Puanı=iş8Puanı+75;

        }
        if (iş9Kontrol==false){System.out.println(iş9+" işini yapmak için kaç saatiniz var");
            for (int i = 0; i <dd ; i++) {

                iş9Zamanı=klavye.nextDouble();
                if (iş9Zamanı<0) {
                    System.out.println("lütfen sıfırdan büyük bir değer gir");
                    dd++;}
            }
            if (iş9Zamanı<1) iş9Puanı=iş9Puanı+100;
            if (1<=iş9Zamanı&&iş9Zamanı<2) iş9Puanı=iş9Puanı+75;
            if (2<=iş9Zamanı&&iş9Zamanı<3) iş9Puanı=iş9Puanı+50;
            if (3<=iş9Zamanı&&iş9Zamanı<4) iş8Puanı=iş9Puanı+37;
            if (4<=iş9Zamanı&&iş9Zamanı<5) iş9Puanı=iş9Puanı+25;
            if (iş9Zamanı>5) iş9Puanı=iş9Puanı+5;
            System.out.println(iş9+" işi sizin için ne kadar önemli \n1 ile 5 arasında puanla ( 5 en yüksek değerdir)");
            for (int i = 0; i <dd ; i++) {

                iş9Onemi=klavye.nextDouble();
                if (5<iş9Onemi&&iş9Onemi<0) {
                    System.out.println("lütfen 1 ile 5 arasında bir değer gir");
                    dd++;}
            }
            if (iş9Onemi==1) iş9Puanı=iş9Puanı+5;
            if (1<=iş9Onemi&&iş9Onemi<2) iş9Puanı=iş9Puanı+20;
            if (2<=iş9Onemi&&iş9Onemi<3) iş9Puanı=iş9Puanı+35;
            if (3<=iş9Onemi&&iş9Onemi<4) iş9Puanı=iş9Puanı+40;
            if (4<=iş9Onemi&&iş9Onemi<5) iş9Puanı=iş9Puanı+55;
            if (iş9Onemi>=5) iş9Puanı=iş9Puanı+75;

        }
        if (iş10Kontrol==false){System.out.println(iş10+" işini yapmak için kaç saatiniz var");
            for (int i = 0; i <dd ; i++) {

                iş10Zamanı=klavye.nextDouble();
                if (iş10Zamanı<0) {
                    System.out.println("lütfen sıfırdan büyük bir değer gir");
                    dd++;}
            }
            if (iş10Zamanı<1) iş10Puanı=iş10Puanı+100;
            if (1<=iş10Zamanı&&iş10Zamanı<2) iş10Puanı=iş10Puanı+75;
            if (2<=iş10Zamanı&&iş10Zamanı<3) iş10Puanı=iş10Puanı+50;
            if (3<=iş10Zamanı&&iş10Zamanı<4) iş10Puanı=iş10Puanı+37;
            if (4<=iş10Zamanı&&iş10Zamanı<5) iş10Puanı=iş10Puanı+25;
            if (iş10Zamanı>5) iş10Puanı=iş10Puanı+5;
            System.out.println(iş10+" işi sizin için ne kadar önemli \n1 ile 5 arasında puanla ( 5 en yüksek değerdir)");
            for (int i = 0; i <dd ; i++) {

                iş10Onemi=klavye.nextDouble();
                if (5<iş10Onemi&&iş10Onemi<0) {
                    System.out.println("lütfen 1 ile 5 arasında bir değer gir");
                    dd++;}
            }
            if (iş10Onemi==1) iş10Puanı=iş10Puanı+5;
            if (1<=iş10Onemi&&iş10Onemi<2) iş10Puanı=iş10Puanı+20;
            if (2<=iş10Onemi&&iş10Onemi<3) iş10Puanı=iş10Puanı+35;
            if (3<=iş10Onemi&&iş10Onemi<4) iş10Puanı=iş10Puanı+40;
            if (4<=iş10Onemi&&iş10Onemi<5) iş10Puanı=iş10Puanı+55;
            if (iş10Onemi>=5) iş10Puanı=iş10Puanı+75;

        }
        System.out.println("tavsiye ettiğimiz yapma sırası aşağıda yazıor");
        System.out.println();

        List<IşPuanı> işPuanları = new ArrayList<>();



        işPuanları.add(new IşPuanı(iş1, iş1Puanı));
        işPuanları.add(new IşPuanı(iş2, iş2Puanı));
        işPuanları.add(new IşPuanı(iş3, iş3Puanı));
        işPuanları.add(new IşPuanı(iş4, iş4Puanı));
        işPuanları.add(new IşPuanı(iş5, iş5Puanı));
        işPuanları.add(new IşPuanı(iş6, iş6Puanı));
        işPuanları.add(new IşPuanı(iş7, iş7Puanı));
        işPuanları.add(new IşPuanı(iş8, iş8Puanı));
        işPuanları.add(new IşPuanı(iş9, iş9Puanı));
        işPuanları.add(new IşPuanı(iş10, iş10Puanı));

        // Puanlara göre sırala
        Collections.sort(işPuanları, new Comparator<IşPuanı>() {
            @Override
            public int compare(IşPuanı puan1, IşPuanı puan2) {
                return Double.compare(puan2.getPuan(), puan1.getPuan());
            }
        });

        // Değerleri ve isimleriyle sıralı olarak yazdır
        for (IşPuanı iş : işPuanları) {
            System.out.println(iş.getIsim() + ": " + iş.getPuan());
        }


    }
}

class IşPuanı {
    private String isim;
    private double puan;

    public IşPuanı(String isim, double puan) {
        this.isim = isim;
        this.puan = puan;
    }

    public String getIsim() {
        return isim;
    }

    public double getPuan() {
        return puan;
    }




}







