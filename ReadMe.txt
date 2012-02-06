=============
  OVERVIEW 	*
=============
IPRM - Flickr API

Master 2 - Informatique
Universit� Bordeaux 1
U.E : IPRM
Professeur : Mr David Bromberg

	MATHIEU TAMBRUN 
		mathieu.tambrun@etu.u-bordeaux1.fr

	RAFIK FERROUKH
		rafik.ferroukh@etu.u-bordeaux1.fr

			2011 - 2012

=============
  LANCEMENT *
=============
Se mettre sous le repertoire /Flickr
Commande :
	- mvn clean install 
	- mvn exec:exec
			
NOTE : Le point d'entr�e de notre programme est la classe 'FlickrApp' qui lance l'application
La classe FlickrTest permet de tester toutes les fonctionnalit�s une par une (si besoin est !)

=============
  OPTIONS 	*
=============

Nous avons r�alis� une application Flickr correspondant au cahier des charges d�fini par les
sujets de TD. Toutes les fonctionnalit�s demand�s ont �t� impl�ment�es.

Notre application permet donc de :

	- R�cup�rer un ensemble de photo portant un tag sp�cifi�
	- Afficher ces photos dans une GUI
	- Uploader une image sur un compte Flickr
	- R�cup�rer les infos d'une personne via son "username"
	- R�cup�rer un "username" � partir d'une adresse e-mail
	- R�cup�rer les groupes affili�s � une personne via son "username"

===============
  UTILISATION *
===============
La premiere chose � faire :
	
	- S'authentifier sur le site de Flickr : http://www.flickr.com/
	- Compte Google donn� pour les tests : 
	
		* Compte : water.shak@gmail.com
		* Mot de passe : iprm_flickr
NOTE :

Option Menu Use Default Key : 
	
	- Permet de mettre l'API_KEY du compte Google donn� dans les champs API_KEY des onglets
	- Vous pouvez d�sactiver en selectionnant 'Unuse Default Key'
	
Onlget 'Upload de photo' :

	- Saisir les informations demand�es 
	- Cliquer sur 'Genererate URL' pour Generer l'URL de validation du FROB affich� dans le TextField 'URL'
	- Apres validation du FROB dans un navigateur, Cliquez sur 'It is validated'
	- NOTE : 'Use default key and secret' permet de mettre directement (en la cochant) l'API_KEY et le SECRET du compte google donn�.
	
Onglet 'Search photos' :

	- Saisi des informations et cliquez sur le bouton 'Search Photos'
	- Une autre fenetre s'ouvre pour afficher les images correspondant au 'tag' et leurs descriptions
	- A noter qu'a chaque recherche, on reouvre une autre fenetre d'affichage
	- NOTE : On peut garder a chaque fois la meme fenetre en cochant 'Use the same window',
		* il est � noter que c'est la derniere fenetre chargee qui est concernee
	
Onglet 'User Groups' :
	- Saisir les informations 
	- Les boutons 'Next' et 'Previous' affichent au fur et a mesure les groupes existant s'il y en a.
	
Les autres onglets sont simples ==> saisi d'informations et affichage dans le panel 'result'.

le TextArea permet d'afficher toutes les informations : NOTIFICATION de VALIDATION ou D'ERREUR.

Un Menu est accessible pour acceder aux fonctionnalites d'une autre maniere
	
=============
  OUTILS 	*
=============
	- Maven : pour la construction du projet et sa gestion.
	- Netbeans : pour developper la GUI offrant les fonctionnalites deja decrites
	- Swing : framework utilise pour les GUI



