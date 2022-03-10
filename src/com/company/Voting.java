package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    private int type;

    private String question;

    private HashMap<String, HashSet<Vote>> choices;

    private boolean isAnonymous;

    private ArrayList<Person> voters;

    public ArrayList<String> getChoices(){
        ArrayList<String> choices_String = new ArrayList<String>(choices.keySet());
        return choices_String;
    }

    public void createChoice(String choice){
        choices.put(choice, null);
    }

    public void vote(Person voter, ArrayList<String> voter_choices){
        for (String voter_choices_i : voter_choices){
            HashSet<Vote> voters = choices.get(voter_choices_i);
            Vote vote = new Vote(voter, java.time.LocalDate.now().toString());
            voters.add(vote);
            choices.put(voter_choices_i, voters);
        }
    }


}
