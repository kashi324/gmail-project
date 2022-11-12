Feature: Gmail Compose

  Scenario Outline: 
    Given open an "chrome" browser
    And lauch site using "https://www.gmail.com"
    When do login using "srinivasaraokashi@gmail.com" and "9032042174" credentials
    Then compose is displayed
    When click on compose and fill fields and send mail and check response
      | to                             | subject        | body                                    | 
      | kasiviswanadh324@gmail.com     | how r u man    | this is kashi                           | 
      | viswanadhkasi24@gmail.com      | hai kashi      | good morning kashi                      | 
      | kalyanchakravarthi53@gmail.com | hai kalyan sir | Good morning\n kalyan garu\n how ae you |
    When do logout
    Then login page should be redisplayed
    When close site
