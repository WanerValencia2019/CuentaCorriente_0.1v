package cuenta;

import java.util.Random;

public class CuentaCorriente {
    private String nombre,apellidos,direccion,telefono;
    private String cedula,contraseña;
    Random random=new Random();
    private int n_cuenta=random.nextInt(1000);
    private Double saldo=0.0;


    public CuentaCorriente(String nombre, String apellidos, String direccion, String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
