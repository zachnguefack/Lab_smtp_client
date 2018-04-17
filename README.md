# HEIGVD-RES-2017-Labo-SMTP
�
Auteur: Zacharie Nguefack && Silver Kameni
Date: 2017-04-13
[Liens du repos] (https://github.com/silverkameni/Teaching-HEIGVD-RES-2017-Labo-SMTP)

## OBJECTIFS
Le but de ce laboratoire �tait de D�velopper une application client SMTP qui joue automatiquement des farces sur des groupes d'adresses e-mail (liste des victimes).
Il existe un fichier que l'utilisateur peut modifier pour d�finir une liste d'adresses e-mail (victims.utf8).
Un autre fichier qui peut �tre �dit� pour sp�cifier une liste de messages de farce (d�finir une liste de messages �lectroniques) d�limit�s l'un de l'autre par la s�quence "** @@@ **". Ce courrier sera envoy� � tous les destinataires du groupe, � partir de l'adresse de l'exp�diteur du groupe. En d'autres termes, les victimes destinataires seraient amen�es � croire que la victime exp�ditrice leur a envoy� le courrier.
Le troisi�me fichier peut �galement �tre �dit� par l'utilisateur, il contient l'adresse du serveur, le nombre de groupes qu'il souhaite former dans sa liste d'adresses de courrier �lectronique et d'autres propri�t�s de configuration. Dans chaque groupe de victimes, il devrait y avoir 1 �metteur Et au moins 2 destinataires (c'est-�-dire que la taille minimale pour un groupe est de 3).

## Choix 
Dans ce laboratoire, nous avons d�velopp� une application client (TCP) en Java. Cette application client utilise l'API Socket pour communiquer avec un serveur SMTP. Notre code est en fait une ** impl�mentation partielle du protocole SMTP **.
Les objectifs de ce laboratoire sont les suivants:
��1 - Faire des exp�riences pratiques pour se familiariser avec le ** protocole SMTP **, c'est-�-dire pouvoir utiliser un outil de ligne de commande pour communiquer avec un serveur SMTP ** et envoyer des messages bien form�s au serveur, en envoyant des courriels � l'adresse de votre choix.

��2 � Permettre de ** Voir comment il est facile d'envoyer des e-mails forg�s **, qui semblent �tre envoy�s par certaines personnes, mais en r�alit�, sont �mis par des utilisateurs malveillants.
��
��3 - Comprendre ce que  signifie ** mettre en �uvre le protocole SMTP ** et pouvoir envoyer des messages �lectroniques, en travaillant directement sur l'API Socket, il convient de noter que l'utilisation de la biblioth�que SMTP n'�tait pas autoris�e .

��4 � Nous initiez aux notions de ** test double ** et ** mock mock server **, qui sont utiles lors du d�veloppement et du test d'une application client-serveur. Le ** serveur simulateur ** simule un serveur smtp et emp�che la saturation du r�seau par les mails multiples.

��5 � Nous devions ** Concevoir un mod�le orient� objet simple ** pour mettre en �uvre les exigences fonctionnelles et sp�cification de la t�che. La diffusion sur Internet propos�e par notre professeur a �t� d'une grande aide. Vous pouvez parcourir les liens suivants vers les web�missions.
��[Youtube Webcast part 1] (https://youtu.be/ot-bDyqgTtk)
��[Youtube Webcast part 2] (https://youtu.be/Nj34XicS6JM)
��[Youtube Webcast part 3] (https://youtu.be/LoFKsT9Rj10)
��[Youtube Webcast part 4] (https://youtu.be/OrSdRCt_6YQ)


## Description de la mise en �uvre

Nous avons choisi de d�finir une classe MailSmtp qui joue le r�le de notre client smtp. Cette classe contient une classe interne appel�e smtpException qui d�coule d'une exception dont le r�le consiste � lancer  une exception � chaque fois que nous avons une r�ponse n�gative du serveur, par ce que nous enregistrons la derni�re commande envoy�e par l'utilisateur. Cela d�termine pourquoi l'exception a �t� lanc�e.

Nous avons un paquetage(package) de configuration dans lequel nous avons une classe nomm�e ConfigurationManager dont le r�le est de lire le contenu des fichiers de configuration (configuration.properties).

Dans le package model.mail, nous avons 3 classes.
La classe Group est une structure de donn�es qui recevra des instances de classe Person �galement trouv�e dans ce paquet. Les groupes de personnes (victims) sont stock�s dans cette structure de donn�es sous la forme d'une liste.
La classe Person d�finit une personne en mettant � disposition ses informations personnelles (nom, pr�nom et adresse).
La classe Mail � elle seule poss�de toutes les informations d'en-t�te n�cessaires pour envoyer un courrier. Les membres du champ sont initialis�s � partir des fichiers de configuration.
Dans le mod�le package prank
Nous avons 2 classes.
La classe PrankGenerator qui g�n�re un groupe de personnes et une liste de farces (prank).
La classe Prank contient toutes les informations requises pour effectuer un mail (emetteur et destinataires)


## Installation et utilisation d'un serveur SMTP simplifi�

Nous avons utilis� le serveur MockMock. La configuration est disponible [ici] (https://github.com/tweakers-dev/MockMock). Un fichier Jar vous est fourni en t�l�chargement, vous aurez juste a le dezipper sur votre ordinateur.En proc�dant ainsi, les fichiers de programmes mockmock sont transf�r�s sur votre ordinateur. Maintenant, nous pouvons ex�cuter le serveur simul� en ouvrant un shell bash dans le r�pertoire ��target�� et en ex�cutant la commande ��java -jar MockMock-1.4.0.one-jar.jar��. Cela va ex�cuter MockMock sur les ports par d�faut 25 (pour SMTP) et 8282 (l'interface Web). 
Une fois qu'il a d�marr�, vous pouvez utiliser votre navigateur Internet pour naviguer vers http:// localhost:8282.
Pour ex�cuter MockMock sur un autre port, vous pouvez le d�marrer avec le param�tre * -p * pour indiquer le ** port SMTP ** et le * -h * pour indiquer le ** port HTTP **. par exemple
`Java -jar MockMock.jar -p 2525 -h 8080`
Cela ex�cutera MockMock sur ** SMTP ** port 2525 et le port http 8080.

_ ** Qu'est-ce qu'un serveur Mock? ** _
Il s'agit d'une application qui offre les services d'un ** Serveur SMTP ** sur votre machine locale lorsqu'il est en cours d'ex�cution. Le serveur s'ex�cute sur un port local et un service http sur un autre.

