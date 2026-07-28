import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args){

        double tarifaHora = 2000;
        int hora ;

        do {
            String entrada = JOptionPane.showInputDialog("Ingrese la cantidad de horas estacionado (1 a 24 horas):");

            hora = Integer.parseInt(entrada);

            if (hora < 1 || hora > 24){

                JOptionPane.showMessageDialog(null, "Tiempo no válido. Ingrese un valor entre 1 y 24 horas.");

            }
        }while (hora < 1 || hora > 24);

        double totalpago = hora * tarifaHora;

        JOptionPane.showMessageDialog(null, "--- TICKET DE PARQUEADERO ---" + "\nHoras estacionado: " + hora + " h\n" + "Tarifa por hora: $" + tarifaHora + "\n" + "Total a pagar: $" + totalpago);
    }
}
