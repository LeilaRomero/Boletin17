package bol17_1;

/**
 *
 * @author Leila
 */
public class Bol17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato objGato=new Gato();
        objGato.nadar();
        objGato.caminar();
        
        Mamiferos objMam=new Mamiferos();
        objMam.caminar();
        
        Papagaio objPapag=new Papagaio();
        objPapag.caminar();
    }
    
}
