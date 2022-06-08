/*
 ** created by: jorge.lessa
 */
public abstract class Locacao {

    private Jogo jogo;
    private Integer quantidadeDeDias;

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Integer getQuantidadeDeDias() {
        return quantidadeDeDias;
    }

    public void setQuantidadeDeDias(Integer quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public Double calcularValor()
    {
        return this.getJogo().getValorDiaria() * this.getQuantidadeDeDias();
    }

    public abstract Double getValorFinal();

    public String descricaoCompleta() {
        return "Nome do jogo: " + this.getJogo().getNome() +
                ", alugado por: " + this.getQuantidadeDeDias() +  " dias\n" +
                "Valor final da locação:  " + this.getValorFinal();
    }
}
