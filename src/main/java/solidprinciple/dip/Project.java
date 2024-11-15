package solidprinciple.dip;

public class Project {
  private FrontEndDeveloper fed;
  private BackEndDeveloper bed;
  public Project(FrontEndDeveloper fed, BackEndDeveloper bed){
    this.fed = fed;
    this.bed = bed;
  }

  public void deliverProject(){
    fed.developFrontEnd();
    bed.developBackEnd();
  }

}
