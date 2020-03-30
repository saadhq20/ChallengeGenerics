package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements  Comparable<Team <T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int draw = 0;
    private int points = 0;

    private ArrayList<T> members = new ArrayList<>();


    public void addPlayer(T name){
        if (members.contains(name)){
            System.out.println("Player already exists in the team");
        }

        else{
            members.add(name);
            System.out.println(name + "was added to the Team");

        }

    }

    public void removePlayer(T name){
        if(members.contains(name)){
            System.out.println("Removing: " + name + " From the team." );
            members.remove(name);
        }
        else{
            System.out.println("Player already exists in the team");
        }
    }

    public void matchResult(Team<T> opponent, int OurScore, int theirScore){
        if(OurScore>theirScore){
            won++;
            System.out.println("Team: "+ this.name +" has won the game");
        }
        else if(OurScore<theirScore){
            lost++;
            System.out.println("Team: "+ this.name  +" has lost the game");
        }
        else{
            draw++;
            System.out.println("Both teams drew");
        }
        played++;
        if(opponent!=null){
        opponent.matchResult(null, theirScore, OurScore);}

    }

    public int getPoints(){
        this.points = won*4 + draw - lost*2;
        return points;
    }


    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getDraw() {
        return draw;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.getPoints()> team.getPoints()){
            return -1;
        }
        else if(this.getPoints()< team.getPoints()){
            return 1;
        }
        else {
            return 0;
        }
    }
}
