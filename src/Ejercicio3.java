import javax.swing.*;

public class Ejercicio3 {
    public  static void main (String[] args){

        int correcto = 2268;

        int ingresado;

        do {
            String entrada = JOptionPane.showInputDialog("Ingrese la clave de 4 dígitos:");
            ingresado = Integer.parseInt(entrada);

            if (ingresado != correcto) {

                JOptionPane.showInputDialog("Clave incorrecta. Intente de nuevo");
            }

        } while (ingresado != correcto);

        JOptionPane.showMessageDialog(null, "¡Acceso concedido!");
    }

}
