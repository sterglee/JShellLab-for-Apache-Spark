# SparkLab: A MATLAB-like interface to Apache Spark with Java JShell 



## Installation

The installation of SparkLab is very simple: 

  * *Step 1* Download and unzip the .zip download.
  
  * *Step 2* Run the proper script for your platform, i.e. the .sh scripts for Unix like systems and the .bat scripts for Windows. 


## Building with Netbeans and ant

The SparkLab.zip download contains both the sources and all the relevant libraries to build SparkLab with ant.

To build SparkLab with Netbeans, simply specify the corresponding project to Netbeans.



## Building with Gradle and support for fat jar that supports the DeepLearning4j library and Apache Spark

To build SparkLab with *Gradle*, unzip the zipped file, go to the root folder where the contents are unzipped and type: 

 * gradle clean 
 
 * gradle jar
 
 
 The executable should be placed in the build/libs folder
 
Note that F7 executes the selected script code with the JShell.


## Project Summary

The SparkLab environment is based on JShellLab but offers preinstalled functionality for working with Apache Spark.



## SparkLab Developer

Stergios Papadimitriou

International Hellenic University

Dept of Informatics 

Kavala, Greece

email: sterg@cs.ihu.gr
