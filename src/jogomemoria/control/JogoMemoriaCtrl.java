package jogomemoria.control;

import java.sql.Timestamp;

/**
 * 
 * @author Bárbara e Gabriel 
 */
public class JogoMemoriaCtrl {
    
    public static final int FACIL = 1;
    public static final int INTERMEDIARIO = 2;
    public static final int DIFICIL = 3;
    public static final int QTDE_PECAS_FACIL = 16;
    public static final int QTDE_PECAS_INTERMEDIARIO = 36;
    public static final int QTDE_PECAS_DIFICIL = 54;
    public static final int MAX_PECAS_PARTIDA = 18;
    public static final int MAX_PECAS_DISPONIVEIS = 20;
    private boolean jogoIniciado;  // Marca início da partida
    private Timestamp inicioJogo; //  True se o jogo começou False se terminou
    private int tempoLimite;     // Tempo limite para o jogo 
    private int tabRecords [][] = {{0,0,0},
                                   {0,0,0}, // Tabela de Recordes
                                   {0,0,0}};
    
    private int pontuacaoAtual;          // Pontuação atual da partida
    private int nivelAtual;             // Nível da partida atual
    private int acertosPartida;        // Quantidade de acertos do jogador na partida
    private int [] imagensPartida;    // Vetor de peças sorteadas para a partida atual
    private int [] imagensDisponivel;// Vetor de totas as peças disponíveis para o jogo
    private int qtdimagensPartida;  //  Quantidade de peças usadas em determinado nível
    
    public int tempoConsumido(){
        return 0;     
    }
    
    public void iniciarJogo(int nivel){
    
    }
    
    public void sortearPecasJogo(){
        
    }
    
    public JogoMemoriaCtrl(){
    
    }
    
} 

