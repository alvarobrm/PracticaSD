/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sevlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import teamsBase.*;

/**
 *
 * @author alvaroberrocal
 */
public class cliente {
    List<Team> teams;
    
    public cliente(){
        teams= new ArrayList<Team>();
        make_teams();
    }
    public void make_teams() {
        
	Player casillas = new Player("Iker Casillas", "Casillas" );
	Player alonso = new Player("Xabier Alonso", "Alonso");
	Player ronaldo = new Player("Cristiano Ronaldo dos Santos", "Ronaldo");
	List<Player> jugMadrid = new ArrayList<Player>();
	jugMadrid.add(casillas);
	jugMadrid.add(alonso);

	jugMadrid.add(ronaldo);
	Team burns_and_allen = new Team("Real Madrid", jugMadrid);
	teams.add(burns_and_allen);

	Player pique = new Player("Gerard Piqué", "Piqué");
	Player iniesta = new Player("Andrés Iniesta", "Iniesta");
	Player messi = new Player("Leo Messi", "Messi");
	List<Player> jugBarca = new ArrayList<Player>();
	jugBarca.add(pique); 
	jugBarca.add(iniesta);
	jugBarca.add(messi);
	Team fcbarcelona = new Team("F.C. Barcelona", jugBarca);
	teams.add(fcbarcelona);
 }

    public static void main(String[] args) {
        URL url;
        HttpURLConnection conn;
        String ruta = "http://localhost:8080/EjerciciosTema4SD/ServletAplanador";
        cliente c=new cliente();
        try {
            url = new URL(ruta);
            conn = (HttpURLConnection) url.openConnection();
            InputStream is = conn.getInputStream();
            int codigo_http = conn.getResponseCode();
            if (codigo_http / 100 != 2) {
                System.out.println("Error HTTP " + codigo_http);
            } else {
                BufferedReader lector = new BufferedReader(new InputStreamReader(is));
                PrintStream consolaesp = new PrintStream(System.out, true, "ISO-8859-1");
                String respuesta = lector.readLine();
                consolaesp.println(respuesta);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
