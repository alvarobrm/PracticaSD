
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvaroberrocal
 */
public class Huesped {
    private String nombre;
    private String apellidos;
    private String nif;
    private Date fechaNacimiento;
    private String direccion;
    private String localidad;
    private int codigoPostal;
    private String provincia;
    //Opcionales
    private String telefono;
    private String movil;
    private String email;
    
    public Huesped(){
        
    }
    
    public Huesped(String nombre, String apellidos, String nif, Date fechaNacimiento, String direccion,
            String localidad, int codigoPostal, String provincia, String telefono, String movil, 
            String email){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        if(telefono == null)
            this.telefono = null;
        else
            this.telefono = telefono;
        if(movil == null)
            this.movil = null;
        else 
            this.movil = movil;
        if(email == null)
            this.email = null;
        else
            this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
