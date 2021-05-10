
package pkg2021_1_ads1an_mca_vetor_dinamico;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        VetorDinamico vd1 = new VetorDinamico();
        
        int c = Integer.parseInt(JOptionPane.showInputDialog("digite a capacidade"));
        
        VetorDinamico vd2 = new VetorDinamico(c);
        
        for (int i=10; i<=100; i+=10) {
            vd1.adicionar(i);
        }
        
    }
    
}
