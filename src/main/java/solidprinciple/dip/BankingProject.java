package solidprinciple.dip;

public class BankingProject {


  public static void main(String[] args) {
    FrontEndDeveloper fed = new FrontEndDeveloper();
    BackEndDeveloper bed = new BackEndDeveloper();
    Project pr = new Project(fed, bed);
    pr.deliverProject();
  }

}
