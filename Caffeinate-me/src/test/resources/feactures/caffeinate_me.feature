#Author: your.email@your.domain.com
Feature: Order a coffe
  I order to save time when I pick up my morning coffe
  As a coffer lover
  I want to be able to order my coffe in advance

  Scenario: Buyer orders a coffe
    Given Caty is 100 meters from the coffe shop
    When Caty orders to large capuccino
    Then Barry should know that the order
    And Barry should know that the coffe is Urgent