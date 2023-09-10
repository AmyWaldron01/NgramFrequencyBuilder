# NgramFrequencyBuilder
N-Gram Frequency Builder is a Java N-Gram Frequency Builder to get the N-Gram of characters found in a piece of text which is stored in a .txt file.

Installation: Please run Java -Xmx1G –cp ./ngrammer.jar ie.gmit.sw.Runner in Command Prompt whilst in the folder where the .JAR file is located.

Usage: Option 1: Choose File Dir of your .txt File.
E.g., C:\DSA_Project\DSA_Project\bin\books\BibleGod.txt

Option 2: Select N-Gram size. E.g., 1 N-Gram will count how many single letters there are and so on.

Option 3: Choose the output file name this will automatically create the file into .CSV.

Option 4: This will execute N-Gram Calculation and output file where .JAR file is located.

Option 5: Exit application.

Features:

• All Menu items are in the menu class.

• User Needs to enter valid items into all fields before N-gram is calculated.

• All characters other than the alphabet from A-Z are disregarded.

• White Space is disregarded.

• Every N-Gram is outputted to lowercase.

• All Big – O Notation is commented above Each loop.

• User does not need to enter .CSV when entering output Filename.

• Automatically sorts data into 2 rows within .CSV File.

• Terminal Progress meter is built-in for visual effect.

• Books folder will be included with various books.

• Paths and environmental variables are not hard-coded.

Output Example: (N-Gram of 1 using BibleGod.txt)

![image](https://github.com/AmyWaldron01/NgramFrequencyBuilder/assets/80962954/c4391a70-8307-42ea-bc4a-4a6b6dd49514)

Patrial screenshot of output.csv file.

![image](https://github.com/AmyWaldron01/NgramFrequencyBuilder/assets/80962954/b9c650df-7277-4d69-8009-7a124907ca7f)


Use the package name ie.gmit.sw and place the main() method in a class called Runner.

• Provide a simple command-line user interface that enables a user to specify the following:

A path and name for the directory of text files to process.
The size of the n-gram to use. A value in the range [1..5] is appropriate.
A path and name for the CSV file to output.
You can include as many other menu items as you wish and will be given marks for relevant functionality added. For example, you can easily add extra information to the CSV file like the probabilities for each character, restrict the range of characters based on an ASCII range, or strip out unwanted characters like whitespace.

• Build a frequency table for each unique lower-case n-gram in the text files. This involves creating a mapping of the lower-case n-grams to their frequency, i.e. a mapping of String → Long. This can be achieved creating an instance of Map<String, Long> frequency or something similar.

• Output the mapping of String → Long as a CSV file. A Comma Separated Values file is a plain text file that delimits the values on each row using a comma, e.g. a,7527664567 would appear on a row of its own.

• Contain comments for each method in your application stating its running time (in Big-O notation) and your rationale for its estimation.
