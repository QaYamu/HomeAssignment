package solidprinciple.depinv;

import java.util.List;

public class Project {

  private List<Developer> developers = null;

  public Project(List<Developer> developers) {
    this.developers=developers;
  }


  public void deliverProject(){
    developers.forEach(Developer::develop);
  }
}