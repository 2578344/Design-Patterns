# Overview
Create a state design pattern for Black Jack. There should be four states:
* ReadyToPlayState
* StickState
* TwistState
* EndState

## Setup
* Fork - [https://git.dcs.gla.ac.uk/DerekSomerville/StateCardGameStart](https://git.dcs.gla.ac.uk/DerekSomerville/StateCardGameStart)
* Clone your copy using gitbash
* Open using existing files in your IDE

## Assignment Instructions
### StickState
* No change required
* Look and understand how the class is setup and method used
* Run tests for StickState

### TwistState
* Make use of the PlayerState interface

### ReadyToPlayState
* If action is twist set state to a TwistState instance

### ReadyToPlayStateTest
* Run tests

### TwistState
* Play a card to the hand
* If players score is above max score set the game state to EndState
* Else set to ReadyToPlayState

### TwistStateTest
* Run tests

### EndState
* determine winner


### EndStateTest
* Run tests

### BlackJack
* Play game

## Optional Advanced
* Restart the game with new cards dealt if not end game
* Play BlackJack
