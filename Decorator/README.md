# DecoratorGame
Please note that this will be assessed differently toother labs - you will submit your work on Moodle in a link found under week 10.

And be assessed on how well you follow this style guide:
https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Style_Guide

You will be assessed out of 5 marks - the speciifc requirements are highlighted through the readme.

* **SUBMISSION - Clean Code - 1 Mark:** _Following clean code guidance._

# Getting started

Fork this project and then add your tutor and me as developers: https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/decoratorgame


This is a lab testing your understanding of the decorator pattern by applying it to a video game. In this particular example, you are being shown a poor quality version of the code and being tasked with redesiging it from the ground up. 

You have been tasked with improving the implementation given in SillySwordSetup. At the moment, the class holds a wide range of different variables to track the different gems added to the sword. When at attack is made with the SillySwordSetup it is given a GameCharecter to attack and checks for each Gem variable.

n.b. GameCharecter is not your code and you should not edit it at all in this work except for the Main method. 

## Problems with the system
You do not need to implement these changes but ask yourself the following questions:
* How would you change the current system to allow multiple gems of the same type to be added?
* How would you add in new weapons that could use the same gems?
* If GameCharecter implemented a new type of damage, like shockwave damage, how would you add in a new set of gems to make use of it?


## Better Extensibility with the Decorator Pattern
You need to redesign this system to implement a better version of SillySwordSetup (perhaps one worthy of just being called sword!) following the decorator pattern. The new pattern will function slightly differently becasue it will also allow multiple gems to be added. 

Hints:
* Start by considering page 91 or Head First Design Patterns. 
* Ask yourself what should the component, the concrete components, the decorator and the concrete decorators be in this case?
* GameCharecter is not a part of this redesign.

Before moving to implementation, check your understanding with your tutor or demonstrator - you can probably draw a diagram to show them.


* **SUBMISSION - Decorator Pattern - 1 Mark:** _After you have completed the redesign, you should put an example in the main method of the solution that applies lightning, lesser fire and greater fire gems to the new sword then attack orc 2 with it._
* **SUBMISSION - New weapons - 1 Mark:** _Add a spear to the system with base damage of 40. In main apply the same gems to it as above then use it to atack orc 3._
  

## Fixing lightning exploits

You realise that your game has a serious issue - lightning and firedamage seems to be much, much too strong. Inspecting the SillySwordSetup class you realise that this is because it is not working as intended! The intention is that a sword attack with multiple gem buffs on it should only weaken the GameCharecter once or apply bonus fire damage once but, becasue of the way the current code is implemented, the first lightning gem weakens the target and then each subsequent gem keeps weakening the target or applying bonus damage. In addition, look what happens when you swap the order that the gems are applied to ensure that the lightningvulnerability multiplier is at it's largest for the GreaterLightningGem - thew strength of the attack heavily depends on the order that the gems are called in!

How can you modify your decorator pattern to:
* Apply all the damage from each attack in a single go and remove dependency on the order that the gems are called in. 
* Fix it so that instead of seeing multiple printOuts for each gem, instead we see a single printout for each type of damage the charecter takes?

Youy should implement this using a metho called fixedAttack.

* **SUBMISSION - Lightning and fire fix - 2 marks:** _You should alter your code to fix these issues within a new method called fixedAttack - place an example of a new spear with fire and sword with lightning and fire using fixedAttack to attack orc 4 and 5._



Hints:
* Clone your project before attempting this fix.
* Fixing one of these issues can fix the other.
* Look at Head First Design Patterns page 99 for a clue about this particular issue. The fix is not trivial in this case!
* You might want to build a new class to address this issue

