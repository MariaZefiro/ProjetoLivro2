public class Livro {
    private String nome, autor, editora, prateleira,ISBN;
    private int  edicao, ano, secao, CDD;

    public Livro(String nome, String autor, String editora, String prateleira, String ISBN, int edicao, int ano, int secao, int CDD) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.prateleira = prateleira;
        this.ISBN = ISBN;
        this.edicao = edicao;
        this.ano = ano;
        this.secao = secao;
        this.CDD = CDD;
    }

    public Livro(){

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSecao() {
        return secao;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }

    public int getCDD() {
        return CDD;
    }

    public void setCDD(int CDD) {
        this.CDD = CDD;
    }
}
