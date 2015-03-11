/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvaroberrocal
 */
public class Habitacion {
     private int numero;
    private Reserva reserva;

    public Habitacion(int numero, Reserva reserva) {
        this.numero=numero;
        this.reserva=reserva;
    }
    
    public boolean isReserved(){
        return(reserva==null);
    }
    

    public int getNumero() {
        return numero;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    } 

    
}
