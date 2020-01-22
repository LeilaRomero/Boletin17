package bol17_1;

/**
 *
 * @author Leila
 */
public class Gato extends Mamiferos implements IPuedeNadar{
    @Override
    public void nadar(){
        System.out.println("Los gatos pueden nadar");
    }
}
