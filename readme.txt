Call Details Project
--------------------

This is a simple reports generation project which can be used to generate different formats of reports.(Eg: pdf, csv, text etc..)

This also lets us add the various types of reports generators in the future. 

Here I have used the Factory Design Pattern so that adding various reports formats will be easy and can be done without altering a lot of code.

Explanation:
------------

If you want to add another reporting format do the following:
	-- Create a class for whatever type of report that needs to be generated and implement the interface ReportGenerator under com.abc.calldetails.reportGenerator.reportGeneratorImpl.
	-- Overide the generateReport() and write the business logic for the type of report to be generated
	-- In com.abc.calldetails.ReportGeneratorFactory.java check for the type of report that needs to genrated and call that particular object.
	

Project SetUp:
--------------

1. Import the project to eclipse.
2. Create a directory in "D:/Test"
3. Run the application
4. Navigate to "D:/Test" and open the text file "Call Details report for Given Duration" to view the report.

