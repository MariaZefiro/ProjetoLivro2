import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);
    static String retorno;
    static String resposta;
    static Livro[] livros = new Livro[1000];
    static Revista[] revistas = new Revista[1000];
    static int i = 0;
    static int j = 0;

    public static void cadastrarLivro() {
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

    public static void cadastrarRevista() {
        String nome, autor, editora, prateleira, ISBN, ISSN;
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

        revistas[j] = new Revista(ISSN, nome, autor, editora, prateleira, ISBN, edicao, ano, secao, CDD);

        j++;
        System.out.println("Revista cadastrada com sucesso!");
    }

    public static void procurarLivro() {
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
    }

    public static void procurarRevista() {
        String nomeProcura;

        System.out.println("Digite o nome ou autor da revista que deseja procurar:");
        nomeProcura = inp.next();

        for (int k = 0; k < j; k++) {
            if (revistas[k].getNome().indexOf(nomeProcura) != -1 || revistas[k].getAutor().indexOf(nomeProcura) != -1) {
                System.out.println("Revista: " + (k + 1));
                System.out.println(revistas[k].getNome() + ", " +
                        revistas[k].getAutor() + ", " +
                        revistas[k].getEditora() + ", " +
                        revistas[k].getPrateleira() + ", " +
                        revistas[k].getISSN() + ", " +
                        revistas[k].getEdicao() + ", " +
                        revistas[k].getAno() + ", " +
                        revistas[k].getSecao() + ", " +
                        revistas[k].getCDD() + " ");
            }
        }
    }

    public static void listarLivro() {
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
    }

    public static void listarRevista() {
        for (int k = 0; k < j; k++) {
            System.out.println("Revista: " + (k + 1));
            System.out.println(revistas[k].getNome() + ", " +
                    revistas[k].getAutor() + ", " +
                    revistas[k].getEditora() + ", " +
                    revistas[k].getPrateleira() + ", " +
                    revistas[k].getISSN() + ", " +
                    revistas[k].getEdicao() + ", " +
                    revistas[k].getAno() + ", " +
                    revistas[k].getSecao() + ", " +
                    revistas[k].getCDD() + " "
            );
        }
    }

    public static void excluirLivro() {
        listarLivro();
        System.out.println("Deseja excluir pelo nome ou índice?");
        resposta = inp.next();
        if (resposta.equals("nome")||resposta.equals("Nome")) {
            String nomeProcura;

            System.out.println("Digite o nome do livro que deseja procurar para excluir:");
            nomeProcura = inp.next();
            int indiceExcluir = 0;
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

                    indiceExcluir = k + 1;
                }
            }
            System.out.println("Deseja excluir esse livro?");
            resposta = inp.next();
            if (resposta.equals("sim")||resposta.equals("Sim")) {

                int k;
                if (indiceExcluir <= i && indiceExcluir >= 1) {
                    i--;
                    for (k = indiceExcluir - 1; k <= 1; k++) {
                        livros[k] = livros[k + 1];
                    }
                    livros[k + 1] = null;
                } else {
                    System.out.println("Fora da faixa!");
                }
            }
        } else if (resposta.equals("indice") || resposta.equals("índice")) {
            int k;
            System.out.println("Qual o índice do livro que deseja excluir?");
            retorno = inp.next();
            if (Integer.parseInt(retorno) <= i && Integer.parseInt(retorno) >= 1) {
                i--;
                for (k = Integer.parseInt(retorno) - 1; k <= 1; k++) {
                    livros[k] = livros[k + 1];
                }
                livros[k + 1] = null;
            }
        }
    }

    public static void excluirRevista() {
        listarRevista();
        System.out.println("Deseja excluir pelo nome ou índice?");
        resposta = inp.next();
        if (resposta.equals("nome")) {
            String nomeProcura;

            System.out.println("Digite o nome da revista que deseja procurar para excluir:");
            nomeProcura = inp.next();
            int indiceExcluir = 0;
            for (int k = 0; k < i; k++) {
                if (revistas[k].getNome().indexOf(nomeProcura) != -1 || revistas[k].getAutor().indexOf(nomeProcura) != -1) {
                    System.out.println("Revista: " + (k + 1));
                    System.out.println(revistas[k].getNome() + ", " +
                            revistas[k].getAutor() + ", " +
                            revistas[k].getEditora() + ", " +
                            revistas[k].getPrateleira() + ", " +
                            revistas[k].getISBN() + ", " +
                            revistas[k].getEdicao() + ", " +
                            revistas[k].getAno() + ", " +
                            revistas[k].getSecao() + ", " +
                            revistas[k].getCDD() + " ");
                    indiceExcluir = k + 1;
                }
            }
            System.out.println("Deseja excluir essa revista?");
            resposta = inp.next();
            if (resposta.equals("sim")) {
                int k;
                if (indiceExcluir <= i && indiceExcluir >= 1) {
                    i--;
                    for (k = indiceExcluir - 1; k <= 1; k++) {
                        revistas[k] = revistas[k + 1];
                    }
                    revistas[k + 1] = null;
                } else {
                    System.out.println("Fora da faixa!");
                }
            }
        } else if (resposta.equals("indice") || resposta.equals("índice")) {
            int k;
            System.out.println("Qual o índice do livro que deseja excluir?");
            retorno = inp.next();
            if (Integer.parseInt(retorno) <= i && Integer.parseInt(retorno) >= 1) {
                i--;
                for (k = Integer.parseInt(retorno) - 1; k <= 1; k++) {
                    revistas[k] = revistas[k + 1];
                }
                revistas[k + 1] = null;
            }
        }
    }

    public static void ordenarLivro() {
        for (int k = 0; k < (i - 1); k++) {
            for (int z = 0; z < (i - 1); z++) {
                Livro aux = new Livro();
                Livro aux1 = new Livro();
                aux = livros[z];
                aux1 = livros[z + 1];
                if (aux.getNome().toLowerCase().compareTo(aux1.getNome().toLowerCase()) > 0) {
                    livros[z] = aux1;
                    livros[z + 1] = aux;
                }
            }
        }
    }

    public static void ordenarRevista() {
        for (int k = 0; k < (j - 1); k++) {
            for (int z = 0; z < (j - 1); z++) {
                Revista aux = new Revista();
                Revista aux1 = new Revista();
                aux = revistas[z];
                aux1 = revistas[z + 1];
                if (aux.getNome().toLowerCase().compareTo(aux1.getNome().toLowerCase()) > 0) {
                    revistas[z] = aux1;
                    revistas[z + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {

        do {
            System.out.println("****************************************");
            System.out.println("Sistema de Cadastro de Livros e Revistas");
            System.out.println("****************************************");
            System.out.println("1 - Cadastrar livro/revista");
            System.out.println("2 - Procurar livro/revista");
            System.out.println("3 - Listar livros/revistas");
            System.out.println("4 - Quantidade cadastrada/livre");
            System.out.println("5 - Excluir livro/revista");
            System.out.println("6 - Ordenar livros/revistas cadastrados");
            System.out.println("7 - Encerrar programa");

            retorno = inp.next();

            //Cadastrar livro/revista
            if (retorno.equals("1")) {
                System.out.println("1- Livro \n2- Revista");
                retorno = inp.next();
                if (retorno.equals("1")) {
                    cadastrarLivro();
                } else if (retorno.equals("2")) {
                    cadastrarRevista();
                }
                retorno = "";
            } // fechando o if

            //Procurar livros/revista
            if (retorno.equals("2")) {
                System.out.println("1- Livro \n2- Revista");
                retorno = inp.next();
                if (retorno.equals("1")) {
                    procurarLivro();
                } else if (retorno.equals("2")) {
                    procurarRevista();
                }
            }

            //Listar livros/revista
            if (retorno.equals("3")) {
                System.out.println("1- Livro \n2- Revista");
                retorno = inp.next();
                if (retorno.equals("1")) {
                    listarLivro();
                } else if (retorno.equals("2")) {
                    listarRevista();
                }
                retorno = "";
            } // fechando o if

            //Quantidade cadastrada
            if (retorno.equals("4")) {
                System.out.println("Total = 1000");
                System.out.println("Usado = " + (i + j));
                System.out.println("Livre = " + (1000 - (i + j)));

            } // fechando o if

            //Excluir livro/revista
            if (retorno.equals("5")) {
                System.out.println("1- Livro \n2- Revista");
                retorno = inp.next();
                if (retorno.equals("1")) {
                    excluirLivro();
                } else if (retorno.equals("2")) {
                    excluirRevista();
                }

            }

            //Ordenar livros/revista
            if (retorno.equals("6")) {
                System.out.println("1- Livro \n2- Revista");
                retorno = inp.next();
                if (retorno.equals("1")) {
                    ordenarLivro();
                } else if (retorno.equals("2")) {
                    ordenarRevista();
                }
            }
        } while (!retorno.equals("7"));  // Fechando programa
        System.out.println("Fim do programa");
    }
}