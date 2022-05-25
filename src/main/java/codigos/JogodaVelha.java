/*
Nome:Pedro Henrique Rocha de Castr

 */
package codigos;


public class JogodaVelha {
    private String[][] tabuleiro;
    private boolean jogador1,jogador2;//jogador1= X . Jogador2= O.

 
    public JogodaVelha(){
        this.tabuleiro=new String[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               tabuleiro[i][j]="";//inicializa os objetos para nao ocorrer o erro de nullPointerException
                }
    
        }
        
        this.jogador1=false;
        this.jogador2=false;
    }

    public void jogar(int linha, int coluna){//seta o tabuleiro para ser colocado nos botões acionados
        if(jogador1==true){
            tabuleiro[linha][coluna]="X";
        }
        if(jogador2==true){
            tabuleiro[linha][coluna]="O";
        }
        
    }
   
    public String verificaVencedor(){
        
        try{
            for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
        
                  if(tabuleiro[i][j].equals("")==false){//verifica se a posicao atual não esta vazia
                      if(tabuleiro[i][j].equals(tabuleiro[i][j+1])&&tabuleiro[i][j].equals(tabuleiro[i][j+2])){//verifica linhas
                             return tabuleiro[i][j];                            
                      }
                      if(tabuleiro[i][j].equals(tabuleiro[i+1][j])&&tabuleiro[i][j].equals(tabuleiro[i+2][j])){//verifica colunas
                             return tabuleiro[i][j];
                             
                      }
                      if(tabuleiro[i][j].equals(tabuleiro[i+1][j+1])&&(tabuleiro[i][j].equals(tabuleiro[i+2][j+2]))){//verifica diagonais
                             return tabuleiro[i][j];
                             
                      }
                      if((tabuleiro[i][j+2].equals(tabuleiro[i+1][i+1]))&&(tabuleiro[i][j+2].equals(tabuleiro[i+2][j]))&&
                              (tabuleiro[i][j+2].equals("")==false)){//verifica diagonais
                             return tabuleiro[i][j+2];
                      }
                  }

              }
          }  
        }
        catch(ArrayIndexOutOfBoundsException exception){
            /*trata a exceção para não encerrar o programa caso, na verificação do vencedor, os valores de i e j sejam maiores
            que os inseridos no array
            ex:
            tabuleiro[4][4], que pode ocorrer caso i=j=2.
            */
            
        }
        
        return "";
    }
    public void limpaTabuleiro(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               this.tabuleiro[i][j]="";//limpa o tabuleiro quando o botão limpar é acionado
                }
    
        }
    }
    
    
    
    
    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public boolean isJogador1() {
        return jogador1;
    }

    public void setJogador1(boolean jogador1) {
        this.jogador1 = jogador1;
    }

    public boolean isJogador2() {
        return jogador2;
    }

    public void setJogador2(boolean jogador2) {
        this.jogador2 = jogador2;
    }
    
}
