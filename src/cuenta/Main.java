package cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner write=new Scanner(System.in);
        byte opc=0;
        while (opc!=5){
            System.out.println(">>>>>>>>>>>>>> BIENVENIDO AL FUTURO <<<<<<<<<<<<<<");
            System.out.println("1. Crear Cuenta");
            System.out.println("5. Salir");
            System.out.print("Opción-->");
            opc=write.nextByte();
            switch (opc){
                case 1:
                    Byte menu=0;
                    String nombre,apellidos,direccion,telefono,cedula,contraseña;
                    write.nextLine();
                    System.out.print("Nombre: ");
                    nombre=write.nextLine();
                    System.out.print("Apellidos: ");
                    apellidos=write.nextLine();
                    System.out.print("Dirección: ");
                    direccion=write.nextLine();
                    System.out.print("Telefono: ");
                    telefono=write.nextLine();
                    Cajero cliente=new Cajero(nombre,apellidos,direccion,telefono);
                    //numero de cedula
                    System.out.print("Cedula: ");
                    cedula=write.nextLine();
                    cliente.setCedula(cedula);
                    System.out.println("\nCuenta creada Con exito");
                    //contraseña
                    System.out.print("Establece una contraseña: ");
                    contraseña=write.nextLine();
                    cliente.setContraseña(contraseña);
                    while (menu!=5) {
                        System.out.println("\n!------------------- MENÚ -------------------!\n");
                        System.out.println("1. Consultar Saldo");
                        System.out.println("2. Ingresar Dinero");
                        System.out.println("3. Retirar Dinero");
                        System.out.println("4. Información de la cuenta");
                        System.out.println("5. Salir");
                        System.out.print("Opción-->");
                        menu = write.nextByte();
                        if (menu == 1) {
                            cliente.saldo();
                        }
                        if (menu == 2) {
                            contraseña = cliente.PedirContraseña();
                            if (cliente.VerificarContraseña(contraseña)) {
                                System.out.print("Ingrese la cantidad de dinero a depositar: ");
                                double dinero = write.nextDouble();
                                cliente.ingresarDinero(dinero);
                            }else{
                                System.out.println("Contraseña incorrecta");
                            }
                        }
                        if (menu == 3) {
                            contraseña = cliente.PedirContraseña();
                            if (cliente.VerificarContraseña(contraseña)) {
                                System.out.print("Ingrese la cantidad de dinero que desea retirar: ");
                                double dinero = write.nextDouble();
                                cliente.retirarDinero(dinero);
                            }else {
                                System.out.println("Contraseña incorrecta");
                            }
                        }
                        if(menu==4){
                            contraseña=cliente.PedirContraseña();
                            if(cliente.VerificarContraseña(contraseña)){
                                cliente.informacion();
                            }else{
                                System.out.println("Contraseña incorrecta");
                            }
                        }
                    }
                    break;
                case 5:
                    opc=5;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }
}
