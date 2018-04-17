package configuration;

import java.io.IOException;
import java.util.List;
import mail.Mail;
import mail.Person;

/*
 *@authors zacharie nguefack
 *@authors cedric lankeu
 */

public interface IConfigurationManager {

    public List<Mail> loadMailFromFile(String filename) throws IOException;

    public List<Person> loadAddressFromFile(String filename) throws IOException;

    public void loadPropertie(String filename) throws IOException;

    public String getServerAddress();

    public int getServerport();

    public List<Person> getVictims();

    public List<Mail> getMessages();

    public int getNumberOfGroups();

    public String getSubject();

}