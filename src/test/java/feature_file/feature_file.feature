Feature:Adactin Login page

  Scenario: User login credential
    Given user launch the url
    When user enter the user name
    Then user enter the password
    And user click the login button

    Scenario: Adactin Search Hotel
      Given user select the location
      When user click and select the relevent hotel
      Then user click and select the room type
      Then user click and select the no of rooms required
      Then user click and search and select the required checkin date
      Then user click and search and select the required checkout date
      Then user click and select the no of required Adult rooms
      Then user click and select the no of required child rooms
      And  user click the search option button

      Scenario: Adactin Select Hotel
     Given user click and select the Hotel
     When user click the continue button

        Scenario: Adactin Book a Hotel
          Given user scroll down the page
          When user enter the first name
          When user enter the last name
          When user enter the billing address
          When user enter the creditcard no
          When user click and select the credit card type
          When user click and select the expiry date
          When user click and select the expiry year
          When user enter the cvv no
          And user click the book now button

          Scenario: Adactin booking Confirmation page

            Given user scroll the page down
#            When user click the About



