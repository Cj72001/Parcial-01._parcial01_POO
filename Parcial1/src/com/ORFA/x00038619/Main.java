package com.ORFA.x00038619;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {

        byte op = 0;
        String nombre, puesto;
        double salario=0;

        do
        {
            op = (byte) Integer.parseInt(JOptionPane.showInputDialog(null, menu()));
            switch (op)
            {
                case 0: break;
                case 1:
                    //Servicio Profesional
                    nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                    puesto = JOptionPane.showInputDialog(null, "Puesto: ");
                    salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: "));
                    int mesesContrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses de contrato: "));
                    //Creando objeto tipo servicioProfesional
                    ServicioProfesional servicioProfesional = new ServicioProfesional(nombre, puesto, salario, mesesContrato);
                    JOptionPane.showMessageDialog(null, "Salario Final: "+CalculadoraImpuestos.calcularPago(servicioProfesional)+"$");
                    //Metodo (mostrarTotales) de clase (CalculadoraImpuestos)
                    CalculadoraImpuestos.mostrarTotales();

                    break;

                case 2:
                    //Plaza
                    nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                    puesto = JOptionPane.showInputDialog(null, "Puesto: ");
                    salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: "));
                    int extension = Integer.parseInt(JOptionPane.showInputDialog(null, "Extension: "));
                    //Creando objeto tipo PlazaFija
                    PlazaFija plazaFija1 = new PlazaFija(nombre, puesto, salario, extension);
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
