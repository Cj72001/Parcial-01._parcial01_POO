//Invariante: Salario >=0
package com.ORFA.x00038619;

import javax.swing.*;

//Clase estatica
public final class CalculadoraImpuestos
{
    //Atributos de clase
    private static double totalRenta, totalISSS, totalAFP;

    private CalculadoraImpuestos(){}

    public static double calcularPago  (Empleado empleado) throws NegativeNumberExeption //Variable de tipo objeto
    {
        //Invariante: Salario < 0
        if (empleado.salario<0)
            throw new NegativeNumberExeption("LA CANTIDAD ES MENOR A 0");

        //if para tipo de empleado
        if (empleado instanceof ServicioProfesional)
        {
            /**Servicio Profesional*/
            totalRenta = empleado.salario * 0.1;
            empleado.setSalario(empleado.salario - totalRenta);
            return empleado.getSalario();
        }
        else
        {

            /**Plaza Fija*/
            double Resatante = 0;
            totalAFP = empleado.salario * 0.0625;
            totalISSS = empleado.salario * 0.03;
            Resatante = (empleado.salario - totalAFP - totalISSS);


            //Calcular renta
            //Rango A:
            if (Resatante >= 0.01 && Resatante <= 472.00) {
                empleado.setSalario(Resatante);

            }

            //Rango B:
            else if (Resatante <= 472.01 && Resatante <= 895.24) {
                totalRenta = 0.1 * (Resatante - 472) + 17.67;
                empleado.setSalario(Resatante - totalRenta);
            }

            //Rango C:
            else if (Resatante >= 895.25 && Resatante <= 2038.10) {
                totalRenta = 0.2 * (Resatante - 895.24) + 60;
                empleado.setSalario(Resatante - totalRenta);
            }

            //Rango D:
            else if (Resatante >= 2038.11) {
                totalRenta = 0.3 * (Resatante - 2038.10) + 288.57;
                empleado.setSalario(Resatante - totalRenta);
            }
            return empleado.getSalario();
        }
    }


    public static void mostrarTotales()//mostrar totales de AFP, ISSS, RENTA
    {
        JOptionPane.showMessageDialog(null, "AFP: "+ totalAFP +"$\nISSS: "+totalISSS+"$\nRenta: "+totalRenta+"$");

    }


}
