package com.company;

/*public class Main {

    public static void main(String[] args) {
	// write your code here
        Test<String,Integer> obj = new Test<String,Integer>("Saj",10);
        obj.print();
    }
}



class Test <T,U> {
    T o1;
    U o2;
    Test(T o1,U o2)
    {
        this.o1 = o1;
        this.o2 = o2;
    }
    public void print()
    {
        System.out.println(o1);
        System.out.println(o2);
    }
}*/
//package com.company;

import play.Player;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        Player.BaseballPlayer pat = new Player.BaseballPlayer("Pat");
        com.company.SoccerPlayer beckham = new com.company.SoccerPlayer("Beckham");

        com.company.Team<FootballPlayer> adelaideCrows = new com.company.Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        com.company.Team<Player.BaseballPlayer> baseballTeam = new com.company.Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        com.company.Team<com.company.SoccerPlayer> brokenTeam = new com.company.Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        com.company.Team<FootballPlayer> melbourne = new com.company.Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        com.company.Team<FootballPlayer> hawthorn= new com.company.Team<>("Hawthorn");
        com.company.Team<FootballPlayer> fremantle= new com.company.Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        ArrayList<com.company.Team> teams;
        Collections.sort(teams);
    }
}



