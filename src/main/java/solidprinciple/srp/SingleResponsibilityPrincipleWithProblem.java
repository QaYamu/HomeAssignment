package solidprinciple.srp;

/*

problem with this class is, it performs more than one responsibility, so its not a good practice.

//To achieve that splitting this into two different class each performs one sole responsibility.
 */
public class SingleResponsibilityPrincipleWithProblem {

  public static void main(String[] args) {

  }

  public void launchBrowser(){
    System.out.println("Launching browser...");
  }

  public void log(){
    System.out.println("Logging...");
  }

}
