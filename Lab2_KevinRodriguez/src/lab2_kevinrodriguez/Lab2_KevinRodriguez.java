/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_kevinrodriguez;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Lab2_KevinRodriguez {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList restaurant = new ArrayList();
        String usuario = "david";
        String contra = "99";
        int opc = 0;
        System.out.println("Ingrese su usuario: ");
        String usuario1 = leer.next();
        System.out.println("Ingrese su contraseña: ");
        String contra1 = leer.next();
        if (usuario1.equalsIgnoreCase(usuario) && contra1.equalsIgnoreCase(contra)) {
            while (opc != 3) {
                System.out.println("1 Reporte de restaurantes\n"
                                    + "2 Manejo de restaurantes\n"
                                    + "3 Salir. ");
                System.out.println("Ingrese la opcion: ");
                opc = leer.nextInt();
                switch (opc) {
                    case 1: {
                       
                    }
                    break;
                    case 2: {
                        int opc1=0;
                        while(opc1!=5){
                            System.out.println("1 Crear\n"
                                    + "2 Listar\n"
                                    + "3 Modificar\n"
                                    + "4 Eliminar\n"
                                    + "5 salir");
                            System.out.println("Ingrese la opcion: ");
                             opc1=leer.nextInt();
                            switch(opc1){
                                case 1:{
                                    int cantm = 0;
                                    String nombre=null;
                                    String especi=null;
                                    String tipores=null;
                                    System.out.println("Ingrese nombre de la franquisia: ");
                                    String fran=leer.next();
                                    System.out.println("Ingrese el nombre del restaurante: ");
                                    String res=leer.next();
                                    System.out.println("Ingrese la ubicacion: ");
                                    String ubic=leer.next();
                                    System.out.println("Ingrese cantidad de empleados: ");
                                    int cant=leer.nextInt();
                                    System.out.println("Tiene parqueo mas de 30 carros [S/N]");
                                    char resp=leer.next().charAt(0);
                                    System.out.println("Tiene Area de juegos [S/N]");
                                    char resp2=leer.next().charAt(0);
                                    if (resp=='S' || resp=='s' && resp2=='S' || resp2=='s') {
                                     tipores="Premiun";   
                                    }else if(resp2=='N' || resp2=='n' && resp=='N' || resp=='n'){
                                      tipores="No es premiun";
                                    }else if (resp=='S' || resp=='s' && resp2=='N' || resp2=='n'){
                                        tipores="No es premiun";
                                    }else if (resp=='N' || resp=='n' && resp2=='S' || resp2=='s') {
                                       tipores="No es premiun"; 
                                    }
                                    System.out.println("Ingrese cantidad de cajeros: ");
                                    int cantc=leer.nextInt();
                                    System.out.println("Ingrese el Estado del restaurante: \n");
                                    System.out.println("1) Funcional\n"+
                                                       "2) Remodelacin\n"+
                                                       "3) Demolicion ");
                                    System.out.println("Ingrese una opcion: ");
                                    int opce=leer.nextInt();
                                    String estado=null;
                                    switch(opce){
                                        case 1:
                                          estado="Funcional";
                                          System.out.println("Ingrese cantidad de mesas: ");
                                           cantm=leer.nextInt();
                                          System.out.println("Ingrese el nombre del gerente: ");
                                          nombre=leer.next();
                                          System.out.println("Ingrese la especialidad del restaurante: ");
                                          especi=leer.next();
                                        break;
                                        case 2:
                                            estado="Remodelacion";
                                        break;
                                        case 3:
                                          estado="Demolicion";
                                          break;
                                        default:
                                            System.out.println("Ingreso la opcion incorrecta ");
                                        }
                                    restaurante s=new restaurante(fran,res,ubic,cant,tipores,cantc,estado,cantm,nombre,especi);
                                    restaurant.add(s);
                                }
                                break;
                                case 2:{
                                      String mostrar = " ";
                                    for (Object t : restaurant) {
                                             if (t instanceof restaurante) {
                                            mostrar += restaurant.indexOf(t) + "- " + t + "\n";
                                        }
                                    }//fin del for
                                    System.out.println(mostrar);
                                }
                                break;
                                case 3:{
                                    
                                }
                                break;
                                case 4:{
                                     System.out.println("Ingrese la posicion que desea eliminar: ");
                                    int posic = leer.nextInt();
                                    if (restaurant.get(posic) instanceof restaurante) {
                                        restaurant.remove(posic);
                                    } else {
                                        System.out.println("La posicion ingresada no es valida");
                                    }//fin del else
                                }

                                break;   
                            }
                        }
                    }
                    break;
                    case 3: {

                    }
                    break;
                }
            }
        } else {
            System.out.println("Usuario o contraseña incorrecta");
        }
    }
}
