
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
public class ListaDeInteiros {
    private int[] dados;
    private int tamanho;
    public ListaDeInteiros (int capMax) {
        dados = new int[capMax];
        tamanho = 0;
    }
    /**
     * Adiciona elemento ao inicio da lista
     * @param � o novo elemento
     */
    public void adicionaInicio(int e){
        if (cheia()) {
            JOptionPane.showMessageDialog(null, "ERRO:\n A lista está cheia!\n");
        } else {
            for (int i = tamanho;i>0;i=i-1) {
                dados[i] = dados[i-1];
            }
            dados[0]=e;
            tamanho++;
        }
    }
    public void adicionaFinal(int e){
        if (cheia()) {
            JOptionPane.showMessageDialog(null, "ERRO:\n A lista está cheia!");
        } else {
            dados[tamanho]=e;
            tamanho++;
        }
    }    
    public int removeInicio(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
            return 0;
        } else {
            int e = dados[0];
            for (int i = 0;i<tamanho-1;i++) {
                dados[i] = dados[i+1];
            }
            tamanho--;
            dados[tamanho] = 0;
            return e;
        }
    }
    public void removeFinal(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
        } else {
            tamanho--;
            dados[tamanho] = 0;
        }
    }
    public int obtemPrimeiro(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
            return 0;
        }
        return dados[0];
    }
    public int obtemUltimo(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
            return 0;
        }
        return dados[tamanho-1];
    }
    public void removePosicao(int n){
        int e;
        if (vazia()){
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
        } else if (tamanho < n){
            JOptionPane.showMessageDialog(null, "ERRO: Não existem elementos "
                    + "na posição " + n);
        } else {
            for (int i = 0;i<tamanho;i++) {
                if (i == n - 1 ) {
                    e = dados[i];
                }
                if (i > n -1){
                    dados[i-1] = dados[i];
                }
            }
            tamanho--;
            dados[tamanho] = 0;
        }
    }
    public void adicionaPosicao(int x, int n){
        int e;
        if (cheia()){
            JOptionPane.showMessageDialog(null, "ERRO: Lista cheia");
        } else if (tamanho < n-1){
            JOptionPane.showMessageDialog(null, "A posi��o � maior que o tamanho da lista");
        } else {
            for (int i = n-1;i<tamanho;i++) {
            	dados[i+1] = dados[i];
            }
            tamanho++;
            dados[n-1] = x;
        }
    }
    public boolean cheia() {
        return tamanho == dados.length;
    }
    public boolean vazia() {
        return tamanho == 0;
    }
    public String toString() {
        if (vazia()) {
            return "A lista est� vazia";
        }
        String s = "";
        for (int i = 0; i < tamanho;i++) {
            s = s + dados[i] + "|";
        }
        return s;
    }
}
