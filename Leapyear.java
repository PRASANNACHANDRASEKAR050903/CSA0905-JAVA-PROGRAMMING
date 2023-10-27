import java.util.*;
class Leapyear {

  public static void main(String[] args) {
    int year,date,month;
    Scanner s=new Scanner(System.in);
    System.out.println("enter date:");
    date=s.nextInt();
    System.out.println("enter month:");
    month=s.nextInt();
    System.out.println("enter year:");
    year=s.nextInt();
    System.out.println("date is:"+date+"/"+month+"/"+year);
    if (year % 400 == 0) {
      System.out.println(year + " is a leap year.");
    } 
    else if (year % 100 == 0) {
      System.out.println(year + " is not a leap year.");
    } 
    else if (year % 4 == 0) {
      System.out.println(year + " is a leap year.");
    } 
    else {
      System.out.println(year + " is not a leap year.");
    }
  }
}
