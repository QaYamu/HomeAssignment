package solidprinciple.depinv;

import java.util.ArrayList;
import java.util.List;



public class BankingProject {

  public static void main(String[] args) {
    FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
    BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    List<Developer> developers = new ArrayList<>();
    Project project = new Project(developers);
  }


}
