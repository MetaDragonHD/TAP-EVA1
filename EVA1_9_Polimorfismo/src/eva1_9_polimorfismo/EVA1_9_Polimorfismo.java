/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package eva1_9_polimorfismo;

/*--> Sergio Eduardo Lastiri Torres - 22550031 <--*/

public class EVA1_9_Polimorfismo
{
    static Persona perso1;
    static Persona perso2;
    public static void main(String[] args) 
    {
        Persona perso1 = new Persona();
        Persona perso2 = new Persona("Ruben","Hernandez",41);
        System.out.println(perso1);
        System.out.println(perso2);
        
        mensaje(perso1);
        mensaje(perso2);
    }
    public static void mensaje(Object obj)
    {
        System.out.println("Metodo mensaje");
        System.out.println(obj);
        if(obj == perso1)
        {
            System.out.println("perso1");
        }
        else
        {
            System.out.println("perso2");
        }
        //Persona perso = obj; no se puede porque son incompatibles
        Persona perso = (Persona)obj; // por herencia si se puede
        System.out.println(perso.getNombre()); 
        System.out.println(perso.getApellido()); 
        System.out.println(perso.getEdad()); 
                
    }
}

class Persona
{

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    private String nombre;
    private String apellido;
    private int edad;

    Persona() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }
}

