
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class classePrincipal {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("C:\\Users\\karolina.gkallajian\\Desktop\\POO\\POO_2404\\notas.txt"))
                .useDelimiter("\\t|\\n");
        CalculaMedia media = new CalculaMedia(scanner);
        System.out.println("Média: " + media.getMedia());
    }

}
