public class Purchase {
    private int _id;
    private Player _user;
    private double _cost;


    public void purchaseItem(){
        //still empty
    }

    //getters and setters
    public int get_id() {
        return _id;
    }

    public void setNUMBER(int id) {
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
