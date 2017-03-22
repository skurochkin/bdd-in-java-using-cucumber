Feature: Discount



  Scenario: Slav looking for USB-C to HDMI
    Given WallMart is 2 miles from BestBuy
    When BestBuy have sales on "Computer Cords"
    Then WallMart should sell it with discount
