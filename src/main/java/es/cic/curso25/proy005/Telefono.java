package es.cic.curso25.proy005;

public class Telefono {

    private long id;
    private String titular;
    private String numero;
    private int tipoContrato;

    

    public Telefono() {
        
    }

    public Telefono(long id, String titular, String numero, int tipoContrato) {
        this.id = id;
        this.titular = titular;
        this.numero = numero;
        this.tipoContrato = tipoContrato;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

}
