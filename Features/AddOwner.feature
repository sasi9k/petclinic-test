Feature: Add Owner for Elasticbeanstalk
   Add Owner for Elastic beans stalk

  @addowner
  Scenario Outline: Add Owner for Elasticbeanstalk
    Given Open Home Page forElasticbeanstalk 
    And click on Find owners and click on Add owner
   	And Enter  these values "<firstname>","<lastname>","<address>","<city>","<telephone>"
   	Then Click On add owner

      Examples: 
      |firstname| lastname   | address            |city    |telephone   |
      |Anoosha  |Jagarlamudi | Wallingford square |Sterling|8972347897|
     
