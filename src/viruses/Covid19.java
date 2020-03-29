package viruses;


import infectiondegree.FirstDegreeOfInfection;
import infectiondegree.FourthDegreeOfInfection;
import infectiondegree.SecondDegreeOfInfection;
import infectiondegree.ThirdDegreeOfInfection;

import java.util.Arrays;

public class Covid19 extends CoronavirusDisease{


    private final String DISEASE_NAME = "COVID-19";

    private Double OFFICIAL_MORTALITY_RATE = 3.4;

    private final String DESCRIPTION = "Novel Coronavirus disease or COVID-19 is a new type of coronavirus " +
            "that has not been identified previously. Mortality rate based on officially reported cases is " +
            OFFICIAL_MORTALITY_RATE + "%.";

    public String getDiseaseName() {
        return DISEASE_NAME;
    }

    public Double getOfficialMortalityRate() {
        return OFFICIAL_MORTALITY_RATE;
    }

    public String getDescription() {
        return DESCRIPTION;
    }

    public void setOfficialMortalityRate(Double newRate) {
        this.OFFICIAL_MORTALITY_RATE = newRate;
    }

    public void spread() {
        System.out.println(DISEASE_NAME + " spreads from person to person through small droplets from the nose or " +
                "mouth which are spread when a sick person coughs or exhales");
        System.out.println(Arrays.toString(symptoms));
    }

    public void affect() {
        System.out.println("There are 4 levels of infection. When disease starts the lining of the respiratory " +
                "tree becomes injured, causing inflammation. This in turn irritates the nerves in the lining of the " +
                "airway. Just a speck of dust can stimulate a cough (first level). But if this gets worse, it goes " +
                "past just the lining of the airway and goes to the gas exchange units, which are at the end of the " +
                "air passages. If they become infected they respond by pouring out inflammatory material into the " +
                "air sacs that are at the bottom of our lungs. (second level). When air sacs become inflamed this " +
                "causes an “outpouring of inflammatory material [fluid and inflammatory cells] into the lungs and " +
                "we end up with pneumonia (third level). Lungs that become filled with inflammatory material are " +
                "unable to get enough oxygen to the bloodstream, reducing the body’s ability to take on oxygen and " +
                "get rid of carbon dioxide (fourth level). This is the main cause of death.");
    }

    public void affect(FirstDegreeOfInfection firstDegree) {
        System.out.println("This is how disease affects in the " + firstDegree + " of infection.");
        System.out.println("When disease starts the lining of the respiratory tree becomes injured, causing " +
                "inflammation. This in turn irritates the nerves in the lining of the " +
                "airway. Just a speck of dust can stimulate a cough.");
    }

    public void affect(SecondDegreeOfInfection secondDegree) {
        System.out.println("This is how disease affects in the " + secondDegree + " of infection.");
        System.out.println("The disease goes past just the lining of the airway and goes to the gas exchange " +
                "units, which are at the end of the air passages. If they become infected they respond by pouring " +
                "out inflammatory material into the air sacs that are at the bottom of our lungs.");
    }

    public void affect(ThirdDegreeOfInfection thirdDegree) {
        System.out.println("This is how disease affects in the " + thirdDegree + " of infection.");
        System.out.println("When air sacs become inflamed this causes an outpouring of inflammatory material " +
                "[fluid and inflammatory cells] into the lungs and we end up with pneumonia");
    }

    public void affect(FourthDegreeOfInfection fourthDegree) {
        System.out.println("This is how disease affects in the " + fourthDegree + " of infection.");
        System.out.println("Lungs that become filled with inflammatory material are unable to get enough oxygen " +
                "to the bloodstream, reducing the body’s ability to take on oxygen and get rid of carbon dioxide. " +
                "This is the main cause of death.");
    }
}







