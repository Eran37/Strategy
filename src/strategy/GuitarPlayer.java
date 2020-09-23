package strategy;

public class GuitarPlayer extends Player {

    private String name;

    public GuitarPlayer(String name) {
        super(new Guitar());
        this.name = name;
    }

    @Override
    protected String myInstrument() {
        return String.format("Hello! I Am %s, and I play %s", name, instrument.instrument());
    }
}
