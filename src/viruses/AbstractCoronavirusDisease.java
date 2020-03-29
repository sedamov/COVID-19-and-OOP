package viruses;

public abstract class AbstractCoronavirusDisease {

    final String VIRUS_FAMILY = "Coronaviruses";

    protected String[] symptoms = {"Cough", "Fever", "Tiredness"};

    final boolean IS_FOUND_IN_PEOPLE = true;

    public abstract void spread();

    public abstract void affect();
}
