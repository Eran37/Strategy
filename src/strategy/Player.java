package strategy;

public abstract class Player {

    protected Instrument instrument;

    public Player(Instrument instrument) {
        this.instrument = instrument;
    }

    protected abstract String myInstrument();

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
