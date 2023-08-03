import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList <String> lista= new ArrayList<>();
    String csvFile ="lista.csv";
    String header = "elementi\n";
    
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
FileWriter fileWriter = null;
try {
    fileWriter = new FileWriter(csvFile);
    fileWriter.append(header); 


    for (String line : lista) {
        fileWriter.append(line);
        fileWriter.append("\n");
    }

    System.out.println("File CSV creato con successo.");
} catch (Exception e) {
    System.out.println("Errore in CsvFileWriter."); 
    e.printStackTrace(); 
} finally {
    try {
        fileWriter.flush();
        fileWriter.close(); 
    } catch (IOException e) {
        System.out.println("Errore durante il flush/close del fileWriter.");
        e.printStackTrace();
    }
}
            
        }
}
