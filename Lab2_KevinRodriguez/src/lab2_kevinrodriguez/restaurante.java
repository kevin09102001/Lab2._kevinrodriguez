/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class restaurante {
    private String Nombre_Franquicia;
    private String Nombre_restaurante;
    private String Ubicacion;
    private int Cantidad_empleados;
    private String ES;
    private int Cantidad_De_Cajeros;
    private String Estado_Del_Restaurante;
    private int Cantidad_mesas;
    private String Nombre_De_Gerente;  
    private String Especialidad_del_Restaurante;
    

    public restaurante() {
    }

    public restaurante(String Nombre_Franquicia, String Nombre_restaurante, String Ubicacion, int Cantidad_empleados, String ES, int Cantidad_De_Cajeros, String Estado_Del_Restaurante, int Cantidad_mesas, String Nombre_De_Gerente, String Especialidad_del_Restaurante) {
        this.Nombre_Franquicia = Nombre_Franquicia;
        this.Nombre_restaurante = Nombre_restaurante;
        this.Ubicacion = Ubicacion;
        this.Cantidad_empleados = Cantidad_empleados;
        this.ES = ES;
        this.Cantidad_De_Cajeros = Cantidad_De_Cajeros;
        this.Estado_Del_Restaurante = Estado_Del_Restaurante;
        this.Cantidad_mesas = Cantidad_mesas;
        this.Nombre_De_Gerente = Nombre_De_Gerente;
        this.Especialidad_del_Restaurante = Especialidad_del_Restaurante;
    }

    public String getNombre_Franquicia() {
        return Nombre_Franquicia;
    }

    public void setNombre_Franquicia(String Nombre_Franquicia) {
        this.Nombre_Franquicia = Nombre_Franquicia;
    }

    public String getNombre_restaurante() {
        return Nombre_restaurante;
    }

    public void setNombre_restaurante(String Nombre_restaurante) {
        this.Nombre_restaurante = Nombre_restaurante;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public int getCantidad_empleados() {
        return Cantidad_empleados;
    }

    public void setCantidad_empleados(int Cantidad_empleados) {
        this.Cantidad_empleados = Cantidad_empleados;
    }

    public String getES() {
        return ES;
    }

    public void setES(String ES) {
        this.ES = ES;
    }

    public int getCantidad_De_Cajeros() {
        return Cantidad_De_Cajeros;
    }

    public void setCantidad_De_Cajeros(int Cantidad_De_Cajeros) {
        this.Cantidad_De_Cajeros = Cantidad_De_Cajeros;
    }

    public String getEstado_Del_Restaurante() {
        return Estado_Del_Restaurante;
    }

    public void setEstado_Del_Restaurante(String Estado_Del_Restaurante) {
        this.Estado_Del_Restaurante = Estado_Del_Restaurante;
    }

    public int getCantidad_mesas() {
        return Cantidad_mesas;
    }

    public void setCantidad_mesas(int Cantidad_mesas) {
        this.Cantidad_mesas = Cantidad_mesas;
    }

    public String getNombre_De_Gerente() {
        return Nombre_De_Gerente;
    }

    public void setNombre_De_Gerente(String Nombre_De_Gerente) {
        this.Nombre_De_Gerente = Nombre_De_Gerente;
    }

    public String getEspecialidad_del_Restaurante() {
        return Especialidad_del_Restaurante;
    }

    public void setEspecialidad_del_Restaurante(String Especialidad_del_Restaurante) {
        this.Especialidad_del_Restaurante = Especialidad_del_Restaurante;
    }

    @Override
    public String toString() {
        return "restaurante{" + "Nombre_Franquicia=" + Nombre_Franquicia + ", Nombre_restaurante=" + Nombre_restaurante + ", Ubicacion=" + Ubicacion + ", Cantidad_empleados="
                + Cantidad_empleados + "\n, ES=" + ES + ", Cantidad_De_Cajeros=" + Cantidad_De_Cajeros + ",Estado_Del_Restaurante=" + Estado_Del_Restaurante + 
                ",\nCantidad_mesas=" + Cantidad_mesas + ", Nombre_De_Gerente=" + Nombre_De_Gerente + ", Especialidad_del_Restaurante=" + Especialidad_del_Restaurante + '}';
    }
}