package com.company;

import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    public void createVoting (String question,
                              boolean isAnonymous,
                              int type,
                              ArrayList<String> choices){
        Voting voting = new Voting();
        for (String choice : choices){
            voting.createChoice(choice);
        }

    }
}
