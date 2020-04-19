package com.ORFA.x00038619;

//Le descuentan solamente renta pero en todos los casos (gane lo que gane)
public class ServicioProfesional extends Empleado
{
    private int mesesContraro;

    public ServicioProfesional(String nombre, String puesto, double salario, int mesesContraro)
    {
        super(nombre, puesto, salario);
        this.mesesContraro = mesesContraro;
    }

    public int getMesesContraro()
    {
        return mesesContraro;
    }

    public void setMesesContraro(int mesesContraro)
    {
        this.mesesContraro = mesesContraro;
    }
}
