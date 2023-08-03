import java.util.ArrayList;
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList <String> lista= new ArrayList<>();
    while (true){

        System.out.println("inserisci un elemento:");
        String richiesta = input.nextLine();
        if (richiesta.equalsIgnoreCase("exit")) {
            break;
        }
        lista.add(richiesta);
    }
    for (int i = 0; i < lista.size(); i++) 
     {
        System.out.println(lista.get(i)+"#" +(i+1));
        
     }
    // int i= 1;
    //     for (String elemento : lista) {
            
            
    //         System.out.println(elemento + "#" + i++);

            
        }
}
