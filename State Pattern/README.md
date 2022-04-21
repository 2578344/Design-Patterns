# Overview
For the Traffic Light Package, change the flow of colours. So currently it is Red, Green, Amber, Red. The new flow should be Red, Green, Amber, Blue, Red.

Create a state design pattern for Black Jack. There should be four states:
* ``ReadyToPlayState``
* ``StickState``
* ``TwistState``
* ``EndState``
The reason for this change is try to make BlackJack similar so the logic of moving states is not done using the state design pattern. We could now easily add a state to take a bet without effecting the core logic in BlackJack of how to play the game, 

## Setup
* Fork - [https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/statecardgamestart](https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/statecardgamestart)
* Clone your copy using gitbash
* Open using existing files in your IDE
* If you are interested in pair programming, it is optional, see [video](https://uofglasgow.zoom.us/rec/share/QjQt1zbjuwQGYgMrX1tDDBc-PUqa_CpvxJGI0gV1gvEStOTcGnn55ls_TQVRVbfD.N9qsbYv71kE0iBtJ?startTime=1644928799000),
    * [wiki](https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Pair-Programming) and
    * register on the [form](https://forms.office.com/Pages/ResponsePage.aspx?id=KVxybjp2UE-B8i4lTwEzyELpM2ZClsRNrJBn7A_b41VUQjREOTQxTDZZVEYzNDhRMVY3WERWWDc2TC4u)

## Preparation
* Pre-reading - Chapter 10 pg393 - pg420 - The State Design Pattern. 2009 Eric Freeman, Elisabeth Robson, Bert Bates, and Kathy Sierra. "Head First Design Patterns“ ~ 20 minutes
* Watch the Adaoter Design Pattern Lecture
* Review the example [https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/statetrafficlight](https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/statetrafficlight)
* State Review Lecture ~8 minutes [Lecture](https://uofglasgow.zoom.us/rec/share/WIUsGVfxAQPODjKMPgrGdGdzlHRobhY3JECN0BhJw9T2KIcsJ-F-4zcOqLecZLAz.QfKdoVbAIc4qCLvY?startTime=1645812387000)

## Traffic Light Instructions
* Go to the TrafficLight package
* Create a Blue enumerator in the ``LightColour`` - Easy
* Create a new sub-class state called ``BlueState`` that implements `ColourState` - Easy
  * This should trigger the ``RedState`` - Easy
* Amend the AmberState to trigger the ``BlueState`` - Easy
* Run the ``TrafficLight`` to get Red, Green, Amber & Blue - Easy


## Black Jack Assignment Instructions
### ``StickState``
* No change required
* Look and understand how the class is setup and method used
* Run tests for ``StickState`` - This verification step to double check everything works.

### ``TwistState``
* Make use of the ``PlayerState`` interface - Easy

### ``ReadyToPlayState``
* If action is twist set state to a ``TwistState`` instance - Easy

### ``ReadyToPlayStateTest``
* Run tests - Easy - This verification step to double check your changes have worked

### ``TwistState``
* Play a card to the hand - Easy
* If players score is above max score set the game state to EndState - Moderate
* Else set to ``ReadyToPlayState`` - Easy

### ``TwistStateTest``
* Run tests - Easy - This verification step to double check your changes have worked

### ``EndState``
* determine winner - Easy

### ``EndStateTest``
* Run tests - Easy - This verification step to double check your changes have worked

### ``BlackJack``
* Play game - Easy - This verification step to double check your changes have worked

### Advanced
* Restart the game with new cards dealt if not end game - Advanced
[11:25] Derek Somerville
    

* Restart the game with new cards dealt if not end game
  * if end action passed end the game else
    * Remove cards from each player so they no longer have the previous hand
    * deal the cards
    * continue the game, what is the starting state to go to
* Play BlackJack



(1 liked)
* Play ``BlackJack``

## Submit
* Before you commit you final solution, double check it can build and all the test you completed can run.
* Go to the Week eight folder and open the assessment
* In text paste the https .git for the forked project
* Zip the project and submit
