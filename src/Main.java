import  java.util.ArrayList;
import  java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        // iniciando o scanner
        Scanner scanner = new Scanner(System.in);

        // vamos iniciar o vetor, ou seja, o arrayList para as tarefas
        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

        System.out.println("---bem vindo ao sistema de tarefas---");
        int opcao = 0;
        while(opcao !=4){
            System.out.println("1 - Adicionar nova tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Marcar tarefa como concluida");
            System.out.println("5 - Remover tarefa");
            System.out.println("6 - Estatisticas");
            System.out.println("7 - Pesquisar tarefa");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opcao:");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1){
                System.out.println("Informe a descrição da sua tarefa: ");
                String descricao = scanner.nextLine();

                // vamos instanciar nossa tarefa (obj tarefa)
                Tarefa novaTarefa = new Tarefa(descricao);

                // vamos usar um add para colocar a informação no array
                listaDeTarefas.add(novaTarefa);
                System.out.println(novaTarefa + " adicionada com sucesso!!!");
            }else if (opcao == 2){
                // problema .... e se a lista estiver vazia
                if (listaDeTarefas.isEmpty()){
                    System.out.println("Lista de tarefas vazia!");
                } else {
                    for (int i = 0; i < listaDeTarefas.size(); i++ ){
                        Tarefa t = listaDeTarefas.get(i);
                        t.exibirTarefa(i + 1);
                    }
                }
            }else if (opcao == 3){
                // problema .... o sistema pode não ter tarefas
                if(listaDeTarefas.isEmpty()){
                    System.out.println("Sem tarefas a concluir!");
                } else {
                    System.out.println("Qual tarefa que vc quer concluir? ");
                    int numeroTarefa = scanner.nextInt();
                    int indiceReal = numeroTarefa -1;

                    // problema 2 .... indice inexistente
                    if (indiceReal >= 0 && indiceReal < listaDeTarefas.size()){
                        Tarefa t = listaDeTarefas.get(indiceReal);
                        t.marcarComoConcluido();
                        System.out.println("Parabens!! Tarefa concluida com sucesso!");
                    } else {
                        System.out.println("Numero de tarefa invalido!");
                    }
                }
            }else if (opcao == 5){
                if(listaDeTarefas.isEmpty()){
                    System.out.println("Sem tarefas para remover!");
                } else {
                    System.out.println("Qual tarefa voce quer remover?");
                    int numeroTarefa = scanner.nextInt();
                    scanner.nextLine();
                    int indiceReal = numeroTarefa - 1;

                    if (indiceReal >= 0 && indiceReal < listaDeTarefas.size()) {
                        Tarefa removida = listaDeTarefas.remove(indiceReal);
                        System.out.println("Tarefa removida: " + removida.getDescricao());
                    } else {
                        System.out.println("Numero de tarefa invalido!");
                    }
                }
            }else if (opcao == 6){
                int total = listaDeTarefas.size();
                int concluidas = 0;

                for (int i = 0; i < listaDeTarefas.size(); i++) {
                    if (listaDeTarefas.get(i).isConcluido()) {
                        concluidas++;
                    }
                }

                int pendentes = total - concluidas;
                System.out.println("Total: " + total + " | Concluidas: " + concluidas + " | Pendentes: " + pendentes);
            }else if (opcao == 7){
                if (listaDeTarefas.isEmpty()) {
                    System.out.println("Lista de tarefas vazia!");
                } else {
                    System.out.println("Digite uma palavra-chave para pesquisar:");
                    String termo = scanner.nextLine();
                    boolean encontrou = false;

                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        Tarefa t = listaDeTarefas.get(i);
                        if (t.getDescricao().toLowerCase().contains(termo.toLowerCase())) {
                            t.exibirTarefa(i + 1);
                            encontrou = true;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Nenhuma tarefa encontrada para o termo pesquisado.");
                    }
                }
            }else if (opcao == 4){
                System.out.println("Tchau");
            }else {
                System.out.println("Escolha uma das opções do menu principal!");
            }
        }
    }
}