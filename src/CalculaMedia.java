
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karolina.gkallajian
 */
public class CalculaMedia {
    
    private double nota;
    private double media;
    private double somaNotas;
    private ArrayList<Double> notas;
    private Scanner scanner;
    
    public CalculaMedia(Scanner scanner){
        notas = new ArrayList<>();
        this.scanner = scanner;
        somaNotas = 0;
    }
    
    public double getMedia(){
        while (scanner.hasNext()) {
            scanner.next();
            nota = scanner.nextDouble();
            notas.add(nota);
        }
        for (Double nota1 : notas) {
            somaNotas += nota1;
        }
        
        media = somaNotas/notas.size();
        return media;
    }
    
}
