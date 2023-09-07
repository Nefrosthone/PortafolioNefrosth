import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Object[] options = {"Convertir Divisas", "Convertir Temperaturas", "SALIR"};
        int elige = JOptionPane.showOptionDialog(null, "¿Qué quieres hacer?", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if (elige == 2) {
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }
        if (elige == 0) {
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = {
                    "Soles a Euros",
                    "Soles a Dólares",
                    "Soles a Libras Esterlinas",
                    "Soles a Yen",
                    "Soles a Won"
                };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una Opción", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                String input = JOptionPane.showInputDialog(null, "Ingrese Cantidad de Soles:");
                double soles;
                try {
                    soles = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    continue;
                }

                // Aquí se empieza a escribir la lógica para convertir las divisas
                continuarPrograma = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Confirmación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

                if (cambio.equals("Soles a Euros")) {
                    double euros = soles / 3.97;
                    JOptionPane.showMessageDialog(null, soles + " Soles peruanos son: " + formatearDivisa.format(euros) + " Euros.");
                
                } else if (cambio.equals("Soles a Dólares")) {
                    double dolares = soles / 3.68;
                    JOptionPane.showMessageDialog(null, soles + " Soles peruanos son: " + formatearDivisa.format(dolares) + " Dolares.");
               
                } else if (cambio.equals("Soles a Libras Esterlinas")) {
                    double libras = soles / 5.38;
                    JOptionPane.showMessageDialog(null, soles + " Soles peruanos son: " + formatearDivisa.format(libras) + " Libras Esterlinas.");
               
                } else if (cambio.equals("Soles a Yen")) {
                    double yen = soles / 0.025;
                    JOptionPane.showMessageDialog(null, soles + " Soles peruanos son: " + formatearDivisa.format(yen) + " Yen.");
                
                } else if (cambio.equals("Soles a Won")) {
                    double won = soles / 0.0028;
                    JOptionPane.showMessageDialog(null, soles + " Soles peruanos son: " + formatearDivisa.format(won) + " Won.");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar el programa?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirma == JOptionPane.NO_OPTION  || confirma == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
        else if (elige == 1) {
            DecimalFormat formatearTemperatura = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = {
                    "Celsius a Fahrenheit",
                    "Fahrenheit a Celsius"
                };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una Opción", "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura:");
                double temperatura;
                try {
                    temperatura = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    continue;
                }

                // Aquí se empieza a escribir la lógica para convertir la temperatura
                continuarPrograma = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Confirmación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

                if (cambio.equals("Celsius a Fahrenheit")) {
                    double fahrenheit = (temperatura * 9/5) + 32;
                    JOptionPane.showMessageDialog(null, temperatura + " grados Celsius son: " + formatearTemperatura.format(fahrenheit) + " grados Fahrenheit.");
                
                } else if (cambio.equals("Fahrenheit a Celsius")) {
                    double celsius = (temperatura - 32) * 5/9;
                    JOptionPane.showMessageDialog(null, temperatura + " grados Fahrenheit son: " + formatearTemperatura.format(celsius) + " grados Celsius.");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar el programa?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirma == JOptionPane.NO_OPTION  || confirma == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
    }
}
