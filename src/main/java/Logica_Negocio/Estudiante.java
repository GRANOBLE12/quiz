/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059356842
 */
public class Estudiante extends Persona {
    public double Nota;
    
    public Estudiante(){
        
    }

    public Estudiante(double Nota) {
        this.Nota = Nota;
    }

    public Estudiante(String Nombre, String Apellido, String Codigo, String Cedula,double Nota) {
        super(Nombre, Apellido, Codigo, Cedula);
        this.Nota = Nota;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }
    
    
}

