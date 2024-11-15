package solidprinciple.icp;
//When we write everything in a single interface, the class which implements this interface shpuld
//override all the methods, so its better have methods in different interface based on the functionality
public interface SoftwareDevelopment {

  void doCoding();
  void doDeployment();
  void doTesting();
}
