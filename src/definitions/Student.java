/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfTheBooksIssued;

    public Student(String firstName, String middleName, String lastName, long universityRollNumber, int numberOfBooksIssued) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.namesOfTheBooksIssued = new Book[numberOfBooksIssued];
    }


    /**
     * This method returns the first name of the student.
     *
     * @return The first name of the student.
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method returns the middle name of the student.
     *
     * @return The middle name of the student.
     */

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * This method returns the last name of the student.
     *
     * @return The last name of the student.
     */

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method returns the university roll number of the student.
     *
     * @return The university roll number of the student.
     */

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    /**
     * This method returns the number of books issued by  the student.
     *
     * @return The number of books issued by  the student.
     */

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    /**
     * This method returns the names of the books issued by the student.
     *
     * @return The names of the books issued by the student
     */

    public Book[] getNamesOfTheBooksIssued() {
        return namesOfTheBooksIssued;
    }

    public void setNamesOfTheBooksIssued(Book[] namesOfTheBooksIssued) {
        this.namesOfTheBooksIssued = namesOfTheBooksIssued;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", namesOfTheBooksIssued=" + Arrays.toString(namesOfTheBooksIssued) +
                '}';
    }
}
