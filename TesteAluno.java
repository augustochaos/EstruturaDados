
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorios
 */
public class TesteAluno {
    public static void main (String args[]) {
        ListaDeAlunos lista1 = new ListaDeAlunos(4);
        String nome;
        String ra;
        int op = 0, x;
        String str;
        while (op != 99) {
            str = JOptionPane.showInputDialog(
                    "CONTEUDO DA LISTA: \n" + 
                    lista1.toString() + 
                    "\n\nMenu\n"+
                    "1-Adiciona Inicio\n"+
                    "2-Remove Inicio\n"+
                    "3-Adiciona Final\n"+
                    "4-Remove Final\n"+
                    "5-Remove Posicao\n"+
                    "6-Obtem Primeiro\n"+
                    "7-Obtem Último\n"+
//                    "8-Adiciona Inicio\n"+
                    "9-Imprime Lista\n"+
                    "99-Sair\n\n"
            );
            op = Integer.parseInt(str);
            switch (op) {
                case 1:
                    nome = JOptionPane.showInputDialog("Nome?");
                    ra = JOptionPane.showInputDialog("RA?");
                    lista1.adicionaInicio(new Aluno(nome, ra));
                    break;
                case 2:
                    lista1.removeInicio();
                    break;
                case 3:
                    nome = JOptionPane.showInputDialog("Nome?");
                    ra = JOptionPane.showInputDialog("RA?");
                    lista1.adicionaInicio(new Aluno(nome, ra));
                    break;
                case 4:
                    lista1.removeFinal();
                    break;
                case 5:
                    x = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Informe a posição do elemento que deseja remover"
                            )
                        );                    
                    lista1.removePosicao(x);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,
                            "O primeiro elemento é:" + lista1.obtemPrimeiro()
                    );
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,
                            "O último elemento é:" + lista1.obtemUltimo()
                    );
                    break;                    
                case 8:
                    System.out.println("Em implementação");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,lista1.toString());
                    break;
                case 99:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }
    }
    
}
