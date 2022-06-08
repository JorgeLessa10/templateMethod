/*
 ** created by: jorge.lessa
 */
public class LocacaoPS4 extends Locacao{

    @Override
    public Double getValorFinal() {
        return this.calcularValor() * 1.0;
    }
}
