package dardos.dardos.service;

import dardos.dardos.model.Round;
import org.springframework.stereotype.Service;

import dardos.dardos.model.Player;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    public List<Player> PlayerList = new ArrayList<>();
    int TurnoJugador = 0;
    int NumTiradas = 0;
    int ScorePerRound = 0;
    public int Ronda= 1;

    public List<Player> AddPlayer (Player player){
        PlayerList.add(player);
        return PlayerList;
    }

    public List<Player> Tirada(){

        while( TurnoJugador < PlayerList.size()){
            while(NumTiradas < 3){
                PlayerList.get(TurnoJugador).setScore(PlayerList.get(TurnoJugador).getScore()+(int)(Math.random()*60));
                NumTiradas++;
            }
            NumTiradas = 0;
            TurnoJugador++;
        }
        TurnoJugador = 0;
        Ronda++;
        return PlayerList;
    }

    /*public List<Round> EachRound(){
        List<Round> ronda = new ArrayList<>();

        for(int i=0; i<PlayerList.size(); i++){
            ronda.add(i,new Round(PlayerList.get(i).getScore()));
        }
        return ronda;
    }
*/
}
