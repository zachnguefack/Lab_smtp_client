package smtp;


/*
 *@authors  zacharie nguefack et lankeu
 *
 *	cette classe permet d'etablir la communication entre le client et le serveur 
 *	tout en respectant spécifications du protocole SMTP et nous assurons egalement 
 *	qu'a chaque envoie, la reponse du serveur et si jamais une exception en cas de 
*	d'erreur.
 */
public class MailSmtp {
    

    public MailSmtp() {
       
    }
 
}


/**
     *
     * creation nouvelle exception
     * @param code_error :  code d'erreur qui est retourné par le serveur.
     * @param error_msg  :  message d'erreur.
	 * @param last_cmd   :  dernière commande envoyée par  l'erreur.
     */
class SmtpException extends Exception {

    public SmtpException(String last_cmd, int code_error, String error_msg) {
        
    }


}

