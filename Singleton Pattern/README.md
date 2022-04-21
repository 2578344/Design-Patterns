# Overview
Creating a new instance of each state is wasteful if you play the game more than once. It would be more efficient to only create one instance of each state. Amend each of the states to be a singleton:
* ``ReadyToPlayState``
* ``StickState``
* ``TwistState``
* ``EndState``

## Setup
* Fork - [https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/singletoncardgamestart](https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/singletoncardgamestart)
* Clone your copy using gitbash
* Open using existing files in your IDE
* If you are interested in pair programming, it is optional, see [video](https://uofglasgow.zoom.us/rec/share/QjQt1zbjuwQGYgMrX1tDDBc-PUqa_CpvxJGI0gV1gvEStOTcGnn55ls_TQVRVbfD.N9qsbYv71kE0iBtJ?startTime=1644928799000),
    * [wiki](https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Pair-Programming) and
    * register on the [form](https://forms.office.com/Pages/ResponsePage.aspx?id=KVxybjp2UE-B8i4lTwEzyELpM2ZClsRNrJBn7A_b41VUQUowMU9CMVNTVUIwQ1lVTjVGSDk3SjRFRS4u)
## Preparation
* Pre-reading - Chapter 5 pg171 - pg179 - The Singleton Design Pattern. 2009 Eric Freeman, Elisabeth Robson, Be Bates, and Kathy Sierra. "Head First Design Patterns“ ~ 20 minutes
* Watch the Singleton Design Pattern Lecture
* Review the example [https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/singletonexample](https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/singletonexample)
* Review the example [https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/singletonrockpaperscissors](https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/singletonrockpaperscissors)
* State Review Lecture ~8 minutes [Lecture](https://uofglasgow.zoom.us/rec/share/mqe0D38E-YIHWAs3vk4OylKy0ouvtPXz7puPRiMVNiAyV-69LM9VfvmS_GigW5Oo.GRBcCHPox5LkeaMM?startTime=1646237116000)

## Black Jack Assignment Instructions
### ``StickState``
* A private constructor
* A private static unique instance of type ``StickState``
* A public static getInstance to create the unique instance if null and return
* Check your tests use the getInstance or any other states
* Run tests for ``StickState`` - This verification step to double check everything works.

### ``TwistState``
* Change into a singleton design pattern
* A private constructor
* A private static unique instance of type ``TwistState``
* A public static getInstance to create the unique instance if null and return
* Check your tests use the getInstance or any other states
* Amend any other states that create this state to use getInstance

### ``ReadyToPlayState``
* Change into a singleton design pattern
* A private constructor
* A private static unique instance of type ``ReadyToPlayState``
* A public static getInstance to create the unique instance if null and return
* Check your tests use the getInstance or any other states
* Amend any other states that create this state to use getInstance

### ``EndState``
* Change into a singleton design pattern
* A private constructor
* A private static unique instance of type ``EndState``
* A public static getInstance to create the unique instance if null and return
* Check your tests use the getInstance or any other states
* Amend any other states that create this state to use getInstance

### ``ReadyToPlayStateTest``
* Run tests - Easy - This verification step to double check your changes have worked

### ``StickStateTest``
* Run tests - Easy - This verification step to double check your changes have worked

### ``TwistStateTest``
* Run tests - Easy - This verification step to double check your changes have worked

### ``EndStateTest``
* Run tests - Easy - This verification step to double check your changes have worked

### ``BlackJack``
* Play game - Easy - This verification step to double check your changes have worked

## Submit
* Before you commit you final solution, double check it can build and all the test you completed can run.
* Go to the Week nine folder and open the assessment
* In text paste the https .git for the forked project
* Zip the project and submit
