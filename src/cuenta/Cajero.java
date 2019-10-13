package cuenta;


import java.util.Scanner;

public class Cajero extends CuentaCorriente{
    public Cajero(String nombre, String apellidos, String direccion, String telefono) {
        super(nombre, apellidos, direccion, telefono);
    }
    public boolean VerificarContraseña(String contraseña){
        boolean coinciden=false;
        if(this.getContraseña().equals(contraseña.trim())){
            return coinciden=true;
        }else{
        return coinciden;
        }
    }
    public String PedirContraseña(){
        Scanner write=new Scanner(System.in);
        String contraseña;
        System.out.println("Digita la contraseña: ");
        contraseña=write.nextLine();
        if(contraseña.equals(this.getContraseña())){
            return contraseña;
        }else{
            return "";
        }
    }
    public void ingresarDinero(double cantidad){
        this.setSaldo(this.getSaldo()+cantidad);
    }
    public void retirarDinero(double cantidad){
        if(!(saldoNegativo(cantidad))) {
            this.setSaldo(this.getSaldo() - cantidad);
        }else{
            System.out.println("Sr "+this.getNombre()+ " La cantidad de dinero que desea retirar, excede el monto permitido\n"+" por favor ingrese un valor valido");
        }
    }
    public boolean saldoNegativo(double dinero){
        if(dinero>getSaldo()){
            return true;
        }else {
            return false;
        }
    }
    public void informacion(){
        System.out.println("<-------------- DATOS PERSONALES ------------------->\n");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellidos: "+this.getApellidos());
        System.out.println("Identificación: "+this.getCedula());
        System.out.println("Telefono: "+this.getTelefono());
        System.out.println("Dirección: "+this.getDireccion());
        System.out.println("N° de cuenta: "+ this.getN_cuenta());
        System.out.println("Saldo en la cuenta: "+this.getSaldo());
    }
    public void saldo(){
        System.out.println("Sr "+this.getNombre()+ " su cuenta con un saldo de: $"+this.getSaldo());
    }

}
