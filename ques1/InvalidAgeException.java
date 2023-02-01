package ques1;

import java.util.Scanner;

public class InvalidAgeException extends Exception
{
    // Declare a parameterized exception with string str as a parameter.
    InvalidAgeException(String str)
    {
        super(str);
    }
}

class TestClass
{
    private static int age;
    static void validate() throws InvalidAgeException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = sc.nextInt();

        if(age < 18)
            throw new InvalidAgeException("Invalid Age, Your age is less than 18..");
        else
            System.out.println("Welcome to College..");
    }
    public static void main(String[] args)
    {
        try
        {
            validate();
        }
        catch(Exception e)
        {
            System.out.println("Caught an Exception : \n "+e);
        }
    }
}//trial
