/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059356842
 */
public class Administrador extends Persona {
    public String Numero_materias;
    
    public Administrador(){
        
    }

    public Administrador(String Numero_materias) {
        this.Numero_materias = Numero_materias;
    }

    public Administrador(String Nombre, String Apellido, String Cedula, String Codigo,String Numero_materias) {
        super(Nombre, Apellido, Cedula, Codigo);
        this.Numero_materias = Numero_materias;
    }

    public String getNumero_materias() {
        return Numero_materias;
    }

    public void setNumero_materias(String Numero_materias) {
        this.Numero_materias = Numero_materias;
    }
    
}
