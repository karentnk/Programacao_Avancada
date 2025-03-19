class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return  "\nNome:" + nome +"\nCódigo: " + codigo + "\nR$" + preco;
    }
}
