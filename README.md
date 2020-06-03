# week7

Question Topic: Spring Framework IoC 

Question: Consider you are building a Mobile which has dependencies of Camera, Screen, Speaker which has-a relation.  

Below is the prototype of the classes (only sample) 
Class -> Mobile 
Fields -> camera, speaker, screen 

Class -> Screen 
Fields -> len, bre
Class -> camera 
Fields -> no of mg_pixels etc.,
Class -> Speaker
Fields -> vol_levels, speaker_type

Create .xml files listed below for the classes  
mobileContext.xml  - Mobile 
screenContext.xml – Screen 
cameraContext.xml - Camera
speakerContext.xml – Speaker 


Create a App.java file which will load the mobile class 

Note: Make sure to use auto wire. 

