import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> kopi   = new ArrayList<String>();

        Mesin robusta = new Mesin();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStockKopi(40);
        kopi.add(robusta.getJenisKopi());

        Mesin Arabica = new Mesin();
        Arabica.setJenisKopi("Arabica");
        Arabica.setJumlahStockKopi(40);
        kopi.add(Arabica.getJenisKopi());

        Mesin Flores = new Mesin();
        Flores.setJenisKopi("Flores");
        Flores.setJumlahStockKopi(40);
        kopi.add(Flores.getJenisKopi());


        for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+kopi.get(i));
        }
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;


        Topping Susu = new Topping();
        Topping Gula = new Topping();
        Topping Cream = new Topping();

        Susu.setJenisToppingg("Susu");
        Gula.setJenisToppingg("Gula");
        Cream.setJenisToppingg("Cream");

        Susu.setJumlahStock(25);
        Gula.setJumlahStock(25);
        Cream.setJumlahStock(25);


        ArrayList<String> topping = new ArrayList<String>();

        Topping susu = new Topping();
        Susu.setJumlahStock(25);
        Susu.setJenisToppingg("Susu");
        topping.add(Susu.getJenisToppingg());

        Topping gula = new Topping();
        Gula.setJumlahStock(25);
        Gula.setJenisToppingg("Gula");
        topping.add(Gula.getJenisToppingg());

        Topping cream = new Topping();
        Cream.setJumlahStock(25);
        Cream.setJenisToppingg("Cream");
        topping.add(Cream.getJenisToppingg());

        for(int i=0; i< topping.size();i++){
            int j= i+1;
            System.out.println("Menu Topping adalah "+j+" "+topping.get(i));
        }

        System.out.println("Masukan Topping yang mau dipilih ");
        int pilihanTopping = keyboard.nextInt() -1;
        System.out.println("Pesanan Anda Adalah "+kopi.get(pilihanKopi)+ " Dengan Topping "+topping.get(pilihanTopping));

    }
}
