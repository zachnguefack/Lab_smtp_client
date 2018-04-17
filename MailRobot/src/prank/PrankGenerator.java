package prank;



/*
 *@authors && zacharie nguefack
 *
 *	Definition de Prank tout en respectant les consignes et specifications du cahier de charge, cest à
 *  dire , génère un groupe de personnes et une liste de farces (prank).
 *
 */


public class PrankGenerator {
    
    private final  IConfigurationManager configuration;
    private final List<Person> availableVictims = new LinkedList<>();

    public PrankGenerator(IConfigurationManager configurationManager) {
        this.configuration = configurationManager;

    }
}