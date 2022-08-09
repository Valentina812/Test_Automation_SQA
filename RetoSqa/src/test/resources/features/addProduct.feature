#Autor: Valentina Ramirez Grajales

Feature: As a user I want to add a product to the shopping cart

  Scenario Outline: User add a product to the shopping cart
    Given The user enters the page plaza Vea
    When User search for the product
      | consultOne | email   |
      | <Consult1> | <email1> |
    Then Validate the status of the product
    Examples:
      | Consult1  | email1                         |
      | Iphone 11 | valentinaramirez375@gmail.com |






