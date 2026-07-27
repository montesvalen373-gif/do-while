import javax.swing.*;

public class Ejercicio1 {
    public static void main (String[] args){

        double temperatura ;

        do {
            temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura actual (°C):"));

            if (temperatura >= 80 ){

                JOptionPane.showMessageDialog(null, "Alerta: Temperatura elevada (" + temperatura + "°C)." + "Advertencia");

            }
        } while (temperatura >= 80);

        JOptionPane.showMessageDialog(null, "Temperatura estable (" + temperatura + "°C). Proceso finalizado.");

    }

}
