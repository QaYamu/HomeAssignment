package solidprinciple.alsp;

import java.util.logging.Logger;



public class Penguin extends NonFlyingBird {
  private static final Logger logger = Logger.getLogger(Penguin.class.getName());


  @Override
  void swim() {
    logger.info("Penguin swim");

  }
}
