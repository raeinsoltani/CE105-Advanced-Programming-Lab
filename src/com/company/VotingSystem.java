package com.company;

import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    public void createVoting (String question,
                              boolean isAnonymous,
                              int type,
                              ArrayList<String> choices){
        Voting voting = new Voting(type, question, isAnonymous);
        for (String choice : choices){
            voting.createChoice(choice);
        }
    }

    public Voting getVoting(int index){
        return votingList.get(index);
    }

    public ArrayList<Voting> getVotingList(){
        return votingList;
    }

    public void printResults(int index){
        votingList.get(index).printResults();
    }

    public void printVoters(int index){
        votingList.get(index).printVoters();
    }


}
