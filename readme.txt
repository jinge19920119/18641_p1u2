Project 1 - Unit 1    readme.txt

1.There are several files in it, class diagram,several input files, output as several output cases and src for code.

2.There are 5 packages in my program,adapter,exception, driver, model and util.Adapter has 2 interfaces, CreateAuto and UpdateAuto.One abstract class, ProxyAutomobile, will implements them. One empty class BuildAuto will extend it. Exception package has 2 classes, AutoException is a kind of exception that can be thrown and FixHelper for fixing problems. Model has 3 classes,Fleet, Automobile and OptionSet. All methods in OptionSet are protected, while all methods in Automobile are public in order to be called. OptionSet has an inner class called Option, in which all methods are protected as well.Fleet uses a linkedhashmap object to save all the Automobile objects. They are all because of capsulation. There are constructors and setters(for creating), getters and find functions(for reading), delete functions(for deleting value of a property) and updating(calling find and set functions). FileIO class in util package is mainly for reading from fil. Main function is in driver class. What’s more, some test cases are also in it.

3.There are 5 kinds of exceptions can be thrown and fixed here: 

Exception 1: File Not Found Exception
Exception 2:Missing data in input file
Exception 3: Missing baseprice in input file
Exception 4: Not all the model names are the same!!
Exception 5: There are some properties which have different values

4.All the comments and explanations of the project has been written in the code as comments.