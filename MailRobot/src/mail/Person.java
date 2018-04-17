package mail;

/*
 *@authors cedric lankeu && zacharie nguefack
 *
 *cette classe stocke les personnes qui sont les victimes de nos mails forgés. 
 * chaque personne a un nom, un prénom et l'email
 */

public class Person {
    
    private String firstname;
    private String lastname;
    private String mailAdress;

    public Person(String firstname, String lastname, String mailAdress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mailAdress = mailAdress;
    }
    
    
}
