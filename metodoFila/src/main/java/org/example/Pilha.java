package org.example;

import java.util.Scanner;
public class Pilha {
    private String[] elementos;
    private int topo;
    private int tamanho;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new String[tamanho];
        this.topo = -1;
    }

    // Adicionar elemento (LIFO)
    public void push(String elemento) {
        if (topo < tamanho - 1) {
            topo++;
            elementos[topo] = elemento;
        } else {
            System.out.println("Pilha cheia");
        }
    }

    // Remover elemento (LIFO)
    public String pop() {
        if (topo >= 0) {
            String elemento = elementos[topo];
            topo--;
            return elemento;
        } else {
            return "Pilha vazia";
        }
    }

    // Adicionar elemento (FIFO)
    public void enqueue(String elemento) {
        if (topo < tamanho - 1) {
            for (int i = topo; i >= 0; i--) {
                elementos[i + 1] = elementos[i];
            }
            elementos[0] = elemento;
            topo++;
        } else {
            System.out.println("Pilha cheia");
        }
    }

    // Remover elemento (FIFO)
    public String dequeue() {
        if (topo >= 0) {
            String elemento = elementos[topo];
            topo--;
            return elemento;
        } else {
            return "Pilha vazia";
        }
    }
}