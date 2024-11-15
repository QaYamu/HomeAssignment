package solidprinciple.lsp;

import java.util.logging.Logger;
/*
problem with this class is, penguin will not fly, but its extending birds because of that
it should inherit the method of bird,even there is no need, here we can apply liskov principle.

 */
public class Penguin extends Bird{
  private static final Logger logger = Logger.getLogger(Penguin.class.getName());
  @Override
  void fly() {
    logger.info("Penguin fly");
  }
}
