package com.ORFA.x00038619;

import javax.swing.*;

public class Main
{

    public static void main(String[] args) throws NegativeNumberExeption {

        byte op = 0;
        
        do
        {
            op = (byte) Integer.parseInt(JOptionPane.showInputDialog(null, menu()));
            switch (op)
            {
                case 0: break;
                case 1:
                    //Servicio Profesional
                    //Creando objeto tipo servicioProfesional
                    ServicioProfesional servicioProfesional = new ServicioProfesional("Omar", "Accesor", 700, 5);
                    JOptionPane.showMessageDialog(null, "Salario Final: "+CalculadoraImpuestos.calcularPago(servicioProfesional)+"$");
                    //Metodo (mostrarTotales) de clase (CalculadoraImpuestos)
                    CalculadoraImpuestos.mostrarTotales();
                    break;

                case 2:
                    //PlazaFija
                    //Creando objeto tipo PlazaFija
                    PlazaFija plazaFija1 = new PlazaFija("Omar", "Ingeniero Informatico", 3000, 22881569);
                    JOptionPane.showMessageDialog(null, "Salario Final: "+CalculadoraImpuestos.calcularPago(plazaFija1)+"$");
                    //Metodo (mostrarTotales) de clase (CalculadoraImpuestos)
                    CalculadoraImpuestos.mostrarTotales();

                    break;

                default:JOptionPane.showMessageDialog(null, "Opcion erronea");
            }

        }while (op!=0);


    }

    public static String menu ()
    {
        return "1.Servicio Profesional\n2. Plaza fija\n0. Salir";
    }
}
