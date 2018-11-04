
package elagazas;

import java.util.Random;
import java.util.Scanner;


public class Elagazas {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        //4. Feladat
       /* System.out.println("Kérem adja meg a háromszög a oldalát");
        int a = sc.nextInt();
        System.out.println("Kérem adja meg a háromszög b oldalát");
        int b = sc.nextInt();
        System.out.println("Kérem adja meg a háromszög c oldalát");
        int c = sc.nextInt();
        
        int haromszogKerulet = a+b+c;
      
        
        if(a+b<c || a+c<b || b+c<a){
            System.out.println("A háromszög nem szerkeszthető!");
        }else{ //a+b>c && a+c>b && b+c>a
                System.out.println("A háromszög kerülete: "+haromszogKerulet);
            }
        */
        //5.Feladat
       /* System.out.println("Kérem adja meg a téglalap a oldalát");
        int a5 = sc.nextInt();
        System.out.println("Kérem adja meg a háromszög b oldalát");
        int b5 = sc.nextInt();
        System.out.println("Kérem adja meg a műveletet (K-T)");
        char muvelet = sc.next().charAt(0);
        if(a5 == b5){
            System.out.println("Ez egy négyzet!");
        }
        switch (Character.toUpperCase(muvelet)) {
            case 'K':
                int kerulet = (a5+b5)*2;
                System.out.println("A téglalap kerülete: "+kerulet);
                break;
            case 'T':
                int terulet = a5*b5;
                System.out.println("A téglalap területe: "+terulet);
                break;
            default:
                System.out.println("Rossz karaktert adott meg!");
                break;
        }*/
       //6.Feladat
        /*System.out.println("Kérem adja meg a pontszámát");
        int pontszam = sc.nextInt();
       if(pontszam <= 42){
           System.out.println("Osztályzata: elégtelen");
       }else if(pontszam >= 43 &&  pontszam <=57){
           System.out.println("Osztályzata elégséges");
       }else if(pontszam >= 58 && pontszam <= 72){
           System.out.println("Osztályzata közepes");
       }else if(pontszam >= 73 && pontszam <= 87){
           System.out.println("Osztályzata jó");
       }else if(pontszam >= 88 && pontszam <= 100){
           System.out.println("Osztályzata jeles");
       }else{
           System.out.println("Nem megfelelő pontszámot adott meg");
       }*/
        //7.Feladat
       /* System.out.println("Adja meg hanyadik hónapot írunk!");
         int honap = sc.nextInt();
        switch(honap){
            case 1: System.out.println("január");break;   
            case 2: System.out.println("február");break; 
            case 3: System.out.println("március");break; 
            case 4: System.out.println("április");break;  
            case 5: System.out.println("május");break;  
            case 6: System.out.println("június");break;
            case 7: System.out.println("július");break;  
            case 8: System.out.println("augusztus");break;  
            case 9: System.out.println("szeptember");break;  
            case 10: System.out.println("október");break;  
            case 11: System.out.println("november");break;  
            case 12: System.out.println("december");break;  
            default: System.out.println("nincs ilyen hónap");
                
        }*/
        //8.Feladat
        System.out.println("Fej vagy írás!\nAdjon egy tippet! (0 a fej - 1 az írás)");
        int tipp = sc.nextInt();
        int eredmeny = r.nextInt(1 + 1) ;
        if(tipp == eredmeny){
            if(eredmeny == 0){
                System.out.println("fej");
            }else{
                System.out.println("írás");
            }
            System.out.println("Gratulálok Ön nyert! ");
        }else{
            if(eredmeny == 0){
                System.out.println("fej");
            }else{
                System.out.println("írás");
            }
            System.out.println("Most nem nyert! ");
        }
            
        
         
       
    }
}
