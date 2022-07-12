import java.util.Scanner;
class UsernameException extends Exception {
public UsernameException(String msg) {
 super(msg);
}}
class PasswordException extends Exception {
public PasswordException(String msg) {
 super(msg);
}}
public class Check {
public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 String username, password;
 
 System.out.print("Enter username :: ");
 username = s.nextLine();
 
 System.out.print("Enter password :: ");
 password = s.nextLine();
 
 int length = username.length();
 
 try {
 if(length < 6)
 throw new UsernameException("Username must be greater than 6 
characters ???");
 else if(!password.equals("123456"))
 throw new PasswordException("Incorrect password\nType correct 
password ???");
 else
Date:- Object Oriented Programming Lab
56 | P a g e
 System.out.println("Login Successful !!!");
 }
 catch (UsernameException u) {
 u.printStackTrace();
 }
 catch (PasswordException p) {
 p.printStackTrace();
 }
 finally {
 System.out.println("The finally statement is executed");
 }}}
