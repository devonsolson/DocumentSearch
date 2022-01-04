The goal of this exercise is to create a working program to search a set
of documents for the given search term or phrase (single token), and 
return results in order of relevance. 

Relevancy is defined as number of times the exact term or phrase 
appears in the document. 

Create three methods for searching the documents: 
1. Simple string matching
2. Text search using regular expressions
3. Preprocess the content and then search the index

Prompt the user to enter a search term and search method, execute 
the search, and return results. For instance:
 
Three files have been provided for you to read and use as sample 
search content.

Run a performance test that does 2M searches with random search 
terms, and measures execution time. Which approach is fastest? Why?
Provide some thoughts on what you would do on the software or 
hardware side to make this program scale to handle massive content 
and/or very large request volume (5000 requests/second or more).

The application was built in Visual Studio Code (1.63.2 (Universal)) with Node.js: 14.16.0 on January 4th 2022.
You will also need Extension Pack for Java v0.20.0 by Microsoft in order to run the application.

To run -
1. import the project into Visual Studio Code
2. Run main function located in Main.java
3. Utilize console window below to answer prompted questions
    a. Enter the search term: <user enters search term>
    b. Search Method: 1) String Match 2) Regular Expression 3) Indexed
    c. read outputs from console window

This application utilizes JavaScript which I have been using for the past two years when writing full-stack. I have been using C# and Javascript throughout my professional career. Utilizing Javascript shows my ability to understand some of its core functionality and features where they are found useful. In this project, I utilize different string manipulations, scanners, output, and algorithms to accomplish the task at hand.