import java.util.List;

public class Purchase {
    private int _id;
    private Player _user;
    private double _cost;
    private List<Item> _item;
    //default constructor
    public Purchase() {
        _id = -1;
        _user = null;
        _cost = -1.0;
    }

    public void purchaseItem(){
        //stud
    }

    //getters and setters
    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        this._id = id;
    }

    public Player get_user() {
        return _user;
    }

    public void set_user(Player user) {
        this._user = user;
    }

    public double get_cost() {
        return _cost;
    }

    public void set_cost(double cost) {
        this._cost = cost;
    }

    public List<Item> get_item() {
        return this._item;
    }

    public void set_item(List<Item> items) {
        this._item = items;
    }
}
