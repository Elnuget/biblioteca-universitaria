package ec.edu.udla.biblioteca;

/**
 * Aplicación base para el Sistema de Biblioteca Universitaria.
 * Asignatura: Calidad de Software (UDLA)
 */
public class App {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  SISTEMA DE GESTION DE BIBLIOTECA UNIVERSITARIA  ");
        System.out.println("  Materia: Calidad de Software - UDLA             ");
        System.out.println("==================================================");
    }

    public String getNombreSistema() {
        return "Sistema de Biblioteca Universitaria";
    }

    public boolean estaOperativo() {
        return true;
    }
}
