package com.ORFA.x00038619;

//Le descuentan renta, AFP e ISSS
//Extension es el numero telefonico de su oficina
public class PlazaFija extends Empleado
{
    private int extension;

    public PlazaFija(String nombre, String puesto, double salario, int extension)
    {
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    public int getExtension()
    {
        return extension;
    }

    public void setExtension(int extension)
    {
        this.extension = extension;
    }
}
