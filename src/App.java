import java.util.Scanner;

public class App {

  public static void main(String[] args) {
      boolean wylosowana=false;
      char[][] tab = new char[2][5];
      String[] szufladki= new String[7];
      char[] wynik = new char[7];
      String haslo,haslo2;
  
      Scanner sc = new Scanner(System.in);
  
      System.out.print("Podaj hasło (10): ");
      haslo = sc.nextLine();
      System.out.print("Podaj wyraz do zwrocenia (7): ");
      haslo2 = sc.nextLine();
      for(int b = 0; b < 2; b++){
        for(int i = 0; i < 5; i++){
          tab[b][i]=haslo.charAt(i+5*b);
        }
      }
      for(int i = 0; i<7; i++){
          wynik[i]=haslo2.charAt(i);
      }
      System.out.print("\nWpisane hasło to: \n");
      for(int b = 0; b<2; b++){
        for(int i=0; i<5; i++){
          System.out.println((b+1)+": "+(i+1)+": "+tab[b][i]);
        }
      }
      System.out.print("\nZwrocone hasło to: \n");
      for(int c=0; c<7; c++){
        for(int b=0; b<2; b++){
          for(int i=0; i<5; i++){
            if((tab[b][i]==wynik[c]) && wylosowana!=true){
              System.out.print(tab[b][i]);
              wylosowana=true;
              szufladki[c]="Szufladka \""+tab[b][i]+"\": ["+Integer.toString(b+1)+"] ["+Integer.toString(i+1)+"]\n";
            }
          }
        }
        wylosowana=false;
      }
      System.out.print("\n\nNumer Szuflady: \n");
      for(int i=0; i<7; i++){
        System.out.print(szufladki[i]);
      }
     
  }
}