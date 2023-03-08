package EShop;

import java.time.LocalDateTime;

// Clase para "Persona"
public class Persona {
    private String nombre;
    private String apellido;
    private LocalDateTime fechaDeNacimiento;

    public Persona() {

    }

    // Constructor
    public Persona(String nomb, String apell) {
        this.nombre = nomb;
        this.apellido = apell;
        this.fechaDeNacimiento = LocalDateTime.now();
    }

    // Get y Set
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public LocalDateTime getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void setNombre(String nomb) {
        this.nombre = nomb;
    }

    public void setApellido(String apell) {
        this.apellido = apell;
    }

    public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
