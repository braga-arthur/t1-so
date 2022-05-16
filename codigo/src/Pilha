import java.io.*;

public class Pilha {
	private Pacote[] pilha;
	private int topo;

	Pilha() {
		pilha = new Pacote[10];
		topo = -1;
	}

	Pilha(int tamanho) {
		pilha = new Pacote[tamanho];
		topo = -1;
	}

	public void empilhar(Pacote pacote) throws Exception {
		if (topo == -1) {
			topo = 0;
			pilha[topo] = pacote;
		} else if (topo != -1 && topo != (pilha.length) - 1) {
			topo++;
			pilha[topo] = pacote;
		} else {
			throw new Exception("A pilha está cheia!");
		}
	}

	public Pacote desempilhar() throws Exception {
		int aux = topo;
		if (topo == (pilha.length) - 1) {
			topo--;
			return pilha[aux];
		} else if (topo != -1 && topo != (pilha.length) - 1) {
			topo--;
			return pilha[aux];
		} else {
			throw new Exception("A pilha está vazia!");
		}
	}

	public void mostrar() throws Exception {
		if (topo == (pilha.length) - 1) {
			for (int i = 0; i <= topo; i++) {
				System.out.print("[" + i + "] ");
				pilha[i].imprimir();
			}
		} else if (topo != (pilha.length) - 1 && topo != -1) {
			for (int i = 0; i <= topo; i++) {
				System.out.print("[" + i + "] ");
				pilha[i].imprimir();
			}
		} else {
			throw new Exception("A pilha está vazia!");
		}
	}
