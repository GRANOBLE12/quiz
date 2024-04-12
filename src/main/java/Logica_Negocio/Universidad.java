/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1059356842
 */
public class Universidad implements IUniversidad{
    public String Nombre;
    public ArrayList<Persona> lspersonas;
 
    
    public Universidad(){
        
    }

    public Universidad(String Nombre, ArrayList<Persona> lspersonas) {
        this.Nombre = Nombre;
        this.lspersonas = lspersonas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Persona> getLspersonas() {
        return lspersonas;
    }

    public void setLspersonas(ArrayList<Persona> lspersonas) {
        this.lspersonas = lspersonas;
    }

    @Override
    public String MostarPersona() {
        
    }

    @Override
    public void MostrarPersonas() {
        
    }
    
} 