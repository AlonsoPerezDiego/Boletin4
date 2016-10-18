package boletín.pkg4.pkg1;

import javax.swing.JOptionPane;

/*@author dalonsoperez*/

public class Boletín41 {

    public static void main(String[] args) {
        
        Coche vehiculo = new Coche();
        vehiculo.setVelocidad(Integer.parseInt(JOptionPane.showInputDialog("La velocidad inicial es:")));
        vehiculo.setAceleracion(Integer.parseInt(JOptionPane.showInputDialog("La aceleración es de:")));
        vehiculo.setFrenado(Integer.parseInt(JOptionPane.showInputDialog("El frenado es igual a:")));
        vehiculo.mostrar();
        
    }
    
}
