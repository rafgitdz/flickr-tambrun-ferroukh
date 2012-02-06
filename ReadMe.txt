=============
  OVERVIEW 	*
=============
IPRM - Flickr API

Master 2 - Informatique
Université Bordeaux 1
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
			
NOTE : Le point d'entrée de notre programme est la classe 'FlickrApp' qui lance l'application
La classe FlickrTest permet de tester toutes les fonctionnalités une par une (si besoin est !)

=============
  OPTIONS 	*
=============

Nous avons réalisé une application Flickr correspondant au cahier des charges défini par les
sujets de TD. Toutes les fonctionnalités demandés ont été implémentées.

Notre application permet donc de :

	- Récupérer un ensemble de photo portant un tag spécifié
	- Afficher ces photos dans une GUI
	- Uploader une image sur un compte Flickr
	- Récupérer les infos d'une personne via son "username"
	- Récupérer un "username" à partir d'une adresse e-mail
	- Récupérer les groupes affiliés à une personne via son "username"

===============
  UTILISATION *
===============
La premiere chose à faire :
	
	- S'authentifier sur le site de Flickr : http://www.flickr.com/
	- Compte Google donné pour les tests : 
	
		* Compte : water.shak@gmail.com
		* Mot de passe : iprm_flickr
NOTE :

Option Menu Use Default Key : 
	
	- Permet de mettre l'API_KEY du compte Google donné dans les champs API_KEY des onglets
	- Vous pouvez désactiver en selectionnant 'Unuse Default Key'
	
Onlget 'Upload de photo' :

	- Saisir les informations demandées 
	- Cliquer sur 'Genererate URL' pour Generer l'URL de validation du FROB affiché dans le TextField 'URL'
	- Apres validation du FROB dans un navigateur, Cliquez sur 'It is validated'
	- NOTE : 'Use default key and secret' permet de mettre directement (en la cochant) l'API_KEY et le SECRET du compte google donné.
	
Onglet 'Search photos' :

	- Saisi des informations et cliquez sur le bouton 'Search Photos'
	- Une autre fenetre s'ouvre pour afficher les images correspondant au 'tag' et leurs descriptions
	- A noter qu'a chaque recherche, on reouvre une autre fenetre d'affichage
	- NOTE : On peut garder a chaque fois la meme fenetre en cochant 'Use the same window',
		* il est à noter que c'est la derniere fenetre chargee qui est concernee
	
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



