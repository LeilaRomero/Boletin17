package bol17_2;

/**
 *
 * @author Leila
 */
public class Aves implements IPuedeCaminar,IPuedenVolar{
    
    @Override
    public void caminar(){
        System.out.println("Las aves pueden caminar");
    }
    @Override
    public void volar(){
        System.out.println("Las aves pueden volar");
    }
}
