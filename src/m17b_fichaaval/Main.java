package m17b_fichaaval;
//https://github.com/13374/-M17B_fichaAval.git

/**
 *
 * @author ruben
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(5,7);
        Ponto2D p2 = new Ponto2D(2,8);
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p2.distancia(p1));
    }
}
