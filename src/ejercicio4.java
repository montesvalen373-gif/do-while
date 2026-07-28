import javax.swing.*;

public class ejercicio4 {
    public static void main (String[] args){

        double saldoTarjeta = 5000.0;
        double recarga ;

        do {

            String entrada = JOptionPane.showInputDialog("Saldo actual: $" + saldoTarjeta + "\n ingrese el monto a recargar" + "\n(Mínimo $2000 - Máximo $100000):");

            recarga = Double.parseDouble(entrada);

            if (recarga < 2000 || recarga > 100000){
                JOptionPane.showMessageDialog(null,"Monto no permitido." + "\nla recarga debe ser entre $2.000 y $100.000 pesos");
            }

        }while (recarga < 2000 || recarga > 100000);

        saldoTarjeta += recarga;

        JOptionPane.showMessageDialog(null, "\n¡Recarga exitosa!" + "\nMonto recargado: $" + recarga + "\nnuevo saldo disponible: $" + saldoTarjeta);
    }
}
