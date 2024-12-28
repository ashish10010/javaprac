package others;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class DoPayRoll {
  public static void main(String[] args) throws IOException {

    Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));

    for(int empNUm = 1; empNUm <=3; empNUm++)
    {
        payOneEmployee(diskScanner);
    }
    diskScanner.close();
  }    

  static void payOneEmployee(Scanner aScanner) {
    Employee anEmployee = new Employee();
    anEmployee.setName(aScanner.nextLine());
    anEmployee.setJobTitle(aScanner.nextLine());
    anEmployee.cutCheck(aScanner.nextDouble());
    aScanner.nextLine();
  } 
}