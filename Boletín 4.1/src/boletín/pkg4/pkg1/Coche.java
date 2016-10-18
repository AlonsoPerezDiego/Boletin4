package boletín.pkg4.pkg1;

import javax.swing.JOptionPane;

public class Coche {
    
    private int velocidad, aceleracion, frenado;
    
    public Coche(){
        velocidad =0;
        aceleracion = 0;
        frenado = 0;
    }
    
    public Coche (int v, int a, int f){
        velocidad = v;
        aceleracion = a;
        frenado = f;
    }

    public void setVelocidad(int v){
        velocidad = v;
    }

    public void setAceleracion(int a) {
        aceleracion = a;
    }

    public void setFrenado(int f) {
        frenado = f;
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "La velocidad tras haber acelerado " + aceleracion + "km/h y/o frenado " + frenado + "km/h es igual a " + (velocidad + aceleracion - frenado) + "km/h.");
    }
    
}