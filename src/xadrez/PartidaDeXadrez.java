package xadrez;

import tabuleirojogo.Posicao;
import tabuleirojogo.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
    private Tabuleiro tabuleiro;
    public PartidaDeXadrez(){
        tabuleiro = new Tabuleiro(8,8);
        setupInicial();
    }

    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++){
            for (int j = 0; j < tabuleiro.getColunas(); j++){
                mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i,j);
            }
        }
        return mat;
    }

    private void setupInicial() {
        tabuleiro.lugardapeca(new Torre(tabuleiro, Cor.WHITE), new Posicao(0,2);
        tabuleiro.lugardapeca(new Rei(tabuleiro, Cor.BLACK), new Posicao(0,4));
    }
}
