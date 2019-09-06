package org.exoplatform.addons.services;

import org.exoplatform.container.ExoContainerContext;
import org.exoplatform.container.PortalContainer;
import org.picocontainer.Startable;
import org.exoplatform.services.log.*;

/**
 * Created by eXo Platform SAS.
 *
 */

public class MyStartableService implements Startable {
  /**
   * The logger.
   */
  private static final Log LOG = ExoLogger.getExoLogger(MyStartableService.class);

  public MyStartableService() {

  }

  @Override
  public void start() {
    LOG.info("&&&&&&&&&&&& My Startable service started !");

  }

  @Override
  public void stop() {
    LOG.info("&&&&&&&&&&&& My Startable service stopped !");
  }
}
