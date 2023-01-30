package com.example.designpattern.factoryMethod;

public class TeamFactory {

    public Team getTeam(String teamName){
        Team team = null;
        switch (teamName){
            case "TeamA" :
                team = new TeamA(); break;
            case "TeamB" :
                team =  new TeamB(); break;
        }
        return team;
    }
}
