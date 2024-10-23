#Author: Ameni
@tag
Feature: Passer une commande sur le site Samsung
  

  
  Scenario: Ajout produit au panier
    Given lutilisateur est dans la page dun produit choisi
    When lutilisateur clique sur le bouton Acheter puis sur le bouton CONTINUER MES ACHATS
     Then Le produit est ajoute dans le panier avec son "Climatiseur Samsung 12000 BTU Chaud/Froid"
   


