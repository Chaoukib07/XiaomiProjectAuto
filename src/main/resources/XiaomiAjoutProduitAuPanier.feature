#Author: ccha.bellagha@gmail.com

Feature: Ajout produit au panier 

  
  Scenario: Sélection produit apres verification et ajout au panier 
    Given L'utilisateur clique sur le produit "<productName>"
    And  L'utilisateur est rederigé vers la page qui contient le nom du produit"<productName>"
    When L'utilisateur ajoute le produit au panier 
    And clique sur le panier 
    And clique sur le bouton voir panier 
    Then L'utilisateur est derigé vers la page qui contient et le message "Shopping Cart" et  le nom du produit "<productName>" 
    

 
