package bol17_2;

/**
 *
 * @author Leila
 */
public class Avestruz extends Aves implements IPuedeCaminar{
    @Override
    public void caminar(){
        System.out.println("La avestruz solo puede caminar");
    }
}
