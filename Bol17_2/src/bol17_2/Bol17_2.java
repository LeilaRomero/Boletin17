package bol17_2;

/**
 *
 * @author Leila
 */
public class Bol17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato objGa = new Gato();
        System.out.println("Los gatos");
        objGa.caminar();
        objGa.nadar();
        
        Papagallo objPapag = new Papagallo();
        System.out.println("Los papagallos");
        objPapag.caminar();
        objPapag.volar();

        Tigre objTi = new Tigre();
        System.out.println("Los tigres");
        objTi.caminar();
        objTi.nadar();

        Avestruz objAves = new Avestruz();
        System.out.println("Las avestruces");
        objAves.caminar();
        objAves.volar();

        Murcielago objMur = new Murcielago();
        System.out.println("Los murcielagos");
        objMur.caminar();
        objMur.volar();

    }

}
