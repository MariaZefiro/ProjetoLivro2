public class Revista extends Livro{
    private String ISSN;

    public Revista(String ISSN, String nome, String autor, String editora, String prateleira, String ISBN, int edicao, int ano, int secao, int CDD)  {
        super(nome,autor,editora,prateleira,ISBN,edicao,ano,secao,CDD);
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return this.ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

}
