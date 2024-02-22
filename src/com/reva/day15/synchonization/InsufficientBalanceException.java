package com.reva.day15.synchonization;
public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException()
	{
		super("Insufficient balance in your account");
	}
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}