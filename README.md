
# Gestion des Personnes et Villes

Ce projet permet de gérer des **personnes**, qu’il s’agisse d’employés ou de commerciaux, ainsi que leurs **villes de naissance** et, pour les capitales, des **monuments célèbres**.  
Le programme inclut des classes pour représenter les personnes, leurs entreprises, les villes et les capitales, ainsi que des tests pour créer des instances et afficher leurs informations.

## Table des matières
1.  Installation
2.  Utilisation
3.  Structure du projet
4.  Fonctionnalités
## Installation
1.  Assurez-vous d’avoir **Java 8** ou plus installé sur votre machine.
2.  Téléchargez le projet et ouvrez-le dans votre IDE favori (Eclipse, IntelliJ, NetBeans, etc.).
3.  Compilez le projet pour générer les classes.
4.  Vous pouvez exécuter les classes de test directement depuis l’IDE ou en ligne de commande.

**Exemple pour compiler et exécuter depuis le terminal :**

```# Compilation 
javac -d bin src/fr/fms/entities/*.java 
java -cp bin fr.fms.entities.TestPerson` 
```
## Utilisation

1.  **TestCapital**
    -   Crée des instances de capitales avec nom, pays, population et monument.
    -   Affiche les informations de chaque capitale.
2.  **TestPerson**
    -   Crée une liste de personnes, comprenant des employés et des commerciaux.
    -   Affiche les informations de chaque personne.
    -   Calcule et affiche le salaire ou la commission mensuelle de chaque personne.
**Exemple de sortie :**

```
Paris,  France,  2000000  d'habitants,  monument :  Tour  Eiffel 
London,  GB,  9400000  d'habitants,  monument :  Bigben
```
```
Gate,  Bill,  65  ans,  habitant  USA,  ville de naissance :  Washington,  Entreprise: Fondation  B&M,  salaire :  100000  
```
```
Salaire mensuel de Bill Gate :  80000.0  ...
``` 

## Structure du projet
-   **fr.fms.entities** : package contenant toutes les classes.
    -   `City` : représente une ville avec nom, pays et habitants.
    -   `Capital` : hérite de `City` et ajoute un monument.
    -   `Person` : représente une personne avec nom, prénom, âge, adresse et ville de naissance.
    -   `Employe` : hérite de `Person`, avec entreprise et salaire.
    -   `Commercial` : hérite de `Person`, avec entreprise et commission sur chiffre d’affaires.
    -   `TestCapital` : classe de test pour les capitales.
    -   `TestPerson` : classe de test pour les personnes.
## Fonctionnalités
-   Gestion des **villes et capitales**, avec population et monuments.
-   Gestion des **personnes**, incluant employés et commerciaux.
-   Calcul automatique des **salaires** ou **commissions**.
-   Possibilité d’ajouter facilement de nouvelles personnes ou capitales.
-   Validation des données pour éviter des valeurs négatives pour les habitants, salaires ou commissions.

Ce projet est un exemple simple mais structuré de **programmation orientée objet** en Java, avec héritage, polymorphisme et encapsulation.  
Il peut être étendu pour inclure d’autres types de personnes ou de villes, ou pour ajouter des interactions plus complexes entre entités.
