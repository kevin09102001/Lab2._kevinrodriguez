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
                        int opc2 = 0;
                        char resp='s';
                        while (resp=='s' || resp=='S') {
                            System.out.println("1) Reporte 1");
                            System.out.println("2) Reporte 2");
                            System.out.println("3) Reporte 3");
                            System.out.println("4) Reporte 4");
                            System.out.println("Ingrese la opcion que desee: ");
                            opc2 = leer.nextInt();
                            switch (opc2) {
                                case 1: {
                                    if (restaurant.size() >= 1) {
                                        System.out.println("Ingrese el estado que desea ver (Remodelacion, Demolición, o Funcional) : ");
                                        String estado = leer.next();
                                        ArrayList<restaurante> funcional = new ArrayList();
                                        for (int i = 0; i < restaurant.size(); i++) {
                                            if (((restaurante) restaurant.get(i)).getEstado_Del_Restaurante().equalsIgnoreCase(estado)) {
                                                funcional.add((restaurante) restaurant.get(i));
                                            }
                                        }
                                        for (int i = 0; i < funcional.size(); i++) {
                                            System.out.println(i+") "+funcional);
                                        }
                                    } else {
                                        System.out.println("No hay ningun restaurante a listar. ");
                                    }
                                }
                                break;
                                case 2: {
                                   if (restaurant.size() >= 1) {
                                        ArrayList<restaurante> premiun = new ArrayList();
                                        for (int i = 0; i < restaurant.size(); i++) {
                                            if (((restaurante) restaurant.get(i)).getES().equalsIgnoreCase("Premiun")) {
                                            premiun.add((restaurante) restaurant.get(i));
                                            }
                                        }
                                        for (int i = 0; i < premiun.size(); i++) {
                                            if (premiun.get(i)==restaurant.get(1) &&premiun.get(i)==restaurant.get(2 )&& premiun.get(i)==restaurant.get(9)) {
                                                System.out.println(premiun);
                                            }
                                       }
                                    } else {
                                        System.out.println("No hay ningun restaurante a listar. ");
                                    } 
                                }
                                break;
                                case 3:{
                                    
                                }
                                break;
                                case 4:{
                                    
                            }
                                break;
                            } 
                            System.out.println("Desea ver otro reporte[S/N]: ");
                            resp=leer.next().charAt(0);
                         }
                    }
                    break;
                    case 2: {
                        int opc1 = 0;
                        while (opc1 != 5) {
                            System.out.println("1 Crear\n"
                                    + "2 Listar\n"
                                    + "3 Modificar\n"
                                    + "4 Eliminar\n"
                                    + "5 salir");
                            System.out.println("Ingrese la opcion: ");
                            opc1 = leer.nextInt();
                            switch (opc1) {
                                case 1: {
                                    int cantm = 0;
                                    String nombre = null;
                                    String especi = null;
                                    String tipores = null;
                                    System.out.println("Ingrese nombre de la franquisia: ");
                                    String fran = leer.next();
                                    System.out.println("Ingrese el nombre del restaurante: ");
                                    String res = leer.next();
                                    System.out.println("Ingrese la ubicacion: ");
                                    String ubic = leer.next();
                                    System.out.println("Ingrese cantidad de empleados: ");
                                    int cant = leer.nextInt();
                                    System.out.println("Tiene parqueo mas de 30 carros [S/N]");
                                    char resp = leer.next().charAt(0);
                                    System.out.println("Tiene Area de juegos [S/N]");
                                    char resp2 = leer.next().charAt(0);
                                    if (resp == 'S' || resp == 's' && resp2 == 'S' || resp2 == 's') {
                                        tipores = "Premiun";
                                    } else if (resp2 == 'N' || resp2 == 'n' && resp == 'N' || resp == 'n') {
                                        tipores = "No es premiun";
                                    } else if (resp == 'S' || resp == 's' && resp2 == 'N' || resp2 == 'n') {
                                        tipores = "No es premiun";
                                    } else if (resp == 'N' || resp == 'n' && resp2 == 'S' || resp2 == 's') {
                                        tipores = "No es premiun";
                                    }
                                    System.out.println("Ingrese cantidad de cajeros: ");
                                    int cantc = leer.nextInt();
                                    System.out.println("Ingrese el Estado del restaurante: \n");
                                    System.out.println("1) Funcional\n"
                                            + "2) Remodelacion\n"
                                            + "3) Demolicion ");
                                    System.out.println("Ingrese una opcion: ");
                                    int opce = leer.nextInt();
                                    String estado = null;
                                    switch (opce) {
                                        case 1:
                                            estado = "Funcional";
                                            System.out.println("Ingrese cantidad de mesas: ");
                                            cantm = leer.nextInt();
                                            System.out.println("Ingrese el nombre del gerente: ");
                                            nombre = leer.next();
                                            System.out.println("Ingrese la especialidad del restaurante: ");
                                            especi = leer.next();
                                            break;
                                        case 2:
                                            estado = "Remodelacion";
                                            break;
                                        case 3:
                                            estado = "Demolicion";
                                            break;
                                        default:
                                            System.out.println("Ingreso la opcion incorrecta ");
                                    }
                                    restaurante s = new restaurante(fran, res, ubic, cant, tipores, cantc, estado, cantm, nombre, especi);
                                    restaurant.add(s);
                                }
                                break;
                                case 2: {
                                    String mostrar = " ";
                                    if (restaurant.size() >= 1) {
                                        for (Object t : restaurant) {
                                            if (t instanceof restaurante) {
                                                mostrar += restaurant.indexOf(t) + "- " + t + "\n";
                                            }
                                        }//fin del for
                                        System.out.println(mostrar);
                                    } else {
                                        System.out.println("No hay ningun restaurante a listar. ");
                                    }
                                }
                                break;
                                case 3:
                                    int opc2 = 0;
                                    while (opc2 != 10) {
                                        System.out.println("1) Modificar franquicia\n"
                                                + "2) Modificar nombre del restuarante\n"
                                                + "3) Modificar ubicacion del restaurante\n"
                                                + "4) Modificar la cantidad de empleados\n"
                                                + "5) Modificar si es Premium o no"
                                                + "6) Modificar cantidad de cajeros\n"
                                                + "7-Modificar cantidad de empleados\n"
                                                + "8) Modificar nombre del gerente\n"
                                                + "9) Modificar la especialidad del restaurante\n"
                                                + "10) Salir\n");
                                        System.out.println("Ingrese la opcion que desea: ");
                                        opc2 = leer.nextInt();
                                        switch (opc2) {
                                            case 1:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int poc1 = leer.nextInt();
                                                if (restaurant.get(poc1) instanceof restaurante) {
                                                    System.out.println("Ingrese la nueva Franquicia");
                                                    String franqui1 = leer.next();
                                                    ((restaurante) restaurant.get(poc1)).setNombre_Franquicia(franqui1);
                                                } else {
                                                    System.out.println("La posicion no se puede modificar");
                                                }//fin del else
                                                break;
                                            case 2:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int poc2 = leer.nextInt();
                                                if (restaurant.get(poc2) instanceof restaurante) {
                                                    System.out.println("Ingrese el nuevo nombre del restaurante");
                                                    String nombr1 = leer.next();
                                                    ((restaurante) restaurant.get(poc2)).setNombre_restaurante(nombr1);
                                                } else {
                                                    System.out.println("La posicion no se puede modificar");
                                                }//fin del else
                                                break;
                                            case 3:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int poc3 = leer.nextInt();
                                                if (restaurant.get(poc3) instanceof restaurante) {
                                                    System.out.println("Ingrese la nueva ubicacion");
                                                    String ubica1 = leer.next();
                                                    ((restaurante) restaurant.get(poc3)).setUbicacion(ubica1);
                                                } else {
                                                    System.out.println("La posicion no se puede modificar");
                                                }//fin del else
                                                break;
                                            case 4:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int poc4 = leer.nextInt();
                                                if (restaurant.get(poc4) instanceof restaurante) {
                                                    System.out.println("Ingrese la nueva cantidad de empleados");
                                                    int new_cante = leer.nextInt();
                                                    ((restaurante) restaurant.get(poc4)).setCantidad_empleados(new_cante);
                                                } else {
                                                    System.out.println("La posicion no se puede modificar");
                                                }//fin del else
                                                break;
                                            case 5:
                                                String resp1 = "";
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int poc5 = leer.nextInt();
                                                if (restaurant.get(poc5) instanceof restaurante) {
                                                    System.out.println("Tiene parqueo mas de 30 carros [S/N]");
                                                    char resp = leer.next().charAt(0);
                                                    System.out.println("Tiene Area de juegos [S/N]");
                                                    char resp2 = leer.next().charAt(0);
                                                    if (resp == 'S' || resp == 's' && resp2 == 'S' || resp2 == 's') {
                                                        resp1 = "Premiun";
                                                    } else if (resp2 == 'N' || resp2 == 'n' && resp == 'N' || resp == 'n') {
                                                        resp1 = "No es premiun";
                                                    } else if (resp == 'S' || resp == 's' && resp2 == 'N' || resp2 == 'n') {
                                                        resp1 = "No es premiun";
                                                    } else if (resp == 'N' || resp == 'n' && resp2 == 'S' || resp2 == 's') {
                                                        resp1 = "No es premiun";
                                                    }//fin de las condiciones
                                                    ((restaurante) restaurant.get(poc5)).setES(resp1);
                                                } else {
                                                    System.out.println("La posicion no se puede modificar");
                                                }//fin del else
                                                break;
                                            case 6:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int poc6 = leer.nextInt();
                                                if (restaurant.get(poc6) instanceof restaurante) {
                                                    System.out.println("Ingrese nueva cantidad de cajeros");
                                                    int cajer1 = leer.nextInt();
                                                    ((restaurante) restaurant.get(poc6)).setCantidad_De_Cajeros(cajer1);
                                                } else {
                                                    System.out.println("La posicion no se puede modificar");
                                                }//fin del else
                                                break;
                                            case 7:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int poc7 = leer.nextInt();
                                                if (restaurant.get(poc7) instanceof restaurante) {
                                                    System.out.println("Ingrese la nueva cantidad de mesas");
                                                    int mesas1 = leer.nextInt();
                                                    ((restaurante) restaurant.get(poc7)).setCantidad_mesas(mesas1);
                                                } else {
                                                    System.out.println("La posicion no se puede modificar");
                                                }//fin del else
                                                break;
                                            case 8:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int poc8 = leer.nextInt();
                                                if (restaurant.get(poc8) instanceof restaurante) {
                                                    System.out.println("Ingrese el nuevo nombre del gerente");
                                                    String geren1 = leer.next();
                                                    ((restaurante) restaurant.get(poc8)).setNombre_De_Gerente(geren1);
                                                } else {
                                                    System.out.println("La posicion no se puede modificar");
                                                }//fin del else
                                                break;
                                            case 9:
                                                System.out.println("ingrese la posicion del producto a modificar");
                                                int poc9 = leer.nextInt();
                                                if (restaurant.get(poc9) instanceof restaurante) {
                                                    System.out.println("Ingrese la nueva especialidad del gerente");
                                                    String restau1 = leer.next();
                                                    ((restaurante) restaurant.get(poc9)).setEspecialidad_del_Restaurante(restau1);
                                                } else {
                                                    System.out.println("La posicion no se puede modificar");
                                                }//fin del else
                                                break;
                                        }//fin del switch d las opciones
                                    }//fin del while 
                                    break;
                                case 4: {
                                    if (restaurant.size() >= 1) {
                                        System.out.println("Ingrese la posicion que desea eliminar: ");
                                        int posic = leer.nextInt();
                                        if (restaurant.get(posic) instanceof restaurante) {
                                            restaurant.remove(posic);
                                        } else {
                                            System.out.println("La posicion ingresada no es valida");
                                        }//fin del else
                                    } else {
                                        System.out.println("No hay ningun restaurante a eliminar. ");
                                    }
                                }

                                break;
                            }
                        }
                    }
                    break;
                    case 3: {
                        System.out.println("Adios");
                    }
                    break;
                }
            }
        } else {
            System.out.println("Usuario o contraseña incorrecta");
        }
    }
}
