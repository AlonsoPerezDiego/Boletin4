/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg4.pkg2;

public class Satelite {
private double meridiano ;
private double paralelo;
private double distanciaTerra ;


public Satelite ( ) {
meridiano = 0;
paralelo = 0;
distanciaTerra = 0 ;
}

public Satelite ( double m, double p , double d ) {
meridiano = m ;
paralelo = p;
distanciaTerra = d ;
}

public void setVariables(double m, double p, double h){
 meridiano = m;
 paralelo = p;
 distanciaTerra = h;
}
public void verPosicion ( ) {
System.out.println ("O satélite atopase no paralelo "+ paralelo + " meridiano " + meridiano + " a unha distancia da superficie da terra de " + distanciaTerra + "km.");
}

}
