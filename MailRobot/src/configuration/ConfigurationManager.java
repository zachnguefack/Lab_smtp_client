package configuration;

/*
 *@authors acharie nguefack 
 *@authors cedric lankeu
 *description:dans cette classes nous allons utiliser nos fichiers de configuration
 * pour creer les emails forgés
 
 *
 */

public class ConfigurationManager implements IConfigurationManager {


    public ConfigurationManager() throws IOException {

    }


    @Override
    public List<Person> loadAddressFromFile(String filename) throws IOException {

        return null;
    }

    
    @Override
    public void loadPropertie(String filename) throws IOException  {
        return;
    }


    @Override
    public List<Mail> loadMailFromFile(String filename) throws IOException {

        return null;
    }


}
