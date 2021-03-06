
import java.util.ArrayList;
import java.util.List;

/*
_nickName is user's in-game name
_email stores the email address the user used to register
*/

public class Player extends Guest {
    private String _nickName;
    private String _email;
    private List<Player> _friends;
    private List<Item> _items;
    private Payment _payment;
    private Team _team;

    public Player(String _nickName, String _email) {
        super();

        this._nickName = _nickName;
        this._email = _email;
        this._friends = new ArrayList<>();
        this._items = new ArrayList<>();
        this._team = null;
    }

    public void removeFriend(int index){
        _friends.remove(index);
    }

    public void addFriend(Player player){
        _friends.add(player);
    }

    public void signOut(){
        //terminate connection to database
    }
    

    public void joinTeam(Team team){
        _team = team;
        team.addPlayerToTeam(this);
    }

    public void exitTeam(){
        if(_team != null){
            _team.getPlayers().remove(this);
        }
    }


    //setter getter

    public String get_nickName() {
        return _nickName;
    }

    public void set_nickName(String _nickName) {
        this._nickName = _nickName;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public List<Player> get_friends() {
        return _friends;
    }

    public void set_friends(List<Player> _friends) {
        this._friends = _friends;
    }

    public List<Item> get_items() {
        return _items;
    }

    public void set_items(List<Item> _items) {
        this._items = _items;
    }

    public Payment get_payment() {
        return _payment;
    }

    public void set_payment(Payment _payment) {
        this._payment = _payment;
    }

    public Team get_team() {
        return _team;
    }

    public void set_team(Team team) {
        this._team = team;
    }
}
