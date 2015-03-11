
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
public class Reserva {
    private Huesped huesped;
    private Habitacion habitacion;
    private Date fechaInicio;
    private Date fechaFin;

    public Reserva(Huesped h, Habitacion hab, Date fIni, Date fFin) {
        this.huesped=h;
        this.habitacion=hab;
        this.fechaFin=fFin;
        this.fechaInicio=fIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }
}
