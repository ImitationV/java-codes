public class Car {
    String _make,_model;
    int _year;

    Car(String make, String model, int year){
        _make = make;
        _model = model;
        _year = year;
    }

    public String get_make() {
        return _make;
    }

    public void set_make(String _make) {
        this._make = _make;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    public int get_year() {
        return _year;
    }

    public void set_year(int _year) {
        this._year = _year;
    }

    @Override
    public String toString(){
        return "My Car is a "+get_make()+" "+get_model()+" from year "+get_year();
    }


}
