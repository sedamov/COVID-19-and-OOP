package viruses;

public class CoronavirusDisease {

    final String VIRUS_FAMILY = "Coronaviruses";

    protected String[] symptoms = {"Cough", "Fever", "Tiredness"};

    final boolean IS_FOUND_IN_PEOPLE = true;

    void spread() {
        System.out.println("Basic mechanism to spread a virus");
    };

    void affect() {
        System.out.println("Basic mechanism to hurt one's health");
    };

}

