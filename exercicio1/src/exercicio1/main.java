package exercicio1;

import javax.swing.JOptionPane;
public class main {
public static void main(String[] args) {
String numerosParaExibirEmLinha = "";
String numerosParaExibirLinhaPorLinha = "";
int numeros[] = new int[10];
for (int contador = 0; contador < 10; contador++)
{

numeros[contador] = Integer.parseInt(
JOptionPane.showInputDialog("Informe 10 numeros")
);
numerosParaExibirEmLinha = numerosParaExibirEmLinha + " " +
numeros[contador];
numerosParaExibirLinhaPorLinha =
numerosParaExibirLinhaPorLinha + "\n" + numeros[contador];
}
JOptionPane.showMessageDialog(null,
"Os números informados foram: " + numerosParaExibirEmLinha);
JOptionPane.showMessageDialog(null,
"Os números informados linha a linha: " + numerosParaExibirLinhaPorLinha);
}
}