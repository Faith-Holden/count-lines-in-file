# count-lines-in-file
My solution for Chapter 11 Exercise 2 of “Introduction to Programming Using Java”.

Note: This program uses commandline arguments to supply the name of the text file. If the file name contains spaces, it must be enclosed in quotation marks.
For example "New Text Document.txt".

Problem Description:
Write a program that will count the number of lines in each file that is specified on the
command line. Assume that the files are text files. Note that multiple files can be specified,
as in:
java LineCounts file1.txt file2.txt file3.txt
Write each file name, along with the number of lines in that file, to standard output. If an
error occurs while trying to read from one of the files, you should print an error message
for that file, but you should still process all the remaining files. Do not use TextIO to
process the files; use a Scanner or a BufferedReader to process each file.
