package Entidades;

public class Persona {
    private int edad;
    private String nombre;
    private String apellido;
    private String dni;

    public Persona() {
    }
    
    public Persona(int edad, String nombre, String apellido, String dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "La edad de " + nombre + apellido + "  es de " + edad +" años. Su DNI es: " + dni;
    }
    
}
