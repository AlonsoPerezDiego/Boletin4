package boletín.pkg4.pkg2;

import javax.swing.JOptionPane;

/** @author dalonsoperez*/
public class Boletín42 {

    public static void main(String[] args) {
        
        Satelite orbita = new Satelite();
        orbita.setVariables(Double.parseDouble(JOptionPane.showInputDialog("El meridiano sobre el que está el satélite es:")), Double.parseDouble(JOptionPane.showInputDialog("El paralelo sobre el que está el satélite es:")),Double.parseDouble(JOptionPane.showInputDialog("La altura a la que se localiza el satélite es:")));
        orbita.verPosicion();
    }
    
}
