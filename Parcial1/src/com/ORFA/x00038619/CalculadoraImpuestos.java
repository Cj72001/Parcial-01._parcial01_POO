package com.ORFA.x00038619;

//Clase estatica
public final class CalculadoraImpuestos
{
    //Atributo estaticos.
    private static double totalRenta, totalISSS, totalAFP;

    private CalculadoraImpuestos(){}

    //Sugerencia: utilizar 'instanceof' en el metodo calcularPago
    //Ya que depende del tipo de Empleado

    //Metodo que retornara el salario menos renta, ISSS, AFP. Dependiendo del tipo de empleado
    public static double calcularPago  (Empleado empleado) //Variable de tipo objeto
    {
        //Servicio Profesional
        totalRenta = empleado.salario * 0.1;
        empleado.setSalario(empleado.salario - totalRenta);
        return empleado.getSalario();

        //PlazaFija
        double Resatante = 0;
        totalAFP = empleado.salario * 0.0625;
        totalISSS = empleado.salario * 0.03;
        Resatante = (empleado.salario - totalAFP - totalISSS);

        //Falta calcular renta...
    }

    public static void mostrarTotales()//mostrar totales de AFP, ISSS, RENTA
    {

    }

}
