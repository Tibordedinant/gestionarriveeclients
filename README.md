
# gestionarriveeclients
Projet Java pour la gestion des arrivées de clients pour le CEAS Enduro Bertrix
>>>>>>> b815abac4dacfcf0880281fe600e435c5260cd09

# GestionArriveeClients

Ce projet est un système de gestion des arrivées de clients.

## IDE recommandé
- **IDE** : Visual Studio Code (VSCode)
- **Version** : 1.99.3
- **Extensions recommandées** : Java Extension Pack (si tu développes en Java)

## Version de Java
- **Java** : 21 (OpenJDK 21.0.7 LTS)
  - Le projet utilise la version **OpenJDK 21 LTS** (version 21.0.7) pour le développement.
  - Assurez-vous que cette version est installée pour éviter tout problème de compatibilité.

## Dépendances

Ce projet utilise les bibliothèques suivantes pour les tests unitaires et les assertions :

### 1. **JUnit 4.13.2**
JUnit est utilisé pour l'écriture des tests unitaires.

- Version : 4.13.2
- Téléchargement : [JUnit 4.13.2](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/4.13.2)

### 2. **Hamcrest 1.3**
Hamcrest est utilisé pour fournir des matchers afin de rendre les assertions plus lisibles.

- Version : 1.3
- Téléchargement : [Hamcrest 1.3](https://mvnrepository.com/artifact/org.hamcrest/hamcrest-core/1.3)

## Ajouter des dépendances au projet

Les bibliothèques sont ajoutées manuellement dans le projet sous forme de fichiers `.jar`. Si tu veux ajouter ou mettre à jour une dépendance :

1. Télécharge le fichier `.jar` de la bibliothèque souhaitée à partir des liens ci-dessus (ou d'une autre source).
2. Place-le dans le dossier `lib/` (à la racine du projet).
3. Assure-toi que le fichier est inclus dans la configuration de ton projet en utilisant le fichier `settings.json` (référence de `lib/**/*.jar`).

## Structure du projet

- **`src/`** : Dossier contenant le code source Java.
- **`bin/`** : Dossier contenant les fichiers `.class` compilés.
- **`lib/`** : Dossier contenant les bibliothèques `.jar` (par exemple, JUnit et Hamcrest).

## Instructions d'installation
1. Clonez ce dépôt :
   ```bash
   git clone https://github.com/Tibordedinant/gestionarriveeclients.git
