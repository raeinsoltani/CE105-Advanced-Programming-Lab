package com.company;

public class Vote {
    private final Person voter;

    private final String date;

    public Person getVoter() {
        return voter;
    }

    public String getDate() {
        return date;
    }

    public Vote(Person voter, String date) {
        this.voter = voter;
        this.date = date;
    }
}
