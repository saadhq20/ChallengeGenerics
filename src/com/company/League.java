package com.company;

import java.util.*;

public class League <T extends Team> {
    private String name;
    ArrayList<T> league = new ArrayList<>();

    public League (String name){
        this.name = name;
    }

    public void addTeam(T team){
        if(league.contains(team)){
            System.out.println("Team is already in the league.");
        }
        else{
            league.add(team);
        }
    }

    public void printLeague(){
        Collections.sort(league);
        for(Team t: league){
        System.out.println("Team: " + t.getName() + " Rankings: "+ t.getPoints())  ;
        }
    }
}
