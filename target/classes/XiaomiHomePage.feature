#Author: ccha.bellagha@gmail.com

Feature: Selection du menu et clique sur le sous menu
  
  Scenario: Survol du menu et clique sur le sous menu
    Given L'utilisateur est sur la home page 
   
    When L'utilisateur survole le menu "<menu>" et puis clique sur le sousmenu "<submenu>"
    
    Then La page d sousmenu s'affiche et contient le nom "<verificationText>"
    
    
    

 
