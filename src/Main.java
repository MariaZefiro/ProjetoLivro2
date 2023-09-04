import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String retorno;
        Livro[] livros = new Livro[1000];
        Revista[] revistas = new Revista[1000];
        int i = 0;
        int j = 0;

        do{
            System.out.println("1 - Cadastrar livro/revista");
            System.out.println("2 - Procurar livro/revista");
            System.out.println("3 - Listar livros/revistas");
            System.out.println("4 - Quantidade cadastrada/livre");
            System.out.println("5 - Excluir último livro da lista");
            System.out.println("6 - Ordenar livros cadastrados");
            System.out.println("7 - Encerrar programa");

            retorno = inp.next();

            //Cadastrar livro/revista
            if(retorno.equals("1")){
                System.out.println("1- Livro \n2- Revista");
                retorno = inp.next();
                if(retorno.equals("1")) {
                    String nome, autor, editora, prateleira, ISBN;
                    int edicao, ano, secao, CDD;

                    System.out.println("Informe o nome do livro:");
                    nome = inp.next();

                    System.out.println("Informe o nome do autor do livro:");
                    autor = inp.next();

                    System.out.println("Informe o ISBN do livro:");
                    ISBN = inp.next();

                    System.out.println("Informe o número da edição do livro:");
                    edicao = inp.nextInt();

                    System.out.println("Informe o ano de publicação do livro:");
                    ano = inp.nextInt();

                    System.out.println("Informe o nome da editora do livro:");
                    editora = inp.next();

                    System.out.println("Informe a prateleira do livro:");
                    prateleira = inp.next();

                    System.out.println("Informe o número da seção do livro:");
                    secao = inp.nextInt();

                    System.out.println("Informe o CDD do livro:");
                    CDD = inp.nextInt();

                    livros[i] = new Livro(nome, autor, editora, prateleira, ISBN, edicao, ano, secao, CDD);

                    i++;
                    System.out.println("Livro cadastrado com sucesso!");
                }
                else if(retorno.equals("2")){
                    String nome, autor, editora, prateleira,ISBN,ISSN;
                    int edicao, ano, secao, CDD;

                    System.out.println("Informe o nome da revista:");
                    nome = inp.next();

                    System.out.println("Informe o nome do autor da revista:");
                    autor = inp.next();

                    System.out.println("Informe o ISSN da revista:");
                    ISSN = inp.next();
                    ISBN = "-";

                    System.out.println("Informe o número da edição da revista:");
                    edicao = inp.nextInt();

                    System.out.println("Informe o ano de publicação da revista:");
                    ano = inp.nextInt();

                    System.out.println("Informe o nome da editora da revista:");
                    editora = inp.next();

                    System.out.println("Informe a prateleira da revista:");
                    prateleira = inp.next();

                    System.out.println("Informe o número da seção da revista:");
                    secao = inp.nextInt();

                    System.out.println("Informe o CDD da revista:");
                    CDD = inp.nextInt();

                    revistas[j]=new Revista (ISSN,nome, autor, editora,prateleira,ISBN,edicao,ano,secao,CDD);

                    j++;
                    System.out.println("Revista cadastrada com sucesso!");
                }
                retorno = "";
            } // fechando o if


            //Procurar livros/revista
            if(retorno.equals("2")){
                System.out.println("1- Livro \n2- Revista");
                retorno = inp.next();
                if(retorno.equals("1")) {
                    String nomeProcura;

                    System.out.println("Digite o nome ou autor do livro que deseja procurar:");
                    nomeProcura = inp.next();

                    for (int k = 0; k < i; k++) {
                        if (livros[k].getNome().indexOf(nomeProcura) != -1 || livros[k].getAutor().indexOf(nomeProcura) != -1) {
                            System.out.println("Livro: " + (k + 1));
                            System.out.println(livros[k].getNome() + ", " +
                                    livros[k].getAutor() + ", " +
                                    livros[k].getEditora() + ", " +
                                    livros[k].getPrateleira() + ", " +
                                    livros[k].getISBN() + ", " +
                                    livros[k].getEdicao() + ", " +
                                    livros[k].getAno() + ", " +
                                    livros[k].getSecao() + ", " +
                                    livros[k].getCDD() + " ");
                        }
                    }
                }else if(retorno.equals("2")){
                    String nomeProcura;
                    int numeroProcura;

                    System.out.println("Digite o nome ou autor da revista que deseja procurar:");
                    nomeProcura= inp.next();

                    for(int k=0;k<j;k++) {
                        if(revistas[k].getNome().indexOf(nomeProcura)!=-1||revistas[k].getAutor().indexOf(nomeProcura)!=-1){
                            System.out.println("Revista: "+ (k+1));
                            System.out.println(revistas[k].getNome()+", "+
                                    revistas[k].getAutor()+", "+
                                    revistas[k].getEditora()+", "+
                                    revistas[k].getPrateleira()+", "+
                                    revistas[k].getISSN()+", "+
                                    revistas[k].getEdicao()+", "+
                                    revistas[k].getAno()+", "+
                                    revistas[k].getSecao()+", "+
                                    revistas[k].getCDD()+" ");
                        }
                    }
                }
                retorno = "";
            }


            //Listar livros/revista
            if(retorno.equals("3")){
                System.out.println("1- Livro \n2- Revista");
                retorno = inp.next();
                if(retorno.equals("1")) {
                    for (int k = 0; k < i; k++) {
                        System.out.println("Livro: " + (k + 1));
                        System.out.println(livros[k].getNome() + ", " +
                                livros[k].getAutor() + ", " +
                                livros[k].getEditora() + ", " +
                                livros[k].getPrateleira() + ", " +
                                livros[k].getISBN() + ", " +
                                livros[k].getEdicao() + ", " +
                                livros[k].getAno() + ", " +
                                livros[k].getSecao() + ", " +
                                livros[k].getCDD() + " "
                        );
                    }
                } else if (retorno.equals("2")) {
                    for(int k=0; k<j;k++){
                        System.out.println("Revista: "+ (k+1));
                        System.out.println(revistas[k].getNome()+", "+
                                revistas[k].getAutor()+", "+
                                revistas[k].getEditora()+", "+
                                revistas[k].getPrateleira()+", "+
                                revistas[k].getISSN()+", "+
                                revistas[k].getEdicao()+", "+
                                revistas[k].getAno()+", "+
                                revistas[k].getSecao()+", "+
                                revistas[k].getCDD()+" "
                        );
                    }
                }
                retorno = "";
            } // fechando o if

            //Quantidade cadastrada
            if(retorno.equals("4")){
                System.out.println("Total = 1000");
                System.out.println("Usado = "+(i+j));
                System.out.println("Livre = "+(1000 - (i+j)));

            } // fechando o if


            //Excluir último elemento da lista
            if(retorno.equals("5")){
                if(i>0) {
                    i--;
                    System.out.println("Excluído com sucesso!");
                }else{
                    System.out.println("Não existe nenhum livro cadastrado!");
                }
            }

        }while(!retorno.equals("7"));  // Fechando programa

        System.out.println("Fim do programa");
    }
}