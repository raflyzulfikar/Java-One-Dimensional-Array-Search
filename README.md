# Java Exercise: Value Lookup in a One-Dimensional Array

## Project Description
   This project is a simple Java program designed to find the presence of a particular value in a specified one-dimensional array. The program prompts the user to     enter the value to search for. If the value is found in the array, the program will display the index of its first occurrence. If the value is not found, the       program will notify the user that the value is not in the array.
*(Please note: Some parts of the codebase, including variable names, are written in Indonesian for clarity among local developers).*
## Functionality
   * Defines a one-dimensional integer array with initial values.
   * Displays the contents of the array to the user.
   * Accepts target value input from the user.
   * Performs an iteration (loop) to check each element of the array.
   * Displays the first index if the value is found.
   * Displays a “tidak ditemukan” message if the value does not exist in the array.
## How it Works
   1.	The program initializes an array `int[] array = {5, 10, 15, 20, 25};`.
   2.	The user is prompted to enter the value to search for.
   3.	The program searches for the value in the array.
   4.	If the value is found, the program stops the search and displays the index.
   5.	If the loop completes and the value is not found, a “tidak ditemukan” message will be displayed.
## Project Structure
The project consists of a single Java file:
```
. 
└── src/ 
    └── GanjilGenap.java 
└── README.md
```
## Usage Example (Console Output)
   **Scenario 1: Value Found**
   Array: 5 10 15 20 25 
   Masukkan nilai yang ingin dicari: 5
   Nilai 5 ditemukan pada indeks: 0
   Nilai dalam array yang tidak habis dibagi 0: 5 10 15 20 25
   **Scenario 2: Value Not Found**
   Array: 5 10 15 20 25 
   Masukkan nilai yang ingin dicari: 7
   Nilai 7 tidak ditemukan dalam array.
   Nilai dalam array yang tidak habis dibagi 0: 5 10 15 20 25 
## How to Run a Project
To run this program, you need to have the Java Development Kit (JDK) installed on your system.
   1.	**Prepare Files**
      Make sure the file `GanjilGenap.java` is inside the `src/` folder inside your project directory.
   2.	**Code Compilation**
      Open your terminal or command prompt, navigate to the project root directory (`your-project-folder-name/`), then compile the Java file:
 
      javac src / GanjilGenap.java
 
   3.	**Run the Program**
      Once successfully compiled, you can run the program:

      java -cp src GanjilGenap
      
## Important Notes
* **Class Name:** The current class name `GanjilGenap.java` does not directly represent the main functionality of the program which focuses on searching for values in arrays. For better clarity, the class name could be considered to be changed to something more descriptive, such as `ArraySearch.java` or `ArrayValueSearch.java`.
* **Additional Output:** The line `System.out.print(“Nilai dalam array yang tidak habis dibagi 0:”);` at the end of the `main()` method is not related to the array search functionality requested in the problem. This line may be a leftover from a previous code experiment or a different purpose. To focus on the problem solution, this line can be removed.
