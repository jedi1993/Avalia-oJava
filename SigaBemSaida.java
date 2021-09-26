package br.com.abc.Projeto;

public class SigaBemSaida  {
    private double vlrTotalFrete;
    private String CEPDestino;
    private String estado;
    private String ddd;

    public SigaBemSaida() {
    }

    public SigaBemSaida(double vlrTotalFrete, String DDD, String estado, String ddd) {
        this.vlrTotalFrete = vlrTotalFrete;
        this.CEPDestino = DDD;
        this.estado = estado;
        this.ddd = ddd;
    }

    public double getVlrTotalFrete() {
        return vlrTotalFrete;
    }

    public void setVlrTotalFrete(double vlrTotalFrete) {
        this.vlrTotalFrete = vlrTotalFrete;
    }


    public String getDDD() {
        return CEPDestino;
    }

    public void setDDD(String DDD) {
        this.CEPDestino = DDD;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "SigaBemSaida{" +
                "vlrTotalFrete=" + vlrTotalFrete +
                ", CEPDestino='" + CEPDestino + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void calculoFrete(SigaBemEntrada sigaBemEntrada, SigaBemSaida sigaBemSaida) {

        if (getDdd().equals(sigaBemEntrada.getDdd())) {
            System.out.println("O valor eh de R$ " + (getVlrTotalFrete() * 0.5) * sigaBemEntrada.getPeso());
            System.out.println("O prazo de entrega eh de 1 dia");

        } else if (getEstado().equals(sigaBemEntrada.getEstado())) {
            System.out.println("O valor eh de R$ " + getVlrTotalFrete() * sigaBemEntrada.getPeso() * 0.25);
            System.out.println("O prazo de entrega eh de 3 dias");

        } else {
            System.out.println("O valor total eh de R$ " + getVlrTotalFrete() * sigaBemEntrada.getPeso());
            System.out.println("O prazo para entrega eh de 10 dias");
        }
    }

}