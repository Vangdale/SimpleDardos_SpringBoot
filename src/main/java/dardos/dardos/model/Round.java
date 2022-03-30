package dardos.dardos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Round {
    private int ScorePerRound;

    public Round(int scorePerRound) {
        ScorePerRound = scorePerRound;
    }
}

