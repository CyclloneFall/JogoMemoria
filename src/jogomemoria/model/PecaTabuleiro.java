/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.model;


public class PecaTabuleiro {
  private int numero; //saber qual peça é 
  private int idImagem; // Cada peça tem a sua imagem
  private int linha;
  private int coluna;
  private boolean virado;
  
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }
 

    /**
     * @return the linha
     */
    public int getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }

    /**
     * @return the coluna
     */
    public int getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    /**
     * @return the virado
     */
    public boolean isVirado() {
        return virado;
    }

    /**
     * @param virado the virado to set
     */
    public void setVirado(boolean virado) {
        this.virado = virado;
    }
}
