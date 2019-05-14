# java-inheritance-ic

#### Exercise 1: 
Create the following classes inheriting each other. Include the attribute below each class:
- State
  - state = "Tennessee"
- County
  - county = "Shelby"
- City
  - city = "Memphis"
- Area
  - area = "Midtown"
  - buildingName

Create an ArrayList of two new Areas in Midtown. Print the state, county, and city of one of the buildings to confirm inheritence is working properly.


#### Exercise 2:
Create the class Container with the following attributes
- hasHandle
- name

Create the following three classes inheriting Container
- Cup
- Quart
- Gallon

Make sure each of the three classes has the following attributes
- ounces
- currentVolume
- height
- toString

A new cup will always have 8oz, the user will choose the height and volume, and will print "This cup is holding [currentVolume]". A new pint will always have 32oz, the user will choose the volume, height of 8in, and will print "This quart is holding [currentVolume]". A new gallon will always have 128oz, a height of 23in, volume of 120oz, and will print "This gallon is holding [currentVolume]".

Create an ArrayList of Containers with at least one Cup, Quart, and Gallon. Use toString to print each one.
