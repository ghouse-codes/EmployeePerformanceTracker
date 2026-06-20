Employee Performance Tracker

A simple Java console program that processes a small set of employee performance scores and prints out some basic statistics — totals, averages, top/bottom performers, rankings, and a simple search.

This started as a learning exercise to practice working with arrays and loops in Java, so don't expect anything fancy — just clean, straightforward logic.

What it does

When you run the program, it will:


Print each employee's name alongside their score
Calculate the total and average score across all employees
Find the top-performing employee (highest score)
Find the lowest-performing employee (lowest score)
Search for a specific employee by name and print their score
Print the employee list in reverse order
Bucket employees into performance tiers: Excellent (90+), Good (80-89), and Average (below 80)
Find the highest and second-highest scores
Find the lowest and second-lowest scores


Example output

ghouse:85
mohamed:92
moahmed ghouse:78
ghouse mohamed:95

total of sum:350
total of average:87.0

topempolyees:ghouse mohamed
topscores:95

lowempolyee:moahmed ghouse
lowscore:78

element is found
name:ghouse
score:85

reverse ranking
ghouse mohamed:95
moahmed ghouse:78
mohamed:92
ghouse:85

exceellent empolyees:2
good empolyees:2
average empolyees:0

Highest Score: 95
Second Highest Score: 92

lowest Score: 95
Second lowest Score: 92

Getting started

Requirements


Java JDK 8 or later installed on your machine
VS Code (with the Java Extension Pack) was used to build and test this project, though any IDE or text editor will work fine


Running it


Clone the repo:


bash   git clone https://github.com/ghouse-codes/EmployeePerformanceTracker.git
   cd EmployeePerformanceTracker


Compile and run:


bash   javac main.java
   java main

Concepts used

This project was mainly built to practice core Java fundamentals. Concepts used include:


Arrays — storing employee names and scores in parallel arrays
For loops — standard indexed loops for iterating and comparing values
Enhanced for loops (for-each) — used for simpler iterations like summing scores and bucketing performance tiers
Conditional statements (if / else if / else) — used for comparisons like finding max/min values and sorting employees into tiers
String concatenation — building formatted output for System.out.println
Boolean flags — tracking whether a search match was found
Break statement — exiting a loop early once a search match is found
Type casting / data types — working with int, double, String, and boolean together, including converting an integer sum into an average
Basic algorithm patterns — linear search, finding min/max, and finding second-highest/second-lowest values using running comparisons


Possible improvements

A few ideas if this gets built out further:


Pull employee data from a file or simple database instead of hardcoding it
Add input validation and proper exception handling
Break the logic into separate methods (or classes) instead of one long main
Add unit tests
Fix the naming typos (empolyees, topempolyees, exceellent, etc.) for readability


Contributing

This is a small personal/learning project, but suggestions and pull requests are welcome if you spot something worth improving.

License

No license has been specified yet. Feel free to reach out if you'd like to use this code and need clarity on usage terms.
