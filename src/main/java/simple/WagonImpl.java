package simple;

/**
 * //
 *
 * @author Alexander Andrienko
 */
public class WagonImpl extends PassengerCar implements Wagon {
    private Trailer trailer;

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public Trailer getTrailer() {
        return trailer;
    }
}
