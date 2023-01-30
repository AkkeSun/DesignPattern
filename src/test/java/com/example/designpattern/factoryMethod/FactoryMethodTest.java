package com.example.designpattern.factoryMethod;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class FactoryMethodTest {

    @Test
    void test(){
        TeamFactory teamFactory = new TeamFactory();
        Team team = teamFactory.getTeam("TeamA");
        log.info(team.getTeamName());
    }

}
