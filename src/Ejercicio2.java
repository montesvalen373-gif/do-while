import javax.swing.*;

public class Ejercicio2 {
    public static void main (String[] args){

        int sumaPuntos = 0;

        do {
            String entrada = JOptionPane.showInputDialog("Puntos actuals: " + sumaPuntos + "\ningrese los puntos a sumar:");

            int puntos = Integer.parseInt(entrada);
            sumaPuntos += puntos;

        } while (sumaPuntos < 100);

        JOptionPane.showMessageDialog(null, "¡Felicidades! Alcanzaste la meta con " + sumaPuntos + " puntos");
    }
}
