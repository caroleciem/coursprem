# Les commandes de survie en Linux

## Etape 1 : Le minimum vital

- Ouvrez un terminal avec la commande `CTRL + MAJ + T`.
- Testez la première commande pour vous repérer dans le terminal avec `pwd`.
- Affichez le contenu du dossier dans lequel vous vous trouvez.
- Créez un dossier `linux` qui contiendra les fichiers et dossiers pour l'exercice.
- Créez un fichier `notes.txt`.
- Affichez le contenu du fichier `notes.txt`.
- Utilisez un éditeur de texte embarqué dans la console comme `nano` pour écrire dans le fichier.
- Sauvegardez le fichier.
- Affichez à nouveau le contenu du fichier.
- Faites un nouveau dossier `sauvegardes`.
- Copiez le fichier `notes.txt` dans le dossier `sauvegardes` et renommez le en `notes-sauvegarde.txt`.
- Affichez le contenu du dossier sauvegarde.

## Etape 2 : Pour aller plus loin

- Trouvez l'adresse IP de votre machine.
- Trouvez le numéro de processus du terminal `bash` que vous avez ouvert.
- Ouvrez un logiciel en utilisant le bureau et tuez le processus avec votre terminal.
- Donnez le temps moyen qu'un paquet informatique passe sur le serveur entre votre terminal et un serveur de France TV.
- Donnez le nombre de routeurs qu'il y a entre vous et les serveurs de France TV.
- Ecrivez un script `bash` qui prend en paramètre une chaine de caractère pour ensuite afficher le message : _Bonjour cher **entrée**_.
- Utilisez un `cron` pour créer un nouveau fichier vide toutes les 5 minutes qui sera nommé comme suit : _dd-MM-yyyy-HH-mm.log_.

## Étape 3 : Vers l'∞ et au delà !

- Décompresser [l'archive contenant le site web banksy en 1993](../ressource/banksy.zip) dans un répertoire.
- Compter combien il y a de fichiers d'extension`.jpg` sous l'arborescence `www.banksy.co.uk`. Indice : on peut utiliser [find](https://doc.ubuntu-fr.org/tutoriel/console_commandes_de_base#find)
- S'il y a un fichier d'extension `.jpg` qui n'est **pas** une image, le trouver. Indice : on peut utiliser [file](https://doc.ubuntu-fr.org/tutoriel/console_commandes_de_base#file)
- Calculer combien il y a de pixels en tout dans toutes les images d'extension `.jpg`. Indice : on peut utiliser [bc](https://doc.ubuntu-fr.org/bc)
