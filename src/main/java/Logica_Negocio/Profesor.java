/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059356842
 */
public class Profesor extends Persona {
    public int Procesos_Realizados;
    
    public Profesor (){
        
    }

    public Profesor(int Procesos_Realizados) {
        this.Procesos_Realizados = Procesos_Realizados;
    }

    public Profesor(String Nombre, String Apellido, String Cedula, String Codigo,int Procesos_Realizados) {
        super(Nombre, Apellido, Cedula, Codigo);
        this.Procesos_Realizados = Procesos_Realizados;
    }

    public int getProcesos_Realizados() {
        return Procesos_Realizados;
    }

    public void setProcesos_Realizados(int Procesos_Realizados) {
        this.Procesos_Realizados = Procesos_Realizados;
    }
    
    
}
