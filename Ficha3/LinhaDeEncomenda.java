public class LinhaDeEncomenda {
    private String referencia;
    private String descricao;
    private double precoAntes;
    private int quantidade;
    private int imposto;
    private int desconto;

    public LinhaDeEncomenda() {
        this.referencia = "none";
        this.descricao = "none";
        this.precoAntes = 0;
        this.quantidade = 0;
        this.imposto = 0;
        this.desconto = 0;
    }

    public LinhaDeEncomenda(String referencia, String descricao, double precoAntes, int quantidade, int imposto, int desconto) {
        this.referencia = referencia;
        this.descricao = descricao;
        this.precoAntes = precoAntes;
        this.quantidade = quantidade;
        this.imposto = imposto;
        this.desconto = desconto;
    }

    public LinhaDeEncomenda(LinhaDeEncomenda le) {
        this.referencia = le.getReferencia();
        this.descricao = le.getDescricao();
        this.precoAntes = le.getPrecoAntes();
        this.quantidade = le.getQuantidade();
        this.imposto = le.getImposto();
        this.desconto = le.getDesconto();
    }

    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoAntes() {
        return this.precoAntes;
    }

    public void setPrecoAntes(double precoAntes) {
        this.precoAntes = precoAntes;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getImposto() {
        return this.imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public int getDesconto() {
        return this.desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public String toString() {
        return ("Referência: " + getReferencia() +
                " Descrição: " + getDescricao() +
                " Preço antes de impostos: " + getPrecoAntes() +
                " Quantidade: " + getQuantidade() +
                " Imposto aplicado: " + getImposto() +
                " Desconto comercial: " + getDesconto());
    }

    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if((obj == null) || (obj.getClass() != this.getClass()))
            return false;

        LinhaDeEncomenda le = (LinhaDeEncomenda) obj;
        return (this.referencia.equals(le.getReferencia()) &&
                this.descricao.equals(le.getDescricao()) &&
                this.precoAntes == le.getPrecoAntes() &&
                this.quantidade == le.getQuantidade() &&
                this.imposto == le.getImposto() &&
                this.desconto == le.getDesconto());
    }

    public LinhaDeEncomenda clone(){
        return new LinhaDeEncomenda(this);
    }

    // 7. b)
    public double calculaValorLinhaEnc() {
        double precoComDesconto = (this.precoAntes * this.quantidade - ((this.precoAntes * this.quantidade) * this.desconto));

        return (precoComDesconto + (precoComDesconto * this.imposto));
    }

    // 7. c)
    public double calculaValorDesconto() {
        double valor = this.quantidade * this.precoAntes;

        return valor * this.desconto;
    }
}
