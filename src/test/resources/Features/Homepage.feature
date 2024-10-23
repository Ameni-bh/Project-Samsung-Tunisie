#Author: Ameni
Feature: Page daccueil Samsung 
  

  @tag1
  Scenario: Affichage de la page de produits climatiseurs
    Given lutilisateur est dans la page daccueil
    
    When lutilisateur survolle le menu "Électroménager" et clique sur le sous menu "Climatiseur"
   
    Then la page climatiseur saffiche avec son nom "Climatiseur"


