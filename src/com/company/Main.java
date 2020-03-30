package com.company;

import jdk.internal.org.objectweb.asm.util.CheckSignatureAdapter;

import java.util.*;

public class Main {

    //private static Object BasketballLeague;

    public static void main(String[] args) {
	// write your code here
//        Basketball Saad = new Basketball("Saad");
//        Team<Basketball> Bulls = new Team<>("Bulls");
//        Team<Basketball> Lakers = new Team<>("Lakers");
//        Team<Basketball> Knicks = new Team<>("Knicks");
//
//        Bulls.addPlayer(Saad);
//
//        Lakers.matchResult(Bulls, 5, 3);
//        Knicks.matchResult(Bulls, 2, 6);
//        Knicks.matchResult(Lakers, 1, 2);
//        League<Team<Basketball>> NBA = new League<>("NBA");
//        NBA.addTeam(Bulls);
//        NBA.addTeam(Lakers);
//        NBA.addTeam(Knicks);
//        NBA.printLeague();
//

        Team<Football> Liverpool = new Team<>("Liverpool");
        Team<Football> ManchesterCity = new Team<>("ManchesterCity");
        Team<Football> LeicesterCity = new Team<>("LeicesterCity");
        Team<Football> Chelsea = new Team<>("Chelsea");
        Team<Football> Arsenal = new Team<>("Arsenal");

        Liverpool.matchResult(ManchesterCity,6,2);
        Liverpool.matchResult(LeicesterCity, 3,1);
        Liverpool.matchResult(Chelsea, 4,2);
        Liverpool.matchResult(Arsenal,6,1);
        ManchesterCity.matchResult(Arsenal,4,2);
        ManchesterCity.matchResult(Chelsea,6,2);
        ManchesterCity.matchResult(LeicesterCity,2,6);
        Arsenal.matchResult(Chelsea, 1,6);
        Arsenal.matchResult(LeicesterCity,7,1);
        Chelsea.matchResult(LeicesterCity,5,6);

        League<Team<Football>> PL = new League<>("Premeire League");
        PL.addTeam(Liverpool);
        PL.addTeam(ManchesterCity);
        PL.addTeam(Arsenal);
        PL.addTeam(LeicesterCity);
        PL.addTeam(Chelsea);

        System.out.println("\n");
        PL.printLeague();

    }
}
