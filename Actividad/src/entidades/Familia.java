
package entidades;

public class Familia {
    private int id;
    private String nombre;
    private int edadMinima;
    private int edadMaxima;
    private int numHijos;
    private String email;
    private int idCasaFamilia;

    public Familia() {

    }



    public Familia(int id, String nombre, int edadMinima, int edadMaxima, int numHijos, String email, int idCasaFamilia) {
        this.id = id;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.numHijos = numHijos;
        this.email = email;
        this.idCasaFamilia = idCasaFamilia;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getEdad_minima() {
        return edadMinima;
    }



    public void setEdad_minima(int edadMinima) {
        this.edadMinima = edadMinima;
    }



    public int getEdad_maxima() {
        return edadMaxima;
    }



    public void setEdad_maxima(int edad_maxima) {
        this.edadMaxima = edad_maxima;
    }



    public int getNum_hijos() {
        return numHijos;
    }



    public void setNum_hijos(int num_hijos) {
        this.numHijos = num_hijos;
    }



    public int getIdCasaFamilia() {
        return idCasaFamilia;
    }



    public void setIdCasaFamilia(int idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



}