Feature: Use Shopping Cart

  Background:
    Given That user open Swag Labs app
    When he submit username and password
      | username      | password     |
      | standard_user | secret_sauce |

  @oneproduct
  Scenario: Buy product
    When He puts in the cart the Sauce Labs Backpack
    And He does the checkout of his purchase
    Then He should see that his purchase is successful

  @manyproducts
  Scenario: Buy product
    When He puts in the cart these products
      | products                 |
      | Sauce Labs Backpack      |
      | Sauce Labs Bike Light    |
#      | Sauce Labs Fleece Jacket |
    And He does the checkout of his purchase
    Then He should see that his purchase is successful