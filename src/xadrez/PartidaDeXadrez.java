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

    private void lugarNovaPeca(char coluna, int linha,PecaDeXadrez peca){
        tabuleiro.lugardapeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
    }
    private void setupInicial() {
        lugarNovaPeca('b',6,new Torre(tabuleiro, Cor.WHITE));
        lugarNovaPeca('c',5,new Rei(tabuleiro, Cor.BLACK));
    }
}
