@upload
Feature: Je charge une image
  En tantque utilisateur je souhaite upload une image

  Background: 
    Given Je me connecte a l application  OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login

  @post_image
  Scenario Outline: Publier un post dans le modele Buzz
    When Je clique sur le module Buzz
    And Je clique sur l icone Upload Images
    And Je clique sur le bouton Upload Images "C:\\Users\\sameh\\Downloads\\3.png"
    And Je clique sur le bouton post
    When Je clique sur l icone logout
    And Je clique sur le boutton logout
