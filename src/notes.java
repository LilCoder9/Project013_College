
public class notes {
/*Description
Modify and update your program from Assignment 3 that defined and tested a Computer class with a VideoCard.  For this assignment we’ll only use the VideoCard class. The VideoCard class will be extended by the DiscreteVideoCard and IntegratedVideoCard classes. Pay careful attention to any changes within each individual class as classes are different than described in Assignment 3 as well as any changes in the test program.

NOTE:  For all classes, additional constructors can be added as needed, but must be documented in the UML.  

VideoCard:
The VideoCard class should contain the following information:  
-	type (integrated, discrete, etc.)
-	power requirements (in watts)
-	memory (in GBs)
-	Include a default constructor
-	A constructor to set the type, power requirements, and memory size of a VideoCard.
-	There should also be a method called toString() that returns detailed, formatted information about the VideoCard and its current state.
-	By default, a VideoCard should be of type “integrated”, with a power requirement of 100 watts, and 1GB of memory.
-	Error checking should be used on the power requirements to keep them in the range of 1-300W (default 200 if above 300, 75 if below 1), and the memory should be kept between 1-12 GB (default 12 if above 12, 1 if below 1).

IntegratedVideoCard:
The IntegratedVideoCard class is a subclass of VideoCard and should contain data members to represent:  
-	the amount of shared video memory in watts; 
-	Whether or not the card uses the Computer’s RAM for shared memory.
-	Include a default constructor 
-	A constructor to set the the properties of an IntegratedVideoCard.
-	All constructors should make sure to set the appropriate type of card.
-	There should be a method called toString() that returns information from both the VideoCard’s toString() and detailed information about the IntegratedVideoCard.
-	By default, an IntegratedVideoCard has 2 GB of shared memory and does not need access to the Computer’s RAM.

DiscreteVideoCard:
The DiscreteVideoCard class is a subclass of VideoCard and should contain data members to represent:  
-	Motherboard connection type (PCIEx4, PCIEx8, etc.)
-	External power type (6-pin, 8-pin, dual, etc.)
-	Include a default constructor
-	A constructor to set the properties of a DiscreteVideoCard.
-	All constructors should make sure to set the appropriate type of card.
-	There should be a method called toString() that returns information from both the VideoCard’s toString() and detailed information about the DiscreteVideoCard.
-	By default, a DiscreteVideoCard has a motherboard connection of PCIEx8 and an external power type of 6-pin.

NOTES:  Use appropriate visibility modifiers based on class discussion.  Use accessor/mutator methods and the this and super keywords when appropriate.
 
UML:
Create a simplified UML diagram that describes all classes and their relationships.  Include multiplicity for any associations (if needed).  Include the proper aggregation symbols for the classes.  You should provide full details (including visibility) for each class (all instance members) but can create a separate diagram using simplified class UML to show only the relationships (including inheritance), if desired.

Test Program:
Finally, write a test program that generates a computer lab containing a collection of five Computers.  For research purposes, two of the machines will have discrete graphics cards, but the other will have integrated cards with varying features.  See below for specific Computer and VideoCard specifications.  Video cards should ONLY be created where appropriate based on their relationship to Computer.  

●	VideoCard 1:  Default VideoCard
●	VideoCard 2:  DiscreteVideoCard, PCIEx16 motherboard connection, 375W draw, 8-pin external power, 16 GB memory
●	VideoCard 3:  IntegratedVideoCard, 120W draw, 4 GB memory
●	VideoCard 4:  DiscreteVideoCard, PCIEx8 motherboard connection, 150W draw, 6-pin external power, 8GB memory
●	VideoCard 5:  IntegratedVideoCard, -110W draw, 3 GB memory

-	Generate the above collection of Video cards and, using a method that accepts an array of VideoCard, print info about each one to the Console.  
-	Any out-of-range values should be handled by the class implementation(s), not through manual changes to the test program.


Expected Output
Video Card Info:
Type:			integrated
Power:			100W
Memory:		1 GB

Shared Memory:	2 GB
Computer RAM:		false

Video Card Info:
Type:			discrete
Power:			200W
Memory:		12 GB

Connection:		PCIEx16
External Power:	8-pin

Video Card Info:
Type:			integrated
Power:			120W
Memory:		4 GB

Shared Memory:	2 GB
Computer RAM:		false

Video Card Info:
Type:			discrete
Power:			150W
Memory:		8 GB

Connection:		PCIEx8
External Power:	6-pin

Video Card Info:
Type:			integrated
Power:			75W
Memory:		3 GB

Shared Memory:	2 GB
Computer RAM:		false

 
Code
To simplify submission into a single Java file, use the provided template for your class.  Make changes to the class headers as necessary.
public class PAssign04 {
	public static void main(String[] args) {
// Create your Videocard instances here
	}
}

class VideoCard {
	// Implement VideoCard class here (outside of PAssign04 class)
}

class DiscreteVideoCard {
	// Implement DiscreteVideoCard class here (outside of PAssign04 class)
}

class IntegratedVideoCard {
	// Implement IntegratedVideoCard class here (outside of PAssign04 class)
}

Deliverables
Name your program PAssign04.java.  Programming Assignment 4 is to be individual work.  Submit the program by the due date specified. 

NOTE:  An image of your UML diagram should be submitted with the rest of your submission.

Use a utility similar to https://www.diffchecker.com/ and the Expected Output to compare your program’s output with the requested output.  Programming is in the details, so double check punctuation, spacing, and case if your output does not match.  When copying and pasting, be aware that Microsoft Word sometimes replaces normal quotes with Smart Quotes, which may need to be edited.
*/
}
