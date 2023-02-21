//Zadanie3_4. Obliczenia
//Program liczący silnię.
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Podaj liczbę całkowitą");
    int liczba=scanner.nextInt();
    int iloczyn =1;
      
    for(int i =1; i<= liczba; i++)//liczenie silni
      {
        iloczyn*= i;
      }
    System.out.println(iloczyn);
    }
}