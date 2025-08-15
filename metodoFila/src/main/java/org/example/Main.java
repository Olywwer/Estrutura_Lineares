import org.example.Pilha;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o tamanho da pilha: ");
    int tamanho = scanner.nextInt();
    scanner.nextLine(); // Consumir o newline
    Pilha pilha = new Pilha(tamanho);
    while (true) {
        System.out.println("1. Adicionar elemento (LIFO)");
        System.out.println("2. Remover elemento (LIFO)");
        System.out.println("3. Adicionar elemento (FIFO)");
        System.out.println("4. Remover elemento (FIFO)");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir o newline
        switch (opcao) {
            case 1:
                System.out.print("Digite o elemento: ");
                String elementoLifo = scanner.nextLine();
                pilha.push(elementoLifo);
                break;
            case 2:
                System.out.println("Elemento removido: " + pilha.pop());
                break;
            case 3:
                System.out.print("Digite o elemento: ");
                String elementoFifo = scanner.nextLine();
                pilha.enqueue(elementoFifo);
                break;
            case 4:
                System.out.println("Elemento removido: " + pilha.dequeue());
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
