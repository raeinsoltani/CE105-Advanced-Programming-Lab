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


}
