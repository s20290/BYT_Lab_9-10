public class Purchase {
    private int _id;
    private Player _user;
    private double _cost;

    //default constructor
    public Purchase() {
        _id = -1;
        _user = null;
        _cost = -1.0;
    }

    public void purchaseItem(){
        //still empty
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
}
