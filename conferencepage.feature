#Sample Feature Definition Template

 
 Feature: Conference Room Booking

  @execute
  Scenario: ConferenceRoomBooking
    Given User is on Conference room booking page
    When select 'Next' link without entering 'FirstName'
    Then 'Please fill the First Name' message should display
    When User select 'Next' link without entering 'LastName'
    Then 'Please fill the Last Name' message should display
    When User select 'Next' link without entering 'Email'
    Then 'Please fill the Email message should display
    When User select 'Next' link after entering invalid 'Email' address
    Then 'Please enter valid Email Id. message should display
    When User select 'Next' link without entering 'Contact No'
    Then 'Please fill the Contact No message should display
    When User select 'Next' link after entering invalid 'Contact No'
    Then 'Please enter valid Contact no message should display
    When User select 'Next' link without selecting  'Number of people attending'
    Then 'Please fill the Number of people attending' message should display
    When User select 'Next' link without entereing  'Building Name & Room No'
    Then 'Please fill the Building & Room No' message should display
    When User select 'Next' link without entereing  'Area Name'
    Then 'Please fill the Area name' message should display
    When User select 'Next' link without selecting  'City'
    Then 'Please select city' message should display
    When User select 'Next' link without selecting  'State'
    Then 'Please select state' message should display
    When User select 'Next' link without selecting  'MemberShip Status '
    Then 'Please Select MemeberShip status' message should display
    When User select 'Next' link after entering 'Valid set of information'
    Then 'Personal details are validated message should display
    Given User is on Payment details page
    Then 'verify the title 'personal Details'of the page
	  When select 'Next' link without entering 'cardholdername'
    Then 'Please fill the cardholder Name' message should display
    When User select 'Next' link without entering 'debit card number'
    Then 'Please fill the debit card' message should display
     When User select 'Next' link without entering 'CVV'
    Then 'Please fill the cvv' message should display
    When User select 'Next' link without entering 'card expiration month'
    Then 'Please fill the card card expiration month' message should display
   When select 'Next' link without entering 'card expiration year'
    Then 'Please fill the card expiration year' message should display
    When user selects make payment button 
     Then 'Conference room booking succesfully done' message should display
   
    
	