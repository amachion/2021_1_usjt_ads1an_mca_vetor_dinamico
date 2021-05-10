
package pkg2021_1_ads1an_mca_vetor_dinamico;

public class VetorDinamico {
    private int quantidade; //número de elementos no vetor
    private int capacidade; //tamanho atual do vetor
    int[] elementos;
    public VetorDinamico () {
        //this(4);
        this.capacidade = 4;
        this.elementos = new int[this.capacidade];
    }
    //sobrecarga do construtor
    public VetorDinamico (int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[this.capacidade];
    }
    public boolean estaVazio () {
        return this.quantidade == 0;
    }
    public boolean estaCheio () {
        if (this.quantidade == this.capacidade)
            return true;
        else
            return false;
    }
    public boolean estaVazioTernario () {
        return this.quantidade == 0? true: false;
    }
    public void adicionar (int elemento) {
        if (this.estaCheio()) {
            this.aumentarCapacidade();
        }
        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }
    private void aumentarCapacidade() {
        this.capacidade = this.capacidade*2;
        int[] aux = new int[this.capacidade];
        for (int i=0; i<this.quantidade; i++) {
            aux[i] = this.elementos[i];
        }
        this.elementos = aux;
    }
    
}
