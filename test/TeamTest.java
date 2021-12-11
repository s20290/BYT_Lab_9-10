import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TeamTest {
    
    Team team;
    Player leader;

    @Before
    public void setUp() {
        leader = new Player("Alex", "is@sus.amogus");
        team = Team.createTeam("Amogus", leader);
    }

    @Test
    public void testGetId() {
        var leader2 = new Player("Lukasz", "luki@sus.amogus");
        var team2 = Team.createTeam("Sus", leader2);

        assertNotEquals(team.getId(), team2.getId());
    }


    @Test
    public void testSetId() {
        team.setId(20);
        assertEquals(20, team.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Amogus", team.getName());
    }

    @Test
    public void testSetName() {
        team.setName("Team");
        assertEquals("Team", team.getName());
    }

    @Test
    public void testGetPlayers() {
        var players = team.getPlayers();
        assertTrue(players.contains(leader));
    }

    @Test
    public void testSetPlayers() {
        var players = new ArrayList<Player>();
        players.add(new Player("Lukasz", "luki@sus.amogus"));
        players.add(new Player("Dima", "dima@sus.amogus"));

        team.setPlayers(players);
        assertEquals(players, team.getPlayers());
    }

    @Test
    public void testGetLeader() {
        assertEquals(leader, team.getLeader());
    }

    @Test
    public void testSetLeader() {
        var newLeader = new Player("Adam", "halo@kartus.halo");
        team.setLeader(newLeader);
        assertEquals(newLeader, team.getLeader());
    }

}