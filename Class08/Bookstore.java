package Class08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookstore {

    List<BookstoreItems> items = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    public void menu() {
        int opcao;
        do {
            System.out.println("\n===== Catálogo de Filmes =====");
            System.out.println("1. Registrar Livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Buscar livros");
            System.out.println("4. Atualizar livro");
            System.out.println("5. Deletar livro");
            System.out.println("0. Sair");
            System.out.print("Escolha a opção: ");
            System.out.println();
            opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1 -> registerItem();
                case 2 -> findAllItems();
                case 3 -> searchItem();
                case 4 -> updateItem();
                case 5 -> removeItem();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public void registerItem() {
        System.out.println("\n===== Registro de item na biblioteca =====");
        System.out.println("Digite o titulo do item: ");
        String name = scan.nextLine();

        System.out.println("Digite o autor do item: ");
        String author = scan.nextLine();

        System.out.println("Digite a data de publicação do item: ");
        String publicationDate = scan.nextLine();

        items.add(new BookstoreItems(name, author, publicationDate));
        System.out.println("Item registrado com sucesso!");
    }

    public void updateItem(){

        System.out.println("\n===== Atualização de item na biblioteca =====");
        System.out.println("Digite o titulo do item que deseja atualizar: ");
        String name = scan.nextLine();
        boolean found = false;
        for (BookstoreItems item : items) {
            if (item.nameContains(name)) {
                System.out.println("Digite o novo titulo do item: ");
                String newTitle = scan.nextLine();
                System.out.println("Digite o novo autor do item: ");
                String newAuthor = scan.nextLine();
                System.out.println("Digite a nova data de publicação do item: ");
                String newPublicationDate = scan.nextLine();

                item.setTitle(newTitle);
                item.setAuthor(newAuthor);
                item.setPublicationDate(newPublicationDate);
                System.out.println("Item atualizado com sucesso!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item não encontrado: " + name);
        }
    }

    public void findAllItems() {
        System.out.println("\n===== Listagem de itens na biblioteca =====");
        if (items.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
        } else {
            System.out.println("Itens cadastrados:");
            for (BookstoreItems item : items) {
                item.displayItems();
            }

        }
    }

    public void searchItem() {
        System.out.println("\n===== Pesquisa de item na biblioteca =====");
        System.out.println("Digite o tilulo do item que deseja pesquisar: ");
        String name = scan.nextLine();
        boolean found = false;
        for (BookstoreItems item : items) {
            if (item.nameContains(name)) {
                item.displayItems();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item não encontrado: " + name);
        }
    }

    public void removeItem() {
        System.out.println("\n===== Remoção de item na biblioteca =====");
        System.out.println("Digite o titulo do item que deseja remover: ");
        String name = scan.nextLine();
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).nameContains(name)) {
                items.remove(i);
                System.out.println("Item removido com sucesso: " + name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item não encontrado: " + name);
        }
    }
}
