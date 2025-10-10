public class Flight {
    String _airlineName, _flightOrigin, _destination;
    int _flightNumber;

    public Flight(String airName, String from, String to, int flightNumber) {
        this._airlineName = airName;
        this._destination = to;
        this._flightOrigin = from;
        this._flightNumber = flightNumber;
    }

    public void set_airlineName(String airlineName) {
        this._airlineName = airlineName;
    }

    public String get_airlineName() {
        return _airlineName;
    }

    public String get_flightOrigin() {
        return _flightOrigin;
    }

    public void set_flightOrigin(String _flightOrigin) {
        this._flightOrigin = _flightOrigin;
    }

    public String get_destination() {
        return _destination;
    }

    public void set_destination(String _destination) {
        this._destination = _destination;
    }

    public int get_flightNumber() {
        return _flightNumber;
    }

    public void set_flightNumber(int _flightNumber) {
        this._flightNumber = _flightNumber;
    }

    @Override
    public String toString() {
        return get_flightNumber() + " will reach " + get_destination() + " at 17:00";
    }
}
