import java.util.Collection;
import java.util.ArrayList;

public class Team {
    
    private static int global_id = 0;

    private int id;
    private String name;
    private Collection<Player> players;
    private Player leader;

    public void removeTeam() {

    }

    private Team(String name, Player leader) {
        this.name = name;
        id = global_id++;
        this.leader = leader;
        players = new ArrayList<>();
        players.add(leader);
    }
    
    public static Team createTeam(String name, Player player) {
        return new Team(name, player);
    }

    public void addPlayerToTeam(Player player) throws IllegalArgumentException {
        if (players.size() < 4) {
            players.add(player);
        } else {
            throw new IllegalArgumentException("Team is full.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Collection<Player> players) {
        this.players = players;
    }

    public Player getLeader() {
        return leader;
    }

    public void setLeader(Player leader) {
        this.leader = leader;
    }
}