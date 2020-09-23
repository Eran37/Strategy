package strategy;

public class DrumsPlayer extends Player {

    private String name;

    public DrumsPlayer(String name) {
        super(new Drums());
        this.name = name;
    }

    @Override
    protected String myInstrument() {
        return String.format("Hello! I Am %s, and I play %s", name, instrument.instrument());
    }
}
