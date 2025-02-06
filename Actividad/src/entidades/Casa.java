package entidades;

import java.sql.Date;

public class Casa {
    private int idCasa;
    private String calle;
    private int numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private Date fechaDesde;
    private Date fechaHasta;
    private int timepoMinimo;
    private int timepoMaximo;
    private double precioHabitacion;
    private String tipoVivienda;

    public Casa(int idCasa, String calle, int numero, String codigoPostal, String ciudad, String pais, Date fechaDesde,
                Date fechaHasta, int timepoMinimo, int timepoMaximo, double precioHabitacion, String tipoVivienda) {
        this.idCasa = idCasa;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.timepoMinimo = timepoMinimo;
        this.timepoMaximo = timepoMaximo;
        this.precioHabitacion = precioHabitacion;
        this.tipoVivienda = tipoVivienda;
    }

    public Casa(String calle, int numero, String codigoPostal, String ciudad, String pais, Date fechaDesde,
                Date fechaHasta, int timepoMinimo, int timepoMaximo, double precioHabitacion, String tipoVivienda) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.timepoMinimo = timepoMinimo;
        this.timepoMaximo = timepoMaximo;
        this.precioHabitacion = precioHabitacion;
        this.tipoVivienda = tipoVivienda;
    }

    public Casa() {
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public int getTimepoMinimo() {
        return timepoMinimo;
    }

    public void setTimepoMinimo(int timepoMinimo) {
        this.timepoMinimo = timepoMinimo;
    }

    public int getTimepoMaximo() {
        return timepoMaximo;
    }

    public void setTimepoMaximo(int timepoMaximo) {
        this.timepoMaximo = timepoMaximo;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "idCasa=" + idCasa +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", fechaDesde=" + fechaDesde +
                ", fechaHasta=" + fechaHasta +
                ", timepoMinimo=" + timepoMinimo +
                ", timepoMaximo=" + timepoMaximo +
                ", precioHabitacion=" + precioHabitacion +
                ", tipoVivienda='" + tipoVivienda + '\'' +
                '}';
    }
}
