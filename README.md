#OOP - Jets

##User_Navigation

Upon running the JetsApplication Class, the user is prompted with ten choices to select from in a menu. Each selection is associated with an integer number. Once the integer is submitted, the corresponding command is executed and followed by the original menu, prompting another selection. This will repeat until the user selects Quit (10), at which point the program ends.


#Methodology:_Transforming_text_to_an_ArrayList

Jet data originates from the text file "jets.txt". Each line consists of a single jet's model, speed, range, price, and designation of Cargo or Fighter Jet, in that order. In the Airfield class, a new arraylist, named "jets", is instantiated. a bufferedreader and filereader are used to turn each line of the text into a string. Each string (line from jets.txt) is then split at the "," and assigned to a single array, called "lineAsArray". After being assigned to lineAsArray, the line is thrown into an if else statement to determine its categorization as either a FighterJet or CargoPlane, based on the value of lineAsArray[4]. Once the condition of the the if/else statement is made, the array created from the text line is used to instantiate either a new CargoPlane object or FighterJet object, once the string values are parsed according to the value types defined in the abstract Jet SuperClass. From there, the Jet object is added to the method call "addJet" and added to the ArrayList, "jets". This all happens in a while loop, so after line 1 is converted to a Jet object and added to jets, the process repeats with the next line, until there is no lines of text remaining in jets.txt.

#Methodology:_Menu
The main method invokes a displayUserMenu method, that presents the user with a list of ten options. Following the menu, a launch method is called in the main menu, which reads the user menu choice, via scanner, and has a ten-option switch, providing directions for each menu selection by the user. After options 1-9 are selected, the boolean KeepPlaying is set to 'true' and the displayUserMenu and launch methods are looped until KeepPlaying turns to false at the selection of menu option '10'.

Menu Selection 1 - foreach loops through the arraylist of jets and invokes each jet's displayData method from the Jet class, which prints the jet's toString info.

Menu Selection 2 - foreach loops through the arraylist of jets and invokes each jet's fly method from the Jet class, which calculates the time each jet can fly (range/speed).

Menu Selection 3 - creates a fastestSpeed variable, set to 0. Via foreach loop, comes the jet's speed to fastestSpeed and if greater, replaces fastestSpeed with the present jet's speed value. Prints the fastestSpeed and corresponding jet after the foreach loop has completed.

Menu Selection 4 - same as menu selection 3, but uses the variable farthestJet instead of fastestJet and individual jet range instead of jet speed.

Menu Selection 5 - determines if a jet is an instanceof a Cargo Plane. If so, it invokes the loadCargo method, through the CargoCarrier interface, which prints the jet model and a simple message.

Menu Selection 6 - determines if a jet is an instanceof a Fighter Jet. If so, it invokes the fight method, which prints the jet model and a simple message.

Menu Selection 7 - asks the user for parameters of a new jet and assigns answers to the necessary variable types. It then constructs a new JetImpl object with the user answers as object parameters and adds it to the arrayList.

Menu Selection 8 - user is presented the arrayList of jets, each given a numbered order (i =1; i++ on a foreach loop). The user inputs the number of the jet they wish to remove. 1 is subtracted from the user input and assigned to the index of the arrayList which will be selected for removal via .remove(index).

Menu Selection 9 - similar to option 8, option 9 presents the arrayList with in a numbered list (i=1, i++). After the user inputs the number of the jet they wish to fly, the individual jet is invoked by it's index in the arrayList (i-1) and printed out with a message.

Menu Selection 10 - the KeepPlaying boolean value is assigned to false, disqualifying the while loop conditions in the main method.



#Lessons_Learned

We cannot parse "_" to numerical values (long, double, int). I tried inputting price, range, and speed with underscores in place of commas and that provided an error that stumped me for a bit.

Take advantage of calling other methods within a method. In addition to cleaning up the code, it does help execute goals. The biggest roadblock (airblock?) was initially assigning the jets.txt lines to an arrayList. I was overthinking it, when the solution was simply to create a method that took in a jet object and added it to the jets arrayList. Once that method was invoked with the newly formed jet object, it seemed so simple, that I couldn't believe it took so long to discover that as a solution.

It also took me a while to get the specific jet model for my CargoCarrier and CombatReady interfaces. This was a lesson in scope, as I kept getting prompted by the compiler to make a number of methods static. Ultimately I just needed the necessary methods to take in a jet object. So, my takeaway was to lean on method parameters to expand the scope of seemingly limited methods. 
