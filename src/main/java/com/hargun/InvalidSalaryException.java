package com.hargun;

public class InvalidSalaryException  extends Exception
{
    public InvalidSalaryException()
    {
        super("invalid salary");

    }

    public InvalidSalaryException(String message)
    {
        super(message);
    }
}
