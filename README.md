# Calculator

##Description
Calculator application that performs basic arithmetic operations such as add, subtract, multiply and divide. 

##Instructions for running Calculator App

###System Requirements

1. Java 8 installed
2. Maven installed
3. Test cases require JUnit

###Run the Application

1. Download the code from github and navigate to the project directory.
2. To build the project run
		 "mvn clean install"

3. Executable JAR will be created in the "target" folder under project directory.
4. Navigate to target folder.
5. Run the command in following format "java -jar calculator-0.0.1-SNAPSHOT.jar [Number1] [Operation] [Number2]"
   For Example:
   To perform ADD operation, execute the command as : java -jar calculator-0.0.1-SNAPSHOT.jar 1.0 + 2.0
   Result will be displayed on the console.
6. As * is a wildcard character, please perform the multiplication operation as follows :
   java -jar calculator-0.0.1-SNAPSHOT.jar 9.0 "*" 8.0
