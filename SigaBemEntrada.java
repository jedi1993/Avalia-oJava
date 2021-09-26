package br.com.abc.Projeto;

public class SigaBemEntrada {
    private double peso;
    private String CEPOrigem;
    private String estado;
    private String nomeDestinatario;
    private String ddd;

    public SigaBemEntrada() {
    }

    public SigaBemEntrada(double peso, String DDD, String estado, String nomeDestinatario, String ddd) {
        this.peso = peso;
        this.CEPOrigem = DDD;
        this.estado = estado;
        this.nomeDestinatario = nomeDestinatario;
        this.ddd = ddd;
    }

    @Override
    public String toString() {
        return "SigaBemEntrada{" +
                "peso=" + peso +
                ", cepOrigem=" + CEPOrigem +
                ", cepDestino=" + estado +
                ", nomeDestinatario='" + nomeDestinatario + '\'' +
                '}';
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDDD() {
        return CEPOrigem;
    }

    public Object setDDD(String DDD) {
        this.CEPOrigem = DDD;
        return null;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

}
