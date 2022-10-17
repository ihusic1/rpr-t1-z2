package ba.unsa.etf.rpr;
import java.util.Scanner;


public class Main {

public static int sumaCifara(int n){
    int suma=0;
    do{
        int cifra=n%10;
        suma+=cifra;
        n=n/10;
    }while(n!=0);
        return suma;

}

    public static void main(String[] args) {
        Scanner unos = new Scanner (System.in);
        System.out.println("Unesite broj n: ");
        int n = unos.nextInt();

        for(int i=1; i<=n; i++){
            if(i%sumaCifara(i)==0){
                System.out.println(i);
            }
        }
    }

}
