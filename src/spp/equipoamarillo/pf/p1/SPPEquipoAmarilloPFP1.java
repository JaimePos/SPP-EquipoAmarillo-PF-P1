
package spp.equipoamarillo.pf.p1;
import java.util.*;
import javax.swing.*;
public class SPPEquipoAmarilloPFP1 {

    public static void main(String[] args) {
        int x = 0;
        String result = "";
        
        x = pedirdato (" el numero de materias");
        
        String [][] materias = matriz(x);
        
        for (int i = 0; i < x; i++){
            for (int j = 0; j < 4; j++){
             result = materias [i][0] + " tiene promedio de " + promedio(materias, i) + "\t";   
            }JOptionPane.showMessageDialog(null, result);
        }
    }
    
    public static double promedio (String [][] matriz, int x){
        double calif1 = Double.parseDouble(matriz[x][1]);
        double calif2 = Double.parseDouble(matriz[x][2]);
        double calif3 = Double.parseDouble(matriz[x][3]);
        
        double calif = (calif1 + calif2 + calif3)/3;
        
        return calif;
    }
    
    public static String [][] matriz (int t){
        String [][] matriz = new String [t][4];
        int i = 0;
        
        do {
            matriz [i][0] = pedirmateria(i);
            for (int x = 1; x < 4; x++){
                matriz [i][x] = pedircalif(x);
            } i++;
        } while (i < t);
        return matriz;
    }
    
    public static int pedirdato (String mensaje) {
        boolean flag;
        int dato = 0;
            do{
                try{
                    String datoP = JOptionPane.showInputDialog(null, "Introduce" + mensaje);
                    dato = Integer.parseInt(datoP);
                    flag = false;
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Error, el dato no es un numero");
                flag = true;
                }
            } while (flag);
        return dato;
    }
    
    public static String pedirmateria (int x) {
        String materia = "";
        boolean flag;
            do{
                try{
                    materia = JOptionPane.showInputDialog(null, "Introduce tu materia numero " +  x);
                    flag = false;
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Error, el dato no es una materia");
                flag = true;
                }
            } while (flag);
        return materia;
    }
    
    public static String pedircalif (int x) {
        boolean flag;
        String califP = "";
            do{
                califP = JOptionPane.showInputDialog(null, "Introduce tu calificacion del parcial " +  x);
                try{    
                    double calif = Double.parseDouble(califP);
                    flag = false;
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Error, el dato no es una calificacion");
                flag = true;
                }
            } while (flag);
        return califP;
    }
    
    
}
